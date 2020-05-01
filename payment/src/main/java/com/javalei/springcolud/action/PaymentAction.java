package com.javalei.springcolud.action;

import com.javalei.springcolud.dao.PaymentMapper;
import com.javalei.springcolud.entity.PaymentEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * User: zzw
 * Date: 2020-05-01-15:21
 * Description: paymentAciton
 */

@RestController
public class PaymentAction {

    @Autowired
    private PaymentMapper payDao;

    @RequestMapping("/addPayment")
    public PaymentEntity insert(PaymentEntity entity){

        System.out.println(entity.toString());

        if(entity==null|| StringUtils.isEmpty(entity.getName())){
            return null;
        }
        payDao.insertPayment(entity);
        return entity;
    }


    @RequestMapping("/getPayment")
    public PaymentEntity insert(int id){
        return payDao.getPayment4Id(id);
    }

}
