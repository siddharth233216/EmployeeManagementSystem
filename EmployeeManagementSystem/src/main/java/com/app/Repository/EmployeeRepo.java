package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.Entity.*;
public interface  EmployeeRepo extends JpaRepository<Employee,Long> {

}
