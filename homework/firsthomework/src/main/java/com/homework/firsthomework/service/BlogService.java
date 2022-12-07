package com.homework.firsthomework.service;

import com.homework.firsthomework.dto.BlogRequestDto;
import com.homework.firsthomework.entity.Blog;
import com.homework.firsthomework.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BlogService {

    private final BlogRepository blogRepository;
    @Transactional
    public List<Blog> getBlogAll() {
        return blogRepository.findAllByOrderByModifiedAtDesc();
    }

    @Transactional
    public Blog createBlog(BlogRequestDto requestDto) {
        Blog blog = new Blog(requestDto);
        blogRepository.save(blog);
        return blog;
    }

    public Optional<Blog> findBlogById(Long id) {
        return Optional.ofNullable(blogRepository.findById(id).orElseThrow(
                () ->new IllegalArgumentException("선택한 블로그가 존재하지 않습니다.")
        ));
    }
    @Transactional(readOnly = true)
    public List<Blog> getBlogs() {
        return blogRepository.findAllByOrderByModifiedAtDesc();
    }
    @Transactional
    public Long update(Long id, BlogRequestDto requestDto) {
        Blog blog = blogRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("수정할 블로그가 존재하지 않습니다.")
        );
        blog.update(requestDto);
        return blog.getId();
    }
    @Transactional
    public Long deleteBlog(Long id, BlogRequestDto requestDto) {

        Blog blog = blogRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("삭제할 블로그가 없습니다.")
        );
        if(!blog.getPassword().equals(requestDto.getPassword())){
            throw new IllegalArgumentException("비밀번호가 틀립니다.");
        }
        blogRepository.deleteById(id);
        return id;
    }
}
