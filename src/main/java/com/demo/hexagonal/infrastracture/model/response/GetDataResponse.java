package com.demo.hexagonal.infrastracture.model.response;

import com.demo.hexagonal.infrastracture.model.Info;
import com.demo.hexagonal.infrastracture.model.Result;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
public class GetDataResponse implements Serializable {
    public GetDataResponse() {}

    private List<Result> results;
    private Info info;


}
