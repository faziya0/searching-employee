package com.employee.exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@RestController
public class ErrorHandler implements ErrorController {
@Autowired
ErrorAttributes errorAttributes;


    @RequestMapping("/error")
    public ApiError errorHandler(WebRequest webRequest){
        Map<String,Object> errorAttributes=this.errorAttributes.getErrorAttributes(webRequest, ErrorAttributeOptions.of(ErrorAttributeOptions.Include.MESSAGE));
      Integer status=(Integer)errorAttributes.get("status");
        String message=(String)errorAttributes.get("message");
        String path=(String)errorAttributes.get("path");
        ApiError apiError = new ApiError(message,status,path);
        return apiError;

    }
}
