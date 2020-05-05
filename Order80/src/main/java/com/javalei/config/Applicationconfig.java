package com.javalei.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * User: zzw
 * Date: 2020-05-02-0:17
 * Description: config
 */
@Configuration
public class Applicationconfig {

    public static final String PAYMENT_URL="http://127.0.0.1:8081";


    @Bean
    public RestTemplate getRestTemplate(){
        return  new RestTemplate();
    }

}
