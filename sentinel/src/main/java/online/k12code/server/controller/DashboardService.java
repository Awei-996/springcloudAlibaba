package online.k12code.server.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 阿威
 * @Date 2022/8/1
 */
@RestController
public class DashboardService {


    @GetMapping("dash")
    @SentinelResource(value = "v1",blockHandler = "dashBlockHandler")
    public String d1(){
        return "访问成功";
    }

    public String dashBlockHandler(BlockException e){
        e.printStackTrace();
        return "block";
    }
}
