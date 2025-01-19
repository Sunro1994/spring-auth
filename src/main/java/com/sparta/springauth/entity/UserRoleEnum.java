package com.sparta.springauth.entity;

/**
 * User라는 열거된 상수가 있고 해당 값을 생성시 괄호 안의 값이 등록된다.
 * Authority라는 스태틱 클래스(내부 클래스)를 생성하여 중복 선언을 방지하 코드의 가독성을 높인다.
 * 생성자로 생성된 값은 getAuthority를 통해 가져올 수 있다.
 */

public enum UserRoleEnum {
    USER(Authority.USER),  // 사용자 권한
    ADMIN(Authority.ADMIN);  // 관리자 권한

    private final String authority;

    UserRoleEnum(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return this.authority;
    }

    public static class Authority {
        public static final String USER = "ROLE_USER";
        public static final String ADMIN = "ROLE_ADMIN";
    }
}