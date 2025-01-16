//tidak dipake sepertinya

package com.example.TugasBesar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String index() {
        // if(session.getAttribute("user") != null){
        //     return "/member/home-member";
        // }
        return "guest/home";
    }

    @GetMapping("/member")
    @RequiredRole(value = "member")
    public String memberPage() {
        return "/member/home-member";
    }

    @GetMapping("/admin")
    @RequiredRole(value = "admin")
    @ResponseBody
    public String adminPage() {
        return "/admin/home-admin";
    }
}