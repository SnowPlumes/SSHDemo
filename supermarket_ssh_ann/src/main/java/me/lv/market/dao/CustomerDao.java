package me.lv.market.dao;

import java.util.List;

import me.lv.market.pojo.Customer;

public interface CustomerDao {
	List<Customer> selectCustomers();
}
