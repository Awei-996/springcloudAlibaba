package online.k12code.server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 阿威
 * @Date 2022/8/2
 */
@RestController
public class SnController {

    @GetMapping("Sn")
    public String sn(){
        return "hello";
    }
}
