package com.spongeli.service.config.exception;

import com.spongeli.service.common.exception.SystemException;
import com.spongeli.service.common.system.CommonResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionHanlerConfig {
    @ExceptionHandler(SystemException.class)
    @ResponseBody
    public CommonResponse exceptionHandler(SystemException e) {
        return new CommonResponse(e.getStatus(), e.getMessage(), null);
    }
}
