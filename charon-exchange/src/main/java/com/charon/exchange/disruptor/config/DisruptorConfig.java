package com.charon.exchange.disruptor.config;

import org.springframework.context.annotation.Configuration;

/**
 * @author by sl
 * @date 2020/10/29 11:43
 */
@Configuration
public class DisruptorConfig {

//    @Bean
//    public RingBuffer<OrderEvent> create(){
//        // Specify the size of the ring buffer, must be power of 2.
//        int bufferSize = 1024;
//
//        // Construct the Disruptor
//        OrderEventFactory orderEventFactory = new OrderEventFactory();
//        Disruptor<OrderEvent> disruptor = new Disruptor<>(orderEventFactory, bufferSize, DaemonThreadFactory.INSTANCE);
//
//        // Connect the handler
//        disruptor.handleEventsWith((event, sequence, endOfBatch) -> System.out.println("Event: " + event));
//
//        // Connect the handler
//        OrderEventHandler orderEventHandler = new OrderEventHandler();
//        disruptor.handleEventsWith(orderEventHandler);
//
//        // Start the Disruptor, starts all threads running
//        disruptor.start();
//
//        // Get the ring buffer from the Disruptor to be used for publishing.
//
//        return disruptor.getRingBuffer();
//    }
}
