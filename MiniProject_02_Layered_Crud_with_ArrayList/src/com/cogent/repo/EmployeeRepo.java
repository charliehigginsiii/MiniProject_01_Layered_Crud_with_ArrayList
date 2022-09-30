package com.cogent.repo;

import java.util.List;

import com.cogent.bean.EmployeeBean;

public interface EmployeeRepo {
	void addNewEmployee(EmployeeBean employee);
	List<EmployeeBean>viewAllEmployees();
	EmployeeBean findEmployeeById(long id);
	void deleteEmployeebyId(long id);
	EmployeeBean findTheYoungestEmployee();
	List<EmployeeBean> displayAllEmployeeFromCountry(String country);
	List<EmployeeBean>displayAllEmployeeFromCity(String city);
}
