package com.ydj.event;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
//@Order 多个任务要自己实现org.springframework.core.Ordered接口或使用org.springframework.core.annotation.Order注解
public class OneTime4Started implements CommandLineRunner {
	private long amount = 0;

	public void run(String... args) {
		// Do something...
		amount++;
		System.out.println("OneTime4Started has run: " + amount);
	}
}
