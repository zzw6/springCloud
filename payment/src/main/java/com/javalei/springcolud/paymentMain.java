package com.javalei.springcolud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * User: zzw
 * Date: 2020-04-23-0:09
 * Description: 主程序入口
 */
@SpringBootApplication
@EnableEurekaClient
public class paymentMain {

    public static void main(String[] args) {
        SpringApplication.run(paymentMain.class,args);
    }
}
