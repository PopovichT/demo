package com.training.demo.controller;


import com.training.demo.dto.DemoRequestDto;
import com.training.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/endpoint")
public class AppController {

    private final DemoService demoService;

    @Autowired
    public AppController(DemoService demoService){
        this.demoService = demoService;
    }

    @PostMapping("/operate")
    public Integer operateNumbers (@RequestBody DemoRequestDto demoRequestDto) {
        return demoService.calculate(demoRequestDto.getB(), demoRequestDto.getA());
    }
}
