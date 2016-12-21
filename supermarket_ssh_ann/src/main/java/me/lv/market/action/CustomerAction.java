package me.lv.market.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import com.opensymphony.xwork2.ActionSupport;

import me.lv.market.pojo.Customer;
import me.lv.market.service.CustomerService;

@Namespace("/")
@ParentPackage("struts-default")
@Scope("prototype")
public class CustomerAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Autowired
	private CustomerService customerService;

	@Action(value = "select", results = { @Result(name = SUCCESS, location = "/success.jsp") })
	public String select() {
		List<Customer> customers = customerService.selectCustomers();
		ServletActionContext.getRequest().setAttribute("customers", customers);
		return SUCCESS;
	}

}
