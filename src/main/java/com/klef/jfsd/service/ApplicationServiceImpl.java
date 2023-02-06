package com.klef.jfsd.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.model.Application;
import com.klef.jfsd.repository.ApplicationRepository;

@Service
public class ApplicationServiceImpl implements ApplicationService
{
	@Autowired
	private ApplicationRepository applicationRepository;

	@Override
	public Application addapplication(Application application) 
	{
		
		return applicationRepository.save(application);
	}

	@Override
	public int changestatus(int appid) {
		
		return applicationRepository.updateapp(appid);
	}

	@Override
	public int changestatusdec(int appid) {
		
		return applicationRepository.updateappdec(appid);
	}

	@Override
	public Application visaapplication(String appname) {
		
		return applicationRepository.visaapplication(appname);
	}

}
