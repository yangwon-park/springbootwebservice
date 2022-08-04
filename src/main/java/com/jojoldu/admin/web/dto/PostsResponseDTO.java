package com.jojoldu.admin.web.dto;

import com.jojoldu.admin.domain.posts.Posts;
import lombok.Getter;

// 엔티티 필드 중 빌부만 사용
@Getter
public class PostsResponseDTO {

    private Long id;
    private String title;
    private String content;
    private String author;

    public PostsResponseDTO(Posts entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
    }
}
