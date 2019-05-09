package com.kiwi.kb.test.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by liulu on 2019/5/9.
 */

@SpringBootApplication
@EnableCaching
@EnableScheduling
public class KbTestApplication {
    public static void main(String[] args){
        SpringApplication.run(KbTestApplication.class,args);
    }
}
