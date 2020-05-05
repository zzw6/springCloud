package com.javalei.action;

import com.javalei.config.Applicationconfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.javalei.commons.entity.PaymentEntity;

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
    public PaymentEntity get(PaymentEntity entity){
        System.out.println(entity.toString());
            return   restTemplate.postForObject(Applicationconfig.PAYMENT_URL+"/addPayment",entity,PaymentEntity.class);
    }
}
