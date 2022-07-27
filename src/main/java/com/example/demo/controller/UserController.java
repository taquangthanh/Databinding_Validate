package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    @GetMapping
    public String index(Model model){
        model.addAttribute("user",new User());
        return "form";
    }
    @PostMapping("formInfo")
    public String showInfo(@Valid @ModelAttribute(name = "user")User user, BindingResult result,Model model){
        System.out.println(user);
        try{
            if(result.hasErrors()){
                System.out.println("Lỗi");
                return "form";
            }
            System.out.println(user.getName());
            return "info";
        }catch (Exception e){
            return "form";
        }
    }
}
