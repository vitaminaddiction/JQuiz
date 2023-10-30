package com.lhj.quiz.JQuiz.account;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Account {
    private int idx;
    private String id;
    private String password;
    private String name;
    private int age;
}
