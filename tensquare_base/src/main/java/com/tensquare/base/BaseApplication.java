package com.tensquare.base;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import util.IdWorker;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class BaseApplication {
  public static void main(String[] args) {
    SpringApplication.run(BaseApplication.class, args);
  }
  
  @Bean
  public IdWorker idWorker() {
    return new IdWorker(1, 1);
  }
}
