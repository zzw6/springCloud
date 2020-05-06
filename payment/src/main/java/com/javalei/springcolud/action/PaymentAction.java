package com.javalei.springcolud.action;

import com.javalei.commons.entity.PaymentEntity;
import com.javalei.springcolud.dao.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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


    @PostMapping("/addPayment")
    //post 请求记得需要配置 RequestBody 注解
    public PaymentEntity insert(@RequestBody  PaymentEntity entity){

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
