package online.k12code.server.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.A;

/**
 * @Author 阿威
 * @Date 2022/8/2
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    private Integer gid;
    private Integer number;
    private Integer status;
}
