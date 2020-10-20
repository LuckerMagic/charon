package com.charon.exchange.service;

import com.charon.exchange.model.vo.ExchangePairVO;

import java.util.List;

/**
 * @author by sl
 * @date 2020/10/19 16:59
 */
public interface ExchangePairService {
    /**
     * 获取交易对列表
     * @return List<ExchangePairVO>
     */
    List<ExchangePairVO> list();
}
