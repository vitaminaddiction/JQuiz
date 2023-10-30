package com.lhj.quiz.JQuiz.account;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AccountRepository {
    public Account login(String id, String password);

}
