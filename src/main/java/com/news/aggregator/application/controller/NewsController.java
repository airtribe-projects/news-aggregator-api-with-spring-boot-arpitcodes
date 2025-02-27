package com.news.aggregator.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/news")
public class NewsController {
    @GetMapping
    public String getNewsForLoggedInUser(){
        return "development under progress.";
    }
}
