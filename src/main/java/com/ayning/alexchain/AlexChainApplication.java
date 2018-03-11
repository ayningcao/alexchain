package com.ayning.alexchain;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * created by 10127 on 2018/3/11
 *
 * @author alex
 */
@SpringBootApplication
@EnableAutoConfiguration
public class AlexChainApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(AlexChainApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Alex Chain is starting...");
        SpringApplication.run(AlexChainApplication.class, args);
    }
}
