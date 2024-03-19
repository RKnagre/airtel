package com.example.airtel;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class data {
    @GetMapping("/mydata")
        public String getData () {
            return "Please recharge your device";
        }

    }



