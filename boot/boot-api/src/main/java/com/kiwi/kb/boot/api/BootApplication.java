package com.kiwi.kb.boot.api;

import com.kiwi.kb.common.util.StringUtils;
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
public class BootApplication {

    public static void main(String[] args){
        SpringApplication.run(BootApplication.class,args);
    }
}
