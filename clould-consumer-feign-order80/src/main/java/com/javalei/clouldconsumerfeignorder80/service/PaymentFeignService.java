package com.javalei.clouldconsumerfeignorder80.service;
import com.javalei.commons.entity.PaymentEntity;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * User: zzw
 * Date: 2020-11-22-19:25
 * Description: feign客户端调用
 */
@Component
@FeignClient(value = "PAYMENT-SERVER")
public interface PaymentFeignService {

      @GetMapping("/getPayment/{id}")
      PaymentEntity getPay(@PathVariable String id);
}
