package com.charon.exchange.disruptor.handler;

import com.charon.exchange.disruptor.event.BuyOrderEvent;

import com.lmax.disruptor.EventHandler;

/**
 * @author by sl
 * @date 2020/10/29 11:11
 */
public class BuyOrderEventHandler implements EventHandler<BuyOrderEvent> {
    @Override
    public void onEvent(BuyOrderEvent event, long sequence, boolean endOfBatch) throws Exception {
        System.out.println("收到消息============" + event);
    }
}
