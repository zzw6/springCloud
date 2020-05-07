package com.javalei.springcolud.dao;


 import org.apache.ibatis.annotations.*;

@Mapper
public interface PaymentMapper {

    @Insert("insert into payment(name) values(#{name})")
    @Options(useGeneratedKeys = true,keyProperty ="id",keyColumn = "id")
    int insertPayment(Object p);


    @Select("select * from payment where id=#{0}")
    Object getPayment4Id(int id);
}
