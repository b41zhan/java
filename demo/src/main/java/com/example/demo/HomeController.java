package com.example.demo;

import org.apache.coyote.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {


    @RequestMapping("/")


    @ResponseBody
    public String greet(@RequestParam(value = "q", required = false) String q) {
         if (q != null) {
             return q;
         }
         else{
             return "Hello World";
         }
    }


}
