package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";  /*파일경로 추가(링크 주소 만들기)*/
    }

    @PostMapping("/article/create") /*URL 요청 접수부분*/
    public String createArticle(ArticleForm form) { /*메서드 생성 및 반환값 작성 및 폼 데이터를 DTO로 받기*/
        System.out.println(form.toString());    /*DTO에 폼 데이터가 잘 담겼는지 확인하기*/
        return "";
    }
}


