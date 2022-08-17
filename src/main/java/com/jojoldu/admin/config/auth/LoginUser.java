package com.jojoldu.admin.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER)          // 어노테이션이 생설될 수 있는 위치 설정
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {
}
