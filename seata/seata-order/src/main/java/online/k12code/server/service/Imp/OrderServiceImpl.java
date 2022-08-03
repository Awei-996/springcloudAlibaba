package online.k12code.server.service.Imp;

import io.seata.spring.annotation.GlobalTransactional;
import online.k12code.server.entity.Order;
import online.k12code.server.feign.StockFeign;
import online.k12code.server.mapper.OrderMapper;
import online.k12code.server.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Author 阿威
 * @Date 2022/8/2
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;
    @Autowired
    private StockFeign stockFeign;

    @GlobalTransactional
    @Override
    public Integer createOrder(Order order) {
        Integer order1 = orderMapper.createOrder(order);
        Integer stock = stockFeign.getStock(order.getGid());
        System.out.println("stock"+stock);
        return order1;
    }

}
