package com.charon.exchange.web.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author by sl
 * @date 2020/10/23 14:29
 */
@RequestMapping("/exchange/order")
@RestController
@Api(tags = "客户端-订单管理")
public class OrderController {

    @GetMapping
    public String test(){
        return "123";
    }

//    private final OrderService orderService;
    
//    private final RingBuffer<OrderEvent> ringBuffer;
//
//    public OrderController(OrderService orderService, RingBuffer<OrderEvent> ringBuffer) {
//        this.orderService = orderService;
//        this.ringBuffer = ringBuffer;
//    }
//
//    @PostMapping("/create")
//    @ApiOperation("创建委托单")
//    public ResultVO<Void> create(@RequestBody OrderDTO orderDTO){
//        // 买入
//
//        ByteBuffer bb = ByteBuffer.allocate(8);
//
//        bb.putLong(0, 1);
////        OrderEventProducerTranslators translators = new OrderEventProducerTranslators();
//        ringBuffer.publishEvent(OrderEventTranslators::translate, bb);
//        // 卖出
//        return ResultVoUtil.success();
//    }
}
