package com.example.demo;

import com.example.demo.entities.Cache;
import com.example.demo.entities.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Cache cache = new Cache();
        cache.set(1, new User(1));
        cache.set(2, new User(2));
        //cache.set(3, new User(3)); Not found -- eg.
        cache.set(4, new User(4));
    }

}
