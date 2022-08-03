package online.k12code.server.mapper;

import online.k12code.server.entity.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    Integer createOrder(@Param("order") Order order);
}
