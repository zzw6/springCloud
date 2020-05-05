package com.javalei.commons.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * User: zzw
 * Date: 2020-05-01-15:22
 * Description: payment 实体类
 */

@Data  //实体类标识
@NoArgsConstructor //无参构造
@AllArgsConstructor  //有参构造
@ToString  //toString
public class PaymentEntity {
    private String id;
    private String name;
}
