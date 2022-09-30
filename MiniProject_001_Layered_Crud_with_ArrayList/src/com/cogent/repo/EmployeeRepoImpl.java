package com.cogent.repo;

import java.util.ArrayList;
import java.util.List;

import com.cogent.bean.EmployeeBean;

public class EmployeeRepoImpl implements EmployeeRepo {
	ArrayList<EmployeeBean> Employees=new ArrayList();
	{
		Employees.add(new EmployeeBean(1,"Charlie","Higgins","c@gmail.com",24,false,"Atlanta","United States of America"));
		Employees.add(new EmployeeBean(2,"Sampson","Jackson","s@ymail.com",25,false,"New York","United States of America"));
		Employees.add(new EmployeeBean(3,"Rajesh","Singh","r@gmail.com",26,false,"Bangalore","India"));
		Employees.add(new EmployeeBean(4,"Aliko","Olatunji","a@gmail.com",22,true,"Kaduna","Nigeria"));
		Employees.add(new EmployeeBean(5,"Narendra","Patel","n@gmail.com",40,true,"New Delhi","India"));
	}
	@Override
	public void addNewEmployee(EmployeeBean employee) {
		Employees.add(employee);
		
	}
	@Override
	public List<EmployeeBean> viewAllEmployees() {
		return Employees;
	}
	@Override
	public EmployeeBean findEmployeeById(long id) {
		EmployeeBean employee=null;
		for(int i=0;i<Employees.size();i++) {
			if(Employees.get(i).getEmployeeId()==id) {
				employee=Employees.get(i);
			}
		}
		return employee;
	}
	@Override
	public void deleteEmployeebyId(long id) {
		for(int i=0;i<Employees.size();i++) {
			if(Employees.get(i).getEmployeeId()==id) {
				Employees.remove(i);
			}
		}
	}

	@Override
	public EmployeeBean findTheYoungestEmployee() {
		EmployeeBean youngest=null;
		int min=0;
		if(Employees.size()>0) {
			min=Employees.get(0).getEmployeeAge();
			for(int i=0;i<Employees.size();i++) {
				if(Employees.get(i).getEmployeeAge()<min) {
					min=Employees.get(i).getEmployeeAge();
					youngest=Employees.get(i);
				}
			}
		}else {
			System.out.println("There are no employees");
		}
		return youngest;
	}

	@Override
	public List<EmployeeBean> displayAllEmployeeFromCountry(String country) {
		List<EmployeeBean> countryEmployees=new ArrayList();
		for(int i=0;i<Employees.size();i++) {
			if(Employees.get(i).getEmployeeCountry().contentEquals(country)) {
				countryEmployees.add(Employees.get(i));
			}
		}
		return countryEmployees;
	}

	@Override
	public List<EmployeeBean> displayAllEmployeeFromCity(String city) {
		List<EmployeeBean> cityEmployees=new ArrayList();
		for(int i=0;i<Employees.size();i++) {
			if(Employees.get(i).getEmployeeCity().contentEquals(city)) {
				cityEmployees.add(Employees.get(i));
			}
		}
		return cityEmployees;
	}

}
