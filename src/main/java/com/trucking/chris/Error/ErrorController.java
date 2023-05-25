package com.trucking.chris.Error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;

public class ErrorController {
    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
    Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

    if (status != null) {
        Integer statusCode = Integer.valueOf(status.toString());

        if(statusCode == HttpStatus.NOT_FOUND.value()) {
            return "redirect:/";
        }

    
        else if(statusCode == HttpStatus.UNAUTHORIZED).value()) {
            return "redirect:/";
        }  
    }
    return "redircet:/";

    } 
}
