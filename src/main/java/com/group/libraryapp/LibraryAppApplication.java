package com.group.libraryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //자동으로 설정을 해주는 어노테이션
public class LibraryAppApplication {

  public static void main(String[] args) {
    //스프링 어플리케이션(서버)을 실행시킴
    SpringApplication.run(LibraryAppApplication.class, args);
    System.out.println("Server is running . . . ");
  }

}
