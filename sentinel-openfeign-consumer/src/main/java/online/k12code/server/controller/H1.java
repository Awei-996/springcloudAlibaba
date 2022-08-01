package online.k12code.server.controller;

import online.k12code.server.feign.ConFeignService;
import org.aspectj.lang.annotation.Around;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 阿威
 * @Date 2022/8/1
 */
@RestController
public class H1 {

    @Autowired
    public ConFeignService conFeignService;

    @GetMapping("h1")
    public String h1(){
        return conFeignService.p1();
    }

}
