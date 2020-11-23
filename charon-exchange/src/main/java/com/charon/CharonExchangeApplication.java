package com.charon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author zgrj
 */
@SpringBootApplication(scanBasePackages = "com.charon")
@MapperScan("com.charon.exchange.mapper")
@EnableEurekaClient
@EnableOAuth2Sso
public class CharonExchangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CharonExchangeApplication.class, args);
    }

}
