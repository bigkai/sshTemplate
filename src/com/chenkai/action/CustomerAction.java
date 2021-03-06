package com.chenkai.action;


import com.chenkai.domain.Customer;
import com.chenkai.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Namespace(value="/")
@ParentPackage(value="struts-default")
@Scope(value="prototype")
@Controller
public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
	private Customer customer = new Customer();
	
	@Override
	public Customer getModel() {
		return customer;
	}
	
	@Autowired
	private CustomerService customerService;
	
	@Action(value = "customerAction_save",results={@Result(name="success",location="/success.jsp")})
	
	public String save() {
		customerService.save(customer);
		return SUCCESS;
	}

	
}
