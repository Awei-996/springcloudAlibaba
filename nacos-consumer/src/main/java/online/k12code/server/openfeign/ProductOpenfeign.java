package online.k12code.server.openfeign;

import online.k12code.server.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 阿威
 * @Date 2022/7/29
 */
                                    //configuration = FeignConfig.class配置类 局部日志配置
@FeignClient(name = "producer-nacos",path = "producer")
public interface ProductOpenfeign {
    @RequestMapping("/p1")
     Integer p1();
}
