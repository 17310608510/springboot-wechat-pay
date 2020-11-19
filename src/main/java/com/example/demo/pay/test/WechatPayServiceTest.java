package com.example.demo.pay.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.demo.pay.utils.variation.PayServiceUtils;

/**
 * @author 作者 zuoruibo:
 * @date 创建时间：2020年11月19日 下午4:29:14
 * @version 1.0
 * @parameter
 * @since 本地测试类
 * @return
 */
@Service
public class WechatPayServiceTest {
	protected static Logger logger = LoggerFactory.getLogger(WechatPayServiceTest.class);
	
	public static void main(String[] args) {
		// 订单查询
//		wechat.doEquery("996846M20180330115059R5X9H9MHM", null);

		// 支付打款
		PayServiceUtils.doEpay("wx3ff92cec62c097d1", "o7Hzn0rr6U3Xb7Q1W9M-bH7SQXys", "192.168.1.1", "100",
				"996846M20180330115059R5X9H9MHY", null, null, null, "xxx的红包");

		System.out.println("done");
	
	}
}
