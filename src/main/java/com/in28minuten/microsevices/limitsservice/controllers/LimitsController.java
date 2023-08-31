package com.in28minuten.microsevices.limitsservice.controllers;

import com.in28minuten.microsevices.limitsservice.configs.LimitsConfiguration;
import com.in28minuten.microsevices.limitsservice.entities.Limits;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LimitsController {
    @Autowired
    private LimitsConfiguration configuration;

    @GetMapping("/limits")
    public Limits retrieveLimits() {
        return new Limits(configuration.getMinimum(),
                configuration.getMaximum());
//		return new Limits(1,1000);
    }
}
