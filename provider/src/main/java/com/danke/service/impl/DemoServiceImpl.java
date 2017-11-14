package com.danke.service.impl;

import com.alibaba.dubbo.rpc.RpcContext;
import com.danke.service.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * demo接口实现类
 * 2017年11月14日14:28:58
 */
public class DemoServiceImpl implements DemoService {

    /**
     * sayHello方法实现
     * @param name
     * @return
     */
    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }
}
