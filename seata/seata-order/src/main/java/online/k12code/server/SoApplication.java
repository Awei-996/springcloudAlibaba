package online.k12code.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author 阿威
 * @Date 2022/8/2
 */
@SpringBootApplication
@EnableFeignClients
@MapperScan("online.k12code.server.mapper")
public class SoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SoApplication.class,args);
    }
}
