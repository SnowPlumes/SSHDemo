package me.lv.market.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.lv.market.dao.CustomerDao;
import me.lv.market.pojo.Customer;
import me.lv.market.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	public List<Customer> selectCustomers() {
		return customerDao.selectCustomers();
	}

}
