package com.keke.jpademo.repository;

import com.keke.jpademo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Administrator
 */
@Repository
public interface EmpRepository extends JpaRepository<Employee,Integer> {

}
