package com.homework.firsthomework.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequiredArgsConstructor
public class BlogController {

    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("index");
    }
}
