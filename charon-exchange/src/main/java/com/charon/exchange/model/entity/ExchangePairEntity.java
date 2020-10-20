package com.charon.exchange.model.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author by sl
 * @date 2020/10/19 15:41
 */
@Data
public class ExchangePairEntity implements Serializable {


    private static final long serialVersionUID = 1L;

    /**
     * 交易对ID
     */
    private Integer pairId;

    /**
     * 兑换币种
     */
    private Integer coinId;

    /**
     * 单位币种ID
     */
    private Integer unitCoinId;

    /**
     * 汇率
     */
    private BigDecimal exchangeRate;

    /**
     * 开启时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 创建用户
     */
    private Integer createBy;

    /**
     * 更新用户
     */
    private Integer updateBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}
