package com.charon.exchange.disruptor.event;

import com.lmax.disruptor.EventFactory;

/**
 * @author by sl
 * @date 2020/10/29 11:10
 */
public class BuyOrderEventFactory implements EventFactory<BuyOrderEvent> {
    @Override
    public BuyOrderEvent newInstance() {
        return new BuyOrderEvent();
    }
}
