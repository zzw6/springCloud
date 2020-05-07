package com.javalei.springcolud.action;

 import com.javalei.springcolud.dao.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.beans.factory.annotation.Value;
 import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 import java.util.HashMap;
 import java.util.Map;

/**
 * User: zzw
 * Date: 2020-05-01-15:21
 * Description: paymentAciton
 */

@RestController
public class PaymentAction {

    @Autowired
    private PaymentMapper payDao;

    @Value("${server.port}")
    private String port;

    @PostMapping("/addPayment")
    //post 请求记得需要配置 RequestBody 注解
    public Map<String,String> insert(@RequestBody String entity){


        Map<String,String> m=new HashMap<>();
        m.put("test",entity+"---port:"+port);

        return m;
    }


    @RequestMapping("/getPayment")
    public Object insert(int id){
        return payDao.getPayment4Id(id);
    }

}
