package com.doa.doa.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    //기본 페이지 요청 메서드
    @GetMapping("/")
    public String index(){
        return "index"; // templetes 폴더의 index.html을 찾아감

    }

    @GetMapping("member/signup")
    public String signup(){
        return "member/signup"; // signup.html 페이지로 이동

    }
    @GetMapping("member/login")
    public String login(){
        return "member/login"; //login.html 페이지로 이동
    }
}
