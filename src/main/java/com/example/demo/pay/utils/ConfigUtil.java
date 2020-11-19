package com.example.demo.pay.utils;

/**
 * @author 作者 zuoruibo:
 * @date 创建时间：2020年11月19日 下午3:41:12
 * @version 1.0
 * @parameter
 * @since 微信支付相关配置信息
 * @return
 */
public class ConfigUtil {

	/**
	 * 企业付款地址
	 */
	// 企业付款接口(POST)
	public final static String PROMOTION_URL = "https://api.mch.weixin.qq.com/mmpaymkttransfers/promotion/transfers";

	// 企业付款查询接口(POST)
	public final static String PROMOTION_QUERY_URL = "https://api.mch.weixin.qq.com/mmpaymkttransfers/gettransferinfo";
}
