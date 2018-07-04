package com.jk.demo1.Mapper;

import com.jk.demo1.pojo.Merchant;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ZnnMapper {

    @Select("select * from pyg_merchant")
    List<Merchant> queryTest();

}
