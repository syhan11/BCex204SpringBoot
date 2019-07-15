package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class HomeCtrl {
    @GetMapping("/form")
    public String getInfo(Model model){
        model.addAttribute("car", new Car());
        return "getCarInfo";
    }

    @PostMapping("/form")
    public String displayInfo(@Valid Car car, BindingResult result) {
        if (result.hasErrors())
            return "getCarInfo";
        return "displayCarInfo";
    }
}
