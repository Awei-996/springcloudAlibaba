package online.k12code.server.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @Author 阿威
 * @Date 2022/8/2
 */
@FeignClient(value = "seata-stock")
public interface StockFeign {
    @PostMapping("s1/{gid}")
    public Integer getStock(@PathVariable Integer gid);
}
