package com.javalei.clouldconsumerfeignorder80.action;

import com.javalei.clouldconsumerfeignorder80.service.PaymentFeignService;
import com.javalei.commons.entity.PaymentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * User: zzw
 * Date: 2020-11-22-22:39
 * Description: todo
 * @author zhangziwei
 */
@RestController
public class FeignPayment {


    @Resource
    PaymentFeignService feignService;
    @RequestMapping("/get")
    public PaymentEntity getPay(String id){
          return  feignService.getPay(id);
    }
}
