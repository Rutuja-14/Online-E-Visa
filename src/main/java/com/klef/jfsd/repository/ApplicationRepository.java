package com.klef.jfsd.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.model.Application;
import com.klef.jfsd.model.Customer;

@Repository
public interface ApplicationRepository extends CrudRepository<Application, Integer>
{
	@Transactional
	@Modifying
	@Query("update Application a  set a.status='Approved' where a.id=?1")
	public int updateapp(int appid);
	
	@Transactional
	@Modifying
	@Query("update Application a  set a.status='Declined' where a.id=?1")
	public int updateappdec(int appid);
	
	@Query("select a from Application a where name=?1")
	public Application visaapplication(String appname);
}
