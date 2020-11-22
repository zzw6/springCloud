package com.javalei.springcolud.action;

 import com.javalei.commons.entity.PaymentEntity;
 import com.javalei.springcolud.dao.PaymentMapper;
import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.beans.factory.annotation.Value;
 import org.springframework.util.StringUtils;
 import org.springframework.web.bind.annotation.*;

 import java.util.HashMap;
 import java.util.Map;
 import java.util.concurrent.TimeUnit;

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
        PaymentEntity paymentEntity=new PaymentEntity();
        paymentEntity.setName(entity);
        int i = payDao.insertPayment(paymentEntity);
        m.put("id",i+"");
        return m;
    }


    @RequestMapping("/getPayment")
    public Object getPayment( String  id){
        System.out.println("id进来了"+id);
        if(id==null){
            id="1";
        }
//        try {
//           // TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        Object payment4Id = payDao.getPayment4Id(Integer.parseInt(id));
        System.out.println(payment4Id);
        return payment4Id;
    }

}
