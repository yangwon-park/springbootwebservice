package com.jojoldu.admin.config.auth.dto;

import com.jojoldu.admin.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

// 직렬화를 구현
// User 엔티티에 직접적으로 직렬화를 구현하면 유지보수에서 후달림
// 직렬화 기능을 가진 세션 DTO를 추가로 하나 만드는 것이 좋음
@Getter
public class SessionUser implements Serializable {

    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
