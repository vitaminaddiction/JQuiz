package com.lhj.quiz.JQuiz.quiz;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("quiz")
public class QuizController {
    @GetMapping("main")
    public String mainView(){
        return "quiz/main";
    }
}
