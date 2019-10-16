package com.fclassroom.spring.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @GetMapping("/echo") // 受保护的资源 需要 "ADMIN" 权限
    public String echo(String message) {
        return "[ECHO] : " + message;
    }
    @GetMapping("/print") // 受保护的资源 需要 "ADMIN" 权限
    public String print(String message) {
        return "[print] : " + message;
    }
}