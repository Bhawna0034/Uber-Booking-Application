package com.bhawna.project.uber.uberApp.advices;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
public class ApiError {

    private LocalDateTime timeStamp;
    private String message;
    private HttpStatus status;
    private List<String> subErrors;


}
