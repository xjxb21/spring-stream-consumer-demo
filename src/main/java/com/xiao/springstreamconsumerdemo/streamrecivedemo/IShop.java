package com.xiao.springstreamconsumerdemo.streamrecivedemo;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Description:
 *
 * @author: xiaojixiang
 * @version: 1.0
 */
public interface IShop {

//    /**
//     * 订单
//     * myInputOrders 表示输入的通道名称
//     *
//     * @return
//     */
//    @Input("myInputOrders")
//    SubscribableChannel orders();

    /**
     * commodity 商品
     * myOutputCommodity 表示输出的通道名称
     *
     * @return
     */
    @Input("myOutputCommodity")
    MessageChannel commodity();
}
