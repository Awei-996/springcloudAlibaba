package online.k12code.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author 阿威
 * @Date 2022/8/1
 */
@SpringBootApplication
@EnableFeignClients
public class SocApplication {
    public static void main(String[] args) {
        SpringApplication.run(SocApplication.class,args);
    }
}
