package online.k12code.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author 阿威
 * @Date 2022/8/2
 */
@SpringBootApplication
@MapperScan("online.k12code.server.mapper")
public class SsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsApplication.class,args);
    }
}
