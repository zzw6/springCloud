package com.javalei.clouldconsumerfeignorder80.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * User: zzw
 * Date: 2020-11-23-00:02
 * Description: config
 */
@Configuration
public class config {
    @Bean
    Logger.Level get(){
        return Logger.Level.FULL;
    }
}
