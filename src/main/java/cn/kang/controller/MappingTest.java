package cn.kang.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MappingTest {

    @RequestMapping("go")
    public void demo1(){
        System.out.println("舒服");
    }
}
