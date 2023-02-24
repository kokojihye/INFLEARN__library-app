package com.group.libraryapp.dto.user.request;

public class UserCreateRequest {

    private String name;
    private Integer age; //int(eger) -> null 표현 불가능, Integer -> null 표현O

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
