package com.centime.HelloMessage.controller;


import com.centime.HelloMessage.vo.DetailVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/concatenator")
@Slf4j
public class HelloMessageController {

    @GetMapping("/check")
    public String healthCheck(){
        log.info("Entered: healthCheck|"+getClass().getName());
        log.info("Exited: healthCheck|"+getClass().getName());
        return "UP";
    }

    @GetMapping(value = "/hello", consumes = "application/json")
    public String helloMessage(@RequestBody DetailVo detailVo){

        log.info("Entered: helloMessage|"+getClass().getName());
        log.info("Exited: helloMessage|"+getClass().getName());
        return "Hello";
    }
}
