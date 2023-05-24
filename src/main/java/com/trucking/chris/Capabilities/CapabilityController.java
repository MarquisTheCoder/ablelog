package com.trucking.chris.Capabilities;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CapabilityController {
    @GetMapping("/services")
    public String services(){
        return "services";
    }
}
