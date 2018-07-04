package com.jk.demo1.service.impl;

import com.jk.demo1.Mapper.ZnnMapper;
import com.jk.demo1.pojo.Merchant;
import com.jk.demo1.service.ZnnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZnnServiceImpl implements ZnnService {

    @Autowired
    private ZnnMapper znnMapper;

    @Override
    public List<Merchant> queryTest() {

        return znnMapper.queryTest();
    }
}
