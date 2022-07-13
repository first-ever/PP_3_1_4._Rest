package ru.kata.spring.boot_security.demo.restControllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/admin")
    public String adminPage() {
        return "adminPage";
    }

    @GetMapping("/user")
    public  String userPage() {
        return "userPage";
    }
}
