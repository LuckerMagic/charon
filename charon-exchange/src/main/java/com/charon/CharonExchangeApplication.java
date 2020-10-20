package com.charon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zgrj
 */
@SpringBootApplication(scanBasePackages = "com.charon")
@MapperScan("com.charon.exchange.mapper")
public class CharonExchangeApplication {

    public static void main(String[] args) {
        SpringApplication.run(CharonExchangeApplication.class, args);
    }

}
