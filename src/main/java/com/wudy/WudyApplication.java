package com.wudy;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"com.wudy"})
@EnableZuulProxy
@EnableSwagger2Doc
@EnableFeignClients(basePackages = {"com.wudy"})
public class WudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(WudyApplication.class, args);
    }

}
