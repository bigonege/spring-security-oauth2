package com.fclassroom;

import com.fclassroom.spring.test.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class SpringSecurityOauthDemoBootStrap {

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityOauthDemoBootStrap.class,args);
    }

}
