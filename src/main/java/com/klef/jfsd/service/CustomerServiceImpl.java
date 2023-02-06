package com.klef.jfsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.model.Customer;
import com.klef.jfsd.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService
{
	@Autowired
	private CustomerRepository customerRepository;
	
	@Override
	public Customer addcustomer(Customer customer) 
	{
		return customerRepository.save(customer);
		
	}

	@Override
	public Customer checkcustlogin(String uname, String pwd) 
	{
		
		return customerRepository.checkcustlogin(uname, pwd);
	}

	@Override
	public Customer viewcustomer(String uname) 
	{
		return customerRepository.viewcustomer(uname);
	}

	@Override
	public int changecustomerpassword(String custoldpwd, String custnewpwd, String custuname) 
	{
		
		return customerRepository.updatecustpassword(custnewpwd, custoldpwd, custuname);
	}

	

	
}
