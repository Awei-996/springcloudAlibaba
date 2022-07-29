package online.k12code.server.controller;

import online.k12code.server.openfeign.ProductOpenfeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 阿威
 * @Date 2022/7/29
 */
@RestController
public class ConsumerController {
    @Autowired
    ProductOpenfeign productOpenfeign;

    @GetMapping("c1")
    public String c1(){
        Integer integer = productOpenfeign.p1();
        return "库存数量："+integer;
    }

}
