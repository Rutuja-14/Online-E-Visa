package com.klef.jfsd.service;

import java.util.List;

import com.klef.jfsd.model.Application;
import com.klef.jfsd.model.Customer;
import com.klef.jfsd.model.Manager;

public interface ManagerService 
{
	public Manager checkmanlogin(String uname, String pwd);
	public List<Customer> viewallcustomers();
	public void deletecustomer(int id);
	public Customer viewcustomerbyid(int id);
	public Manager addman(Manager manager);
	public List<Application> viewallapplications();
	public Application viewapplicationbyid(int id);
}
