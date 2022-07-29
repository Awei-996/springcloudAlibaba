package online.k12code.server.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 阿威
 * @Date 2022/7/29
 */
@RequestMapping("producer")
@RestController
public class ProductController {

    private int number=100;

    @RequestMapping("/p1")
    public Integer p1(){
        return number--;
    }
}
