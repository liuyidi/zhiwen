package com.netease.is.dao;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class BaseDao<T> {
//	private Class<T> entityClass;
//		
//	@Autowired
//	private HibernateTemplate hibernateTemplate;
//	
//	/**
//	 * 通过反射获取子类确定的泛型类
//	 */
//	public BaseDao() {
//		Type getType = getClass().getGenericSuperclass();
//		//Type[] params = ((ParameterizedType) genType).getActualTypeArguments();
//	}
}
