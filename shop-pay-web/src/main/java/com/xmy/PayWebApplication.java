package com.xmy;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *
 * @author xmy
 * @date 2019-10-09 21:44
 */
@SpringBootApplication
@EnableDubboConfiguration
public class PayWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(PayWebApplication.class, args);
    }
}