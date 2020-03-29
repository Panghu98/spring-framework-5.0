package com.demo.service.imple;

import com.demo.dao.A;
import com.demo.dao.IndexDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 21:28 2020/2/19
 * @Modified By:
 */
@Service("service")
public  class IndexServiceImpl {

	@Autowired
	private IndexDao dao;

	public void setA(A a) {
		System.err.println("====================");
	}


	public void find() {
		dao.query();
	}

}
