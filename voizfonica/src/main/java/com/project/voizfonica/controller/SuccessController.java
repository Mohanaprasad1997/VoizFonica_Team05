package com.project.voizfonica.controller;

import com.project.voizfonica.data.OrderRepository;
import com.project.voizfonica.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/invoicesuccess")
@SessionAttributes("order")
public class SuccessController {
    private OrderRepository orderRepository;
    @Autowired
    public SuccessController(OrderRepository orderRepository){
        this.orderRepository=orderRepository;
    }
    @GetMapping
    @ModelAttribute
    public String show_success(Model model, @SessionAttribute Order order){
        model.addAttribute("bill",order);
        return "invoicesuccess";
    }
}
