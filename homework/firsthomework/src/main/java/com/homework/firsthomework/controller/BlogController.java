package com.homework.firsthomework.controller;

import com.homework.firsthomework.dto.BlogRequestDto;
import com.homework.firsthomework.entity.Blog;
import com.homework.firsthomework.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequiredArgsConstructor
public class BlogController {

    private final BlogService blogService;

    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("index");
    }

    @PostMapping("/api/blogs")
    public Blog createBlog(@RequestBody BlogRequestDto requestDto) {

        return blogService.createBlog(requestDto);
    }
        //POST방식이기 때문에 body가 존재하고 그 body 안에 원하는 저장해야되는 값들이 넘어오기 때문에 @RequestBody사용
}
