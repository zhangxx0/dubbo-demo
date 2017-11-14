package com.danke.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * 注册服务提供者
 * @date 2017年11月14日14:59:00
 */
public class DemoPrividerTest {
    public static void main(String args[]) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"provider.xml"});
        context.start();
        System.out.println("服务提供者已经注册成功！");

        try {
            System.in.read(); // 让此程序一直跑，表示一直提供服务
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
