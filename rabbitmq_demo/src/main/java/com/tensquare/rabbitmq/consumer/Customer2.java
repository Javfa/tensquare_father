package com.tensquare.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/*
 * @Description: Customer1
 * @Author: Mr. Jf
 * @Time: 2020/4/14 9:50
 */
@Component
@RabbitListener(queues = "itheima")
public class Customer2 {

  @RabbitHandler
  public void showMessage(String message) {
    System.out.println("itheima" + message);
  }
}
