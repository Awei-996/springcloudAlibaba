package online.k12code.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author 阿威
 * @Date 2022/7/28
 */
@SpringBootApplication
public class ProducerApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(ProducerApplication.class, args);
        String property = run.getEnvironment().getProperty("student");
        System.out.println(property);
    }
}
