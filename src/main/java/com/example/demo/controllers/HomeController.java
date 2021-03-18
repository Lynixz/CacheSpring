package com.example.demo.controllers;

import com.example.demo.entities.Cache;
import com.example.demo.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    Cache cache = new Cache();
    @GetMapping("/get-user-data")
    @ResponseBody
    public String GetUser(@RequestParam int id){
        User user = cache.get(id);
        if(user == null){
            return "User not found";
        }

        return "Found user with id: " + user.getId();
    }
}
