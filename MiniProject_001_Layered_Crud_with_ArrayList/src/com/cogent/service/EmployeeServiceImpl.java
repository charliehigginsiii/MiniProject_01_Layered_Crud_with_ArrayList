package com.cogent.service;

import java.util.List;

import com.cogent.bean.EmployeeBean;
import com.cogent.repo.EmployeeRepo;
import com.cogent.repo.EmployeeRepoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	EmployeeRepo Repo=new EmployeeRepoImpl();
	@Override
	public void addNewEmployee(EmployeeBean employee) {
		Repo.addNewEmployee(employee);
		
	}
	
	@Override
	public List<EmployeeBean> viewAllEmployees() {
		return Repo.viewAllEmployees();
	}

	@Override
	public EmployeeBean findEmployeeById(long id) {
		return Repo.findEmployeeById(id);
	}

	@Override
	public void deleteEmployeebyId(long id) {
		Repo.deleteEmployeebyId(id);	
	}
	@Override
	public EmployeeBean findTheYoungestEmployee() {
		return Repo.findTheYoungestEmployee();
	}
	@Override
	public List<EmployeeBean> displayAllEmployeeFromCountry(String country) {
		return Repo.displayAllEmployeeFromCountry(country);
	}
	@Override
	public List<EmployeeBean> displayAllEmployeeFromCity(String city) {
		return Repo.displayAllEmployeeFromCity(city);
	}



}
