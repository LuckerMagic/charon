package com.charon.exchange.service.impl;

import com.charon.exchange.mapper.ExchangePairMapper;
import com.charon.exchange.model.vo.ExchangePairVO;
import com.charon.exchange.service.ExchangePairService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author by sl
 * @date 2020/10/19 16:59
 */
@Service
public class ExchangePairServiceImpl implements ExchangePairService {

    private final ExchangePairMapper exchangePairMapper;

    public ExchangePairServiceImpl(ExchangePairMapper exchangePairMapper) {
        this.exchangePairMapper = exchangePairMapper;
    }

    @Override
    public List<ExchangePairVO> list() {
        return exchangePairMapper.list();
    }
}
