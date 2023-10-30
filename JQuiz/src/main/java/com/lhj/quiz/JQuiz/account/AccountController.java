package com.lhj.quiz.JQuiz.account;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("account")
public class AccountController {
    @GetMapping("loginform")
    public String login(){
        return "account/loginform";
    }
}
