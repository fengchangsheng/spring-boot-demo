package com.fcs.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Lucare.Feng on 2017/1/3.
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();

        System.in.read(); // 按任意键退出
    }

}
