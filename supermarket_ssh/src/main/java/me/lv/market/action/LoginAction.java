package me.lv.market.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import me.lv.market.pojo.Customer;
import me.lv.market.service.CustomerService;
import me.lv.market.service.LoginService;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private LoginService loginService;
	private String name;
	private String password;
	private CustomerService customerService;

	public CustomerService getCustomerService() {
		return customerService;
	}

	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() {
		if (loginService.login(name, password)) {
			ServletActionContext.getRequest().setAttribute("username", "ะกร๗");
			ServletActionContext.getRequest().setAttribute("password", "12345");
			ServletActionContext.getRequest().setAttribute("age", 13);
			List<Customer> customers = customerService.selectCustomers();
			ServletActionContext.getRequest().setAttribute("customers", customers);
			return SUCCESS;
		}
		return ERROR;
	}

}
