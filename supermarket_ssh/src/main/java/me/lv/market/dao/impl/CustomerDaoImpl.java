package me.lv.market.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import me.lv.market.dao.CustomerDao;
import me.lv.market.pojo.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@SuppressWarnings("unchecked")
	public List<Customer> selectCustomers() {
		return (List<Customer>) this.getHibernateTemplate().find("from Customer");
	}

}
