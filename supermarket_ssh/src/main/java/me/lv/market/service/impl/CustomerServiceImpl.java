package me.lv.market.service.impl;

import java.util.List;

import me.lv.market.dao.CustomerDao;
import me.lv.market.pojo.Customer;
import me.lv.market.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	private CustomerDao customerDao;

	public CustomerDao getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public List<Customer> selectCustomers() {
		return customerDao.selectCustomers();
	}

}
