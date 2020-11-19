package com.example.demo.config;

import java.util.concurrent.Executors;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

/** 
 * @author 作者 zuoruibo: 
 * @date 创建时间：2020年11月19日 下午3:22:46 
 * @version 1.0 
 * @parameter 
 * @since 多线程实现并发定时
 * @return 
 */
@Configuration
public class ScheduleConfig implements SchedulingConfigurer{

	@Override
	public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
		taskRegistrar.setScheduler(Executors.newScheduledThreadPool(10));
	}

}
