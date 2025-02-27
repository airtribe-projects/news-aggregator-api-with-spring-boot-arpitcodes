package com.news.aggregator.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/preferences")
public class PreferenceController {
    @GetMapping
    public String getPreferenceOfLoggedInUser(){
        return "The controller is under progress.";
    }
    @PutMapping
    public String editPreferenceOfLoggedInUser(){
        return "The controller is under progress.";
    }
}
