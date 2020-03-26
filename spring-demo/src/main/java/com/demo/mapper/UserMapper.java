package com.demo.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author: panghu
 * @Description:
 * @Date: Created in 22:02 2020/3/15
 * @Modified By:
 */
@Mapper
public interface UserMapper {
	@Select("select * from user limit 1")
	public Object query();
}
