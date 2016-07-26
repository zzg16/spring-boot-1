package com.ydj.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

@Configuration
public class WebConfig {

	@Bean
	@ConditionalOnMissingBean({ FastJsonHttpMessageConverter.class })
	public FastJsonHttpMessageConverter fastJsonHttpMessageConverter() {
		FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();

		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat, //SerializerFeature.WriteClassName,
				SerializerFeature.WriteMapNullValue);
		ValueFilter valueFilter = new ValueFilter() {
			// o 是class
			// s 是key值
			// o1 是value值 
			public Object process(Object o, String s, Object o1) {
				if (null == o1) { //处理返回null
					o1 = "";
				}
				return o1;
			}
		};
		fastJsonConfig.setSerializeFilters(valueFilter);

		converter.setFastJsonConfig(fastJsonConfig);

		return converter;
	}
}
