package com.example.springwithcicd;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.TimeZone;
@Slf4j
@SpringBootApplication
@RestController
public class SpringWithCicdApplication {

    @GetMapping("/welcome")
    public String welcome() {
        return "Hello, User";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringWithCicdApplication.class, args);
        log.info(
                "\n\n ============================ APPLICATION LAUNCHED ======================= \n\n");
        TimeZone.setDefault(TimeZone.getTimeZone("Africa/Lagos"));
        System.out.println(LocalDateTime.now());
    }

}
