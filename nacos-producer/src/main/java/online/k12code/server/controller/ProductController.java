package online.k12code.server.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 阿威
 * @Date 2022/7/29
 */
@RequestMapping("producer")
@RestController
@RefreshScope //开启动态刷新配置文件
public class ProductController {

    private int number=100;

    @Value("${student.name:ss}")
    private String name;

    @RequestMapping("/p1")
    public String p1(){
        int a=1/0;
        return name+number--;
    }
}
