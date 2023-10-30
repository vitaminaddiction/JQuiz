package com.lhj.quiz.JQuiz.account;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("account")
public class AccountController {

    @Autowired
    AccountRepository accountRepository;

    @GetMapping("loginform")
    public String login(Model model, AccountReq accountReq){
        return "account/loginform";
    }

    @PostMapping("loginproc")
    public String loginproc(Model model, @Valid AccountReq accountReq, BindingResult result){

        System.out.println(accountReq);

        if(result.hasErrors()){
            return "account/loginform";
        }


        if(accountReq != null){
            return "redirect:/";
        }
        else{
            return "account/loginform";
        }


    }


}
