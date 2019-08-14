package com.project.voizfonica.controller;

import com.project.voizfonica.data.HelpAndSupportRepository;
import com.project.voizfonica.model.HelpAndSupport;
import com.project.voizfonica.model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/help&support")
@SessionAttributes("login")

public class HelpAndSupportController {

    @Autowired
    private HelpAndSupportRepository helpAndSupportRepository;

    @GetMapping
    public String gethelp(Model model){
        model.addAttribute("helpandsupport",new HelpAndSupport());
        return "help&support";
    }
    @PostMapping
    public String post(@SessionAttribute Login login, @Valid HelpAndSupport helpAndSupport, Errors errors, Model model){
        if(errors.hasErrors()){
            return "redirect:/help&support";
        }
        helpAndSupport.setMobile_no(login.getContact());
        helpAndSupportRepository.save(helpAndSupport);

        return "redirect:/dashboard";
    }


}