package online.k12code.server.controller;

import online.k12code.server.entity.Stock;
import online.k12code.server.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 阿威
 * @Date 2022/8/2
 */
@RestController
public class StockController {

    @Autowired
    private StockService service;

    @PostMapping("s1/{gid}")
    public Integer getStock(@PathVariable Integer gid){
     return service.getStock(gid);
    }
}
