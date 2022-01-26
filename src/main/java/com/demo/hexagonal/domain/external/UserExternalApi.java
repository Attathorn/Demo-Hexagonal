package com.demo.hexagonal.domain.external;

import com.demo.hexagonal.infrastracture.model.response.GetDataResponse;

public interface UserExternalApi {
    GetDataResponse getUser();
    GetDataResponse getUser(String seed);
}
