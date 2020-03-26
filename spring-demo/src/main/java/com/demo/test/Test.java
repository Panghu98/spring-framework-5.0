package com.demo.test;

import com.demo.config.AppConfig;
import com.demo.service.imple.IndexServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 20:59 2020/2/19
 * @Modified By:
 */
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(AppConfig.class);
		IndexServiceImpl service = annotationConfigApplicationContext.getBean(IndexServiceImpl.class);
		service.find();
	}

}
