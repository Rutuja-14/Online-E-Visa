package com.klef.jfsd.service;

import com.klef.jfsd.model.Application;
import com.klef.jfsd.model.Customer;

public interface ApplicationService 
{
	public Application addapplication(Application application);
	public int changestatus(int appid);
	public int changestatusdec(int appid);
	public Application visaapplication(String appname);

}
