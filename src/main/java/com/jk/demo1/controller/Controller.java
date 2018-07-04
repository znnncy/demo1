package com.jk.demo1.controller;

import com.jk.demo1.pojo.Merchant;
import com.jk.demo1.service.ZnnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private ZnnService znnService;


    @RequestMapping("testAll")
    @ResponseBody
    public ModelAndView testAll(){
        //niha
        ModelAndView mav=new ModelAndView("first");
        List<Merchant> list=znnService.queryTest();
        mav.addObject("list",list);
        return mav;
    }

    @RequestMapping("test")
    @ResponseBody
    public Map<String,Object> queryTest(){
        Map<String,Object> map = new HashMap<String, Object>();
        map.put("rows",znnService.queryTest());
        map.put("status",200);
        map.put("total",100);
        map.put("hint","");
        return map;
    }




}
