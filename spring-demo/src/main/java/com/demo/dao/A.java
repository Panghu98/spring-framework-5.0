package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 14:00 2020/3/4
 * @Modified By:
 */
@Repository("a")
public class A {

	@Autowired
	private B b;

	public A() {
		System.err.println("========A执行构造方法=======");
	}

	public void hello() {
		System.out.println("A said hello");
	}
}
