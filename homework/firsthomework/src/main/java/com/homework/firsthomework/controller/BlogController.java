package com.homework.firsthomework.controller;

import com.homework.firsthomework.dto.BlogRequestDto;
import com.homework.firsthomework.entity.Blog;
import com.homework.firsthomework.service.BlogService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
@RequiredArgsConstructor
public class BlogController {

    private final BlogService blogService;

    @GetMapping("/api/blogs")
    public List<Blog> getBloglist() {
        return blogService.getBlogAll();
    }

    //POST방식이기 때문에 body가 존재하고 그 body 안에 원하는 저장해야되는 값들이 넘어오기 때문에 @RequestBody사용
    @PostMapping("/api/blogs")
    public Blog createBlog(@RequestBody BlogRequestDto requestDto) {

        return blogService.createBlog(requestDto);
    }

    @GetMapping("/api/blogs/{id}")
    public Optional<Blog> findBlog(@PathVariable Long id) {
        return blogService.findBlogById(id);
    }

    @PutMapping("/api/blogs/{id}")
    public Long updateBlog(@PathVariable Long id, @RequestBody BlogRequestDto requestDto) {
        return blogService.update(id, requestDto);
    }

    @DeleteMapping("/api/blogs/{id}")
    public Long deleteBlog(@PathVariable Long id, @RequestBody BlogRequestDto requestDto) {
        return blogService.deleteBlog(id, requestDto);
    }
}