                    /*Form 파일에서 DTO 최초 생성*/
            /* @@  DTO  @@  =  폼 데이터를 받아올 그릇을 뜻한다.
                폼 데이터에서 DTO(컨트롤러) 서버로 데이터 전송*/

package com.example.firstproject.dto;

public class ArticleForm {
    /* 폼 데이터를 잘 받았는지 확인*/
    private String title; /*제목을 받을 필드*/
    private String content; /*내용을 받을 필드*/

    public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

