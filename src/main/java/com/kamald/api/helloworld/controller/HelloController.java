package com.kamald.api.helloworld.controller;

import com.kamald.api.helloworld.dto.ApiResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HelloController {

    @GetMapping("/hello/{name}")
    public ResponseEntity<ApiResponse> get(@PathVariable("name") String name, HttpServletRequest request) {
        return ResponseEntity.ok().body(ApiResponse.builder()
                .data(ApiResponse.Data.builder()
                        .path(request.getRequestURI())
                        .message("This is API response is " + name)
                        .date(new Date()).build()
                ).build()
        );
    }

}
