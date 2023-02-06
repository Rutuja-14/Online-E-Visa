package com.klef.jfsd.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.model.Accountant;

@Repository
public interface AccountantRepository extends CrudRepository<Accountant, String>
{
	@Query("select a from Accountant a where username=?1 and password=?2")
	public Accountant checkaccountanttlogin(String auname,String apwd);
}
