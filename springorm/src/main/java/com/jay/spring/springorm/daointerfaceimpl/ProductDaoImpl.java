package com.jay.spring.springorm.daointerfaceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.jay.spring.springorm.daointerface.ProductDao;
import com.jay.spring.springorm.entity.Product;

@Component("productDao")
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	HibernateTemplate hibernateTemp;

	@Override
	@Transactional
	public int create(Product product) {
		Integer result = (Integer) hibernateTemp.save(product);
		return result;
	}
}
