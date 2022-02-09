package com.example.damo;

import com.example.damo.Exception.SampleUserException;
import com.example.damo.service.SampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private SampleService sampleService;

    @GetMapping("/user")
    public String user() {

        String userName = this.sampleService.getActiveUserName();
        if(userName.length() >= 15){
            return "ロングネーム";
        }
        return "ようこそ" + userName + "さん";
    }
}
