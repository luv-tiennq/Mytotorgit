package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @Value("${LABEL_MH01_TOP}")
    private String labelTop;

    @Value("${LABEL_MH01_USERNAME}")
    private String labelUserName;

    @Value("${LABEL_MH01_PASSWORD}")
    private String labelPassword;

    @Value("${LABEL_MH01_BTN_LOGIN}")
    private String labelBtnLogin;


    @GetMapping("/LABEL")
    public String create(Model model) {
        model.addAttribute("LABEL_MH01_BTN_LOGIN", labelBtnLogin);
        return "Label";
    }
}
