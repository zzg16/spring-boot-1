package com.ydj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 你不需要将所有的@Configuration放进一个单独的类。@Import注解可以用来导入其他配置类。
 * 另外，你也可以使用@ComponentScan注解自动收集所有的Spring组件，包括@Configuration类。
 * 如果你必须要使用基于XML的配置，我们建议你依然从一个@Configuration类开始。
 * 之后你就可以使用@ImportResource注解来加载XML配置文件。
 * 
 * 使用根包允许你使用@ComponentScan注解而不需要定义一个basePackage属性。
 * 如果main类位于根包中，你也可以使用@SpringBootApplication注解。
 * 
 * @author yufu
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
//@Import({HelloWorld.class})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
