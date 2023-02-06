package com.klef.jfsd.service;

import java.util.List;

import com.klef.jfsd.model.Accountant;
import com.klef.jfsd.model.Customer;
import com.klef.jfsd.model.Manager;

public interface AccountantService 
{

  public Accountant checkaccountantlogin(String auname, String apwd);
  public List<Manager> viewallmanagers();
  public void deletemanager(String username);
  public Manager viewmanagerbyuname(String manname);
}