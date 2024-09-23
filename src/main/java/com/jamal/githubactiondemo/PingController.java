package com.jamal.githubactiondemo;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class PingController {



    @GetMapping("/ping")
    public String PingCheck()
    {    log.info("Hello")
        return "ping response";
    }

    @PostMapping("/test-post")
    public String PingPostCheck() {
        return "ping post";
    }



}
