package com.jojoldu.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

// 메인 클래스
// @SpringBootApplication이 있는 위치부터 부트의 설정을 읽어감
// 따라서 이 클래스는 항상 프로젝트의 최상단에 위치해야 함

@EnableJpaAuditing
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
