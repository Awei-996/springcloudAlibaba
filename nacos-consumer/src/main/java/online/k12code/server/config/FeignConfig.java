package online.k12code.server.config;

import feign.Contract;
import feign.Logger;
import feign.MethodMetadata;
import feign.Request;
import online.k12code.server.intercept.feign.ConsumerIntercept;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @Author 阿威
 * @Date 2022/7/29
 */
//@Configuration
public class FeignConfig {


//    设置全局日志配置
    @Bean
    Logger.Level feignLoggerLevel(){
        /**
         * NONE, 不记录（默认）。
         * BASIC, 只记录请求方法和 URL 以及响应状态码和执行时间。
         * HEADERS, 记录基本信息以及请求和响应标头。
         * FULL, 记录请求和响应的标头、正文和元数据
         */
        return Logger.Level.FULL;
    }

    /**
     * 修改契约配置，支持Feign原生的注解
     * @return
     */
//    @Bean
//    public Contract feignContract(){
//        return new Contract.Default();
//    }

    /**
     * 设置连接超市时间和读取超时时间
     * @return
     */

//    @Bean
//    public Request.Options options(){
//        return new Request.Options(5000,10000);
//    }


    /**
     * 自定义拦截器
     */
    @Bean
    public ConsumerIntercept intercept(){
        return  new ConsumerIntercept();
    }


}
