package com.lhj.quiz.JQuiz.account;

import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AccountReq {
    private int idx;

    @NotEmpty
    private String id;

    @NotEmpty
    private String password;

    private String name;

    private int age;
}
