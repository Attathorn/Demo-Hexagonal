package com.demo.hexagonal.infrastracture.external;

import com.demo.hexagonal.domain.external.UserExternalApi;
import com.demo.hexagonal.infrastracture.model.response.GetDataResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Slf4j
@Component
public class UserExternalApiImpl implements UserExternalApi {

    @Value("${external.randomUser.url}")
    private String randomUserUrl;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public GetDataResponse getUser() {
        return restTemplate
                .exchange(randomUserUrl,
                        HttpMethod.GET,
                        null,
                        GetDataResponse.class)
                .getBody();
    }

    @Override
    @Cacheable(value = "user",key = "#seed", unless = "#result == null")
    public GetDataResponse getUser(String seed) {
        log.info("Get Data From Api");
        String url = UriComponentsBuilder
                .fromUriString(randomUserUrl)
                .queryParam("seed", seed)
                .build().toUriString();

        return restTemplate
                .exchange(url,
                        HttpMethod.GET,
                        null,
                        GetDataResponse.class)
                .getBody();
    }
}
