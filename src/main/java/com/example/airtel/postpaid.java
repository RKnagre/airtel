package com.example.airtel;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class postpaid {

    @GetMapping("/mypostpaid")

    public String getData(){

        return  " postpaid is the best options for recharge";
    }
}
