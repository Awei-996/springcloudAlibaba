package online.k12code.server.mapper;

import online.k12code.server.entity.Stock;
import org.apache.ibatis.annotations.Mapper;


public interface StockMapper {
    Integer getStock(Integer gid);
}
