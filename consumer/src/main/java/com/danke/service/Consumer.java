package com.danke.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 服务消费者
 * @date 2017年11月14日15:33:32
 */
public class Consumer {

    public static void main(String args[]) {
        // 加载Spring的配置，并调用远程服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"consumer.xml"});
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法

        System.out.println(hello); // 显示调用结果
    }
}
