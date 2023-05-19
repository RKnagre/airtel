package com.example.airtel;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class telecom {
    @GetMapping("/mytelecom")
    public String getData(){
        return  " please recharge your mobile";
    }
}
