package com.charon.exchange.web.controller;

import com.charon.common.utils.ResultVoUtil;
import com.charon.common.vo.ResultVO;
import com.charon.exchange.model.vo.ExchangePairVO;
import com.charon.exchange.service.ExchangePairService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author by sl
 * @date 2020/10/19 15:46
 */
@RequestMapping("/exchange/pair")
@RestController
@Api(tags = "客户端-交易对信息")
public class ExchangePairController {

    private final ExchangePairService exchangePairService;

    public ExchangePairController(ExchangePairService exchangePairService) {
        this.exchangePairService = exchangePairService;
    }

    @GetMapping("/list")
    @ApiOperation("获取交易对列表")
    public ResultVO<List<ExchangePairVO>> list(){
        List<ExchangePairVO> exchangePairVoList =  exchangePairService.list();
        return ResultVoUtil.successWithData(exchangePairVoList);
    }


}
