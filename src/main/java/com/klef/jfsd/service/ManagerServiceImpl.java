package com.klef.jfsd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.model.Application;
import com.klef.jfsd.model.Customer;
import com.klef.jfsd.model.Manager;
import com.klef.jfsd.repository.ApplicationRepository;
import com.klef.jfsd.repository.CustomerRepository;
import com.klef.jfsd.repository.ManagerRepository;

@Service
public class ManagerServiceImpl implements ManagerService
{

	@Autowired
	private ManagerRepository managerRepository;
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ApplicationRepository applicationRepository;
	
	@Override
	public Manager checkmanlogin(String manname, String manpwd) 
	{
	
		return managerRepository.checkmanlogin(manname, manpwd);
	}

	@Override
	public List<Customer> viewallcustomers() 
	{
		
		return (List<Customer>) customerRepository.findAll();
	}

	@Override
	public void deletecustomer(int id) 
	{
		customerRepository.deleteById(id);
		
	}

	@Override
	public Customer viewcustomerbyid(int id) 
	{
		
		return customerRepository.findById(id).get();
	}

	@Override
	public Manager addman(Manager manager) 
	{
		return managerRepository.save(manager);
		
	}

	@Override
	public List<Application> viewallapplications() 
	{
		
		return (List<Application>) applicationRepository.findAll();
	}

	@Override
	public Application viewapplicationbyid(int id) 
	{
		
		return applicationRepository.findById(id).get();
	}

	
}
