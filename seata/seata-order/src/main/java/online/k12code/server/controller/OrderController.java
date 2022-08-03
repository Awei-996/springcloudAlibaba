package online.k12code.server.controller;

import online.k12code.server.entity.Order;
import online.k12code.server.feign.StockFeign;
import online.k12code.server.service.OrderService;
import org.checkerframework.checker.units.qual.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 阿威
 * @Date 2022/8/2
 */
@RestController
public class OrderController {


    @Autowired
    private OrderService orderService;
    @GetMapping("o1")
    public String order(){
        Order order = new Order(1,100,10);
        Integer order1 = orderService.createOrder(order);
        System.out.println("order"+order1);

        return "1";
    }

}
