package com.charon.exchange.disruptor.event;

import com.charon.exchange.enums.OrderTransactionTypeEnum;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author by sl
 * @date 2020/10/29 11:00
 */
@Data
public class BuyOrderEvent {

    @ApiModelProperty("交易对ID")
    private Integer pairId;

    @ApiModelProperty("价格")
    private BigDecimal price;

    @ApiModelProperty("数量")
    private BigDecimal amount;

    @ApiModelProperty("交易类型")
    private OrderTransactionTypeEnum transactionType;
}
