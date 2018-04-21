package com.note;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NoteApplication {
    private String test = "使用find in path";

    public static void main(String[] args) {
        SpringApplication.run(NoteApplication.class, args);
    }
}
