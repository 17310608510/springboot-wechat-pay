package com.example.demo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月19日 下午4:43:11 
 * @version 1.0 
 * @parameter 
 * @since 
 * @return 
 */
@RestController
public class InitRest {
	protected static Logger logger = LoggerFactory.getLogger(InitRest.class);

	/**
	 * http://localhost:9090/hello
	 * 
	 * @return
	 */
	@GetMapping("/hello")
	public String hello() {
		logger.info("hello");
		return "Hello greetings from spring-boot2-wechat-pay";
	}
}
