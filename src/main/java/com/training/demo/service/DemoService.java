package com.training.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoService {

    public DemoService() {
    }

    public Integer calculate(int a, int b) {
        return a + b;
    }
}
