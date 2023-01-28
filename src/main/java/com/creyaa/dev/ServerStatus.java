package com.creyaa.dev;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServerStatus{
      @GetMapping("/serverStatus")
      public String serverStatus(){
        return "Up";
      }
}