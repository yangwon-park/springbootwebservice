package com.jojoldu.admin.domain.posts;

import com.jojoldu.admin.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


// Entity 자체를 절대 Request, Response 클래스로 사용해선 안 됨
// => Entity 클래스와 Controller에서 쓸 DTO는 분리해서 사용
@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    // columnDefinition = "TEXT" => default값을 TEXT로 지정
    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
    
}
