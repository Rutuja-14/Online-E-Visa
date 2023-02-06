package com.klef.jfsd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.model.Accountant;
import com.klef.jfsd.model.Manager;
import com.klef.jfsd.repository.AccountantRepository;
import com.klef.jfsd.repository.ManagerRepository;

@Service

public class AccountantServiceImpl implements AccountantService
{
  @Autowired
  private AccountantRepository accountantRepository;
  
  @Autowired
  private ManagerRepository managerRepository;

@Override
public Accountant checkaccountantlogin(String auname, String apwd) 
{
	
	return accountantRepository.checkaccountanttlogin(auname, apwd);
}

@Override
public List<Manager> viewallmanagers() 
{
	
	return (List<Manager>) managerRepository.findAll();
}

@Override
public void deletemanager(String username) 
{
	managerRepository.deleteById(username);
	
}

@Override
public Manager viewmanagerbyuname(String manname) 
{
	
	return managerRepository.findById(manname).get();
}


  
   

}