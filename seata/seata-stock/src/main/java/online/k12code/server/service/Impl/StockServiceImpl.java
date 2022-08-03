package online.k12code.server.service.Impl;

import online.k12code.server.entity.Stock;
import online.k12code.server.mapper.StockMapper;
import online.k12code.server.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.commons.security.ResourceServerTokenRelayAutoConfiguration;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author 阿威
 * @Date 2022/8/2
 */
@Service
public class StockServiceImpl implements StockService {

    @Resource
    private StockMapper stockMapper;

    @Override
    public Integer getStock(Integer gid) {
        Integer s=stockMapper.getStock(gid);
        return s;
    }
}
