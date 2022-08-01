package online.k12code.server.feign;

import org.springframework.stereotype.Component;

/**
 * @Author 阿威
 * @Date 2022/8/1
 */
@Component
public class DegradeService implements ConFeignService {
    @Override
    public String p1() {
        return "熔断触发";
    }
}
