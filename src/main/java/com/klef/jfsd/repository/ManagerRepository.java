package com.klef.jfsd.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.model.Manager;

@Repository
public interface ManagerRepository extends CrudRepository<Manager, String>
{
	@Query("select m from Manager m where username=?1 and password=?2")
	public Manager checkmanlogin(String manname,String manpwd);
}
