package com.demo.dao;

import org.springframework.stereotype.Repository;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 12:36 2020/2/20
 * @Modified By:
 */
@Repository("dao")
public class IndexDao {

	public void query() {
		System.out.println("invoke query method....");
	}

}
