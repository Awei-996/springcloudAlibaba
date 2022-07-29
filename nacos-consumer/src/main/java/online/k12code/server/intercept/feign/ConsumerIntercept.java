package online.k12code.server.intercept.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;

import java.util.UUID;

/**
 * @Author 阿威
 * @Date 2022/7/29
 */
public class ConsumerIntercept implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        //业务逻辑
        String s = UUID.randomUUID().toString();
        requestTemplate.header("token",s);
        System.out.println(s);
    }
}
