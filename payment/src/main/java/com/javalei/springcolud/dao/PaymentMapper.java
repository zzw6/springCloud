package com.javalei.springcolud.dao;


import com.javalei.commons.entity.PaymentEntity;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PaymentMapper {

    @Insert("insert into payment(name) values(#{name})")
    @Options(useGeneratedKeys = true,keyProperty ="id",keyColumn = "id")
    int insertPayment(PaymentEntity p);


    @Select("select * from payment where id=#{0}")
    PaymentEntity getPayment4Id(int id);
}
