package me.lv.market.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import me.lv.market.dao.CustomerDao;
import me.lv.market.pojo.Customer;

@Repository("customerDao")
public class CustomerDaoImpl implements CustomerDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;

	@SuppressWarnings("unchecked")
	public List<Customer> selectCustomers() {
		return (List<Customer>) hibernateTemplate.find("from Customer");
	}
}
