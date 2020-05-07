package com.javalei.action;

import com.javalei.config.Applicationconfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * User: zzw
 * Date: 2020-05-02-0:14
 * Description:
 */
@RestController
public class Order {



    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/get")
    public Map<String,String> get(String entity){

        System.out.println(entity+"-----");

        Map<String,String> m=new HashMap<>();
        m.put("test",entity);

         return   restTemplate.postForObject(Applicationconfig.PAYMENT_URL+"/addPayment",m,Map.class);
    }
}
