package com.group.libraryapp.domain.user;
public class User {
    //User 객체 생성 클래스
    private String name;
    private Integer age;

    public User(String name, Integer age) {
        if(name == null || name.isBlank()){
            //잘못된 형태의 이름 경고(-> 이름은 null이 될 수 없다는 요구사항 만족하기 위한 예외처리)
            throw new IllegalArgumentException(String.format("잘못된 name(%s)이 들어왔습니다.", name));
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}
