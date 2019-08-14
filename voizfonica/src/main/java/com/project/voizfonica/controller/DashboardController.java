package com.project.voizfonica.controller;

import com.project.voizfonica.data.DashboardRepository;
import com.project.voizfonica.data.SignUpRepository;
import com.project.voizfonica.model.Dashboard;
import com.project.voizfonica.model.Login;
import com.project.voizfonica.model.SignUp;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/dashboard")
@SessionAttributes("login")
public class DashboardController {
    private SignUpRepository signUpRepository;

    private DashboardRepository dashrepo;
    @Autowired
    public DashboardController(SignUpRepository signUpRepository){
        this.signUpRepository=signUpRepository;
    }


    @GetMapping
    public String rundashboard(Model model, @SessionAttribute Login login)
    {

        List<SignUp> dashboard1=new ArrayList<>();
        dashboard1=signUpRepository.findByContact(login.getContact());
        model.addAttribute("loginContact",dashboard1);

        return "dashboard";
    }
}
