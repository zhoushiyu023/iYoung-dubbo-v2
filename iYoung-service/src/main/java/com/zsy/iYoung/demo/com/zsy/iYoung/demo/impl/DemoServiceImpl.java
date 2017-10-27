package com.zsy.iYoung.demo.com.zsy.iYoung.demo.impl;

import com.zsy.iYoung.demo.DemoService;
import org.springframework.stereotype.Service;


@Service("demoService")
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String str) {
        return "Hello" + " "+ str + "今天真高兴";
    }
}
