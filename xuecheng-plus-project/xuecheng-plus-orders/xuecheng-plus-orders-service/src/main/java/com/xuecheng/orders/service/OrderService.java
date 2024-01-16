package com.xuecheng.orders.service;

import com.xuecheng.orders.model.dto.AddOrderDto;
import com.xuecheng.orders.model.dto.PayRecordDto;
import com.xuecheng.orders.model.dto.PayStatusDto;
import com.xuecheng.orders.model.po.XcPayRecord;
import org.springframework.transaction.annotation.Transactional;

/**
 * 订单相关接口
 */
public interface OrderService {
    /**
     * 创建商品订单
     * @param addOrderDto 订单信息
     * @return PayRecordDto 支付交易记录(包括二维码)
     */
    public PayRecordDto createOrder(String userId, AddOrderDto addOrderDto);

    /**
     * 查询支付交易记录
     * @param payNo  交易记录号
     * @return
     */
    public XcPayRecord getPayRecordByPayno(String payNo);

    /**
     * 请求支付宝查询支付结果
     * @param payNo 支付记录id
     * @return 支付记录信息
     */
    public PayRecordDto queryPayResult(String payNo);

    /**
     * 保存支付宝支付结果
     * @param payStatusDto  支付结果信息
     * @return void
     */
    public void saveAliPayStatus(PayStatusDto payStatusDto);
}