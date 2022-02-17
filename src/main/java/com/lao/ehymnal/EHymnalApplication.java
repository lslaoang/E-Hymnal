package com.lao.ehymnal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.lao.ehymnal.repository")
public class EHymnalApplication {

    public static void main(String[] args) {
        SpringApplication.run(EHymnalApplication.class, args);
    }

}
