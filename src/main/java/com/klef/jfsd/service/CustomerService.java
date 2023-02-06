package com.klef.jfsd.service;

import com.klef.jfsd.model.Customer;

public interface CustomerService 
{
	public Customer addcustomer(Customer customer);
	public Customer checkcustlogin(String uname, String pwd);
	public Customer viewcustomer(String uname);
	public int changecustomerpassword(String custoldpwd, String custnewpwd, String custuname);
}
