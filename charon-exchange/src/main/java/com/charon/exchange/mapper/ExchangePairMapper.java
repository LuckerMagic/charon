package com.charon.exchange.mapper;

import com.charon.exchange.model.vo.ExchangePairVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author by sl
 * @date 2020/10/19 17:07
 */
@Mapper
@Repository
public interface ExchangePairMapper {
    /**
     * 获取交易对列表
     * @return List<ExchangePairVO>
     */
    List<ExchangePairVO> list();
}
