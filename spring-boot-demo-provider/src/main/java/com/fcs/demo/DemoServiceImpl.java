package com.fcs.demo;


/**
 * Created by Lucare.Feng on 2017/1/3.
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
