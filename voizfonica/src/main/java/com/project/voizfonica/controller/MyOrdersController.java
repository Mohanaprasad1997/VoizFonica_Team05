package com.project.voizfonica.controller;

import com.project.voizfonica.data.MyAccountRepository;
import com.project.voizfonica.data.OrderRepository;
import com.project.voizfonica.data.SignUpRepository;
import com.project.voizfonica.model.Login;
import com.project.voizfonica.model.MyAccount;
import com.project.voizfonica.model.Order;
import com.project.voizfonica.model.SignUp;
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

@RequestMapping("/myorders")
@SessionAttributes({"login", "order"})
public class MyOrdersController {
    private OrderRepository orderRepository;
    @Autowired
    public MyOrdersController(OrderRepository orderRepository){
        this.orderRepository=orderRepository;
    }
    @GetMapping
    public String get(Model model, @SessionAttribute Login login, @SessionAttribute Order order){
        List<Order> myord=new ArrayList<>();
        myord=orderRepository.findByuserid(login.getContact());
        System.out.println(myord);
        model.addAttribute("myord",myord);
        return "myorders";
    }
}
