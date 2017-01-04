package com.fcs.demo.provider;

import com.fcs.demo.DemoService;

/**
 * Created by Lucare.Feng on 2017/1/3.
 */
public class DemoServiceImpl implements DemoService {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

}
