package online.k12code.server.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
@Service
@FeignClient(value = "producer-nacos",path = "producer",fallback = DegradeService.class)
public interface ConFeignService {
    @RequestMapping("/p1")
    public String p1();
}
