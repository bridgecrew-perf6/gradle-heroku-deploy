package com.example.damo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    @GetMapping("/damo")
    public String damo(){
        return "This is Gradle Project";
    }
}
