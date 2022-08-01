package online.k12code.server.fallback;

/**
 * @Author 阿威
 * @Date 2022/8/1
 */

public class Fallback {
//    @PostConstruct
    public static String fallback(Integer id, Throwable t){
        t.printStackTrace();
        return "异常处理函数"+id;
    }
}
