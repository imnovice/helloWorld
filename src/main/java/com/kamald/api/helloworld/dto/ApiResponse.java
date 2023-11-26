package com.kamald.api.helloworld.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Builder
@Setter
@Getter
public class ApiResponse {

    private Data data;

    @Builder
    @Setter
    @Getter
    public static class Data {
        private String message;
        private Date date;
        private String path;
    }

}
