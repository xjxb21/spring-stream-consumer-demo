package com.xiao.springstreamconsumerdemo.streamrecivedemo;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

/**
 * Description:
 *
 * @author: xiaojixiang
 * @version: 1.0
 */

@EnableBinding(IShop.class)
public class CloudStreamDemoReive {

    @StreamListener(target = "myOutputCommodity")
    public void consumerCommodity(String msg) throws InterruptedException {
        Thread.sleep(30);
        System.out.println("thread id:" + Thread.currentThread().getId() + " ::: StreamListener consumerCommodity ::: " + msg);
    }
}
