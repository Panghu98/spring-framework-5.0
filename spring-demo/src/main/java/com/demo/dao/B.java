package com.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 14:00 2020/3/4
 * @Modified By:
 */
@Repository("b")
public class B {

	@Autowired
	private A a;

	public B() {
		System.err.println("==================B执行构造方法==============");
	}

	public void setA(A a){
		this.a = a;
		System.err.println("====================           在B中注入a         ====================");
	}

}
