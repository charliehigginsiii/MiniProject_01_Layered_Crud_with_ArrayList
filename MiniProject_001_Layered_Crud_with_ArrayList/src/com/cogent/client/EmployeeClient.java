package com.cogent.client;

import java.util.List;
import java.util.Scanner;

import com.cogent.bean.EmployeeBean;
import com.cogent.service.EmployeeService;
import com.cogent.service.EmployeeServiceImpl;

public class EmployeeClient {
	public static void main(String[]args) {
		EmployeeService Service=new EmployeeServiceImpl();
		boolean runprogram=true;
		while(runprogram) {
			for(int i=0;i<81;i++) {
				if(i<36) {
					System.out.print("* ");
				}else if(i>=36&&i<37) {
					System.out.println();
					System.out.println("Book Library");
				}else if(i>=37&&i<73) {
					System.out.print("* ");
				}else if(i==73) {
					System.out.println();
					System.out.println("1. Add Employee");
				}else if(i==74) {
					System.out.println("2. Delete Employee By Id");
				}else if(i==75) {
					System.out.println("3. Find Employee by Id");
				}else if(i==76) {
					System.out.println("4. View All Employees");
				}else if(i==77) {
					System.out.println("5. Find Youngest Employee");
				}else if(i==78) {
					System.out.println("6. Display Employees from India");
				}else if(i==79) {
					System.out.println("7. Display Employees from Bangalore, India");
				}else if(i==80) {
					System.out.println("8. Exit");
				}
			}
			System.out.println("Enter Number: ");
			int number=new Scanner(System.in).nextInt();
			if(number==1) {
				System.out.println("Enter Employee Id: ");
				long empId=new Scanner(System.in).nextLong();
				System.out.println("Enter Employee First name: ");
				String empFname=new Scanner(System.in).nextLine();
				System.out.println("Enter Employee Last name: ");
				String empLname=new Scanner(System.in).nextLine();
				System.out.println("Enter Employee Email: ");
				String empEmail=new Scanner(System.in).nextLine();
				System.out.println("Enter Employee Age: ");
				int empAge=new Scanner(System.in).nextInt();
				System.out.println("Enter Employee Martial Status: ");
				boolean empMartialStatus=new Scanner(System.in).nextBoolean();
				System.out.println("Enter Employee City: ");
				String empCity=new Scanner(System.in).nextLine();
				System.out.println("Enter Employee Country: ");
				String empCountry=new Scanner(System.in).nextLine();
				Service.addNewEmployee(new EmployeeBean(empId,empFname,empLname,empEmail,empAge,empMartialStatus,empCity,empCountry));
			}else if(number==2) {
				System.out.println("Enter Employee Id: ");
				long employeeId=new Scanner(System.in).nextLong();
				Service.deleteEmployeebyId(employeeId);
			}else if (number==3) {
				System.out.println("Enter Employee ID: ");
				long id=new Scanner(System.in).nextLong();
				EmployeeBean employee=Service.findEmployeeById(id);
				System.out.println("Employee Id: "+employee.getEmployeeId()+" ");
				System.out.println("Employee First Name: "+employee.getEmployeeFname()+" ");
				System.out.println("Employee Last Name: "+employee.getEmployeeLname()+" ");
				System.out.println("Employee Email: "+employee.getEmployeeEmail()+" ");
				System.out.println("Employee Age: "+employee.getEmployeeAge()+" ");
				System.out.println("Is the employee married: "+employee.isEmployeeIsMarried()+" ");
				System.out.println("Employee's City: "+employee.getEmployeeCity()+" ");
				System.out.println("Employee's Country: "+employee.getEmployeeCountry());
				System.out.println();
			}else if(number==4) {
				List<EmployeeBean> EmployeesList=Service.viewAllEmployees();
				for(int i=0;i<EmployeesList.size();i++) {
					System.out.println("Employee Id: "+EmployeesList.get(i).getEmployeeId()+" ");
					System.out.println("Employee First Name: "+EmployeesList.get(i).getEmployeeFname()+" ");
					System.out.println("Employee Last Name: "+EmployeesList.get(i).getEmployeeLname()+" ");
					System.out.println("Employee Email: "+EmployeesList.get(i).getEmployeeEmail()+" ");
					System.out.println("Employee Age: "+EmployeesList.get(i).getEmployeeAge()+" ");
					System.out.println("Is the employee married: "+EmployeesList.get(i).isEmployeeIsMarried()+" ");
					System.out.println("Employee's City: "+EmployeesList.get(i).getEmployeeCity()+" ");
					System.out.println("Employee's Country: "+EmployeesList.get(i).getEmployeeCountry());
					System.out.println();
					System.out.println();
				}
			}
			else if(number==5) {
				EmployeeBean youngestEmployee=Service.findTheYoungestEmployee();
				System.out.println("Employee Id: "+youngestEmployee.getEmployeeId()+" ");
				System.out.println("Employee First Name: "+youngestEmployee.getEmployeeFname()+" ");
				System.out.println("Employee Last Name: "+youngestEmployee.getEmployeeLname()+" ");
				System.out.println("Employee Email: "+youngestEmployee.getEmployeeEmail()+" ");
				System.out.println("Employee Age: "+youngestEmployee.getEmployeeAge()+" ");
				System.out.println("Is the employee married: "+youngestEmployee.isEmployeeIsMarried()+" ");
				System.out.println("Employee's City: "+youngestEmployee.getEmployeeCity()+" ");
				System.out.println("Employee's Country: "+youngestEmployee.getEmployeeCountry());
			}else if(number==6) {
				System.out.print("Enter Employee's Country:  ");
				//String empCountry=new Scanner(System.in).nextLine();
				List<EmployeeBean> EmployeesfromCountryList=Service.displayAllEmployeeFromCountry("India"/*empCountry*/);
				for(int i=0;i<EmployeesfromCountryList.size();i++) {
					System.out.println("Employee Id: "+EmployeesfromCountryList.get(i).getEmployeeId()+" ");
					System.out.println("Employee First Name: "+EmployeesfromCountryList.get(i).getEmployeeFname()+" ");
					System.out.println("Employee Last Name: "+EmployeesfromCountryList.get(i).getEmployeeLname()+" ");
					System.out.println("Employee Email: "+EmployeesfromCountryList.get(i).getEmployeeEmail()+" ");
					System.out.println("Employee Age: "+EmployeesfromCountryList.get(i).getEmployeeAge()+" ");
					System.out.println("Is the employee married: "+EmployeesfromCountryList.get(i).isEmployeeIsMarried()+" ");
					System.out.println("Employee's City: "+EmployeesfromCountryList.get(i).getEmployeeCity()+" ");
					System.out.println("Employee's Country: "+EmployeesfromCountryList.get(i).getEmployeeCountry());
					System.out.println();
				}
			}else if(number==7) {
				System.out.print("Enter Employee's City:  ");
				//String empCity=new Scanner(System.in).nextLine();
				List<EmployeeBean> EmployeesfromCityList=Service.displayAllEmployeeFromCity("Bangalore"/*empCity*/);
				for(int i=0;i<EmployeesfromCityList.size();i++) {
					if(Service.displayAllEmployeeFromCountry("India").get(0).getEmployeeCountry().contentEquals(EmployeesfromCityList.get(i).getEmployeeCountry())) {
						System.out.println("Employee Id: "+EmployeesfromCityList.get(i).getEmployeeId()+" ");
						System.out.println("Employee First Name: "+EmployeesfromCityList.get(i).getEmployeeFname()+" ");
						System.out.println("Employee Last Name: "+EmployeesfromCityList.get(i).getEmployeeLname()+" ");
						System.out.println("Employee Email: "+EmployeesfromCityList.get(i).getEmployeeEmail()+" ");
						System.out.println("Employee Age: "+EmployeesfromCityList.get(i).getEmployeeAge()+" ");
						System.out.println("Is the employee married: "+EmployeesfromCityList.get(i).isEmployeeIsMarried()+" ");
						System.out.println("Employee's City: "+EmployeesfromCityList.get(i).getEmployeeCity()+" ");
						System.out.println("Employee's Country: "+EmployeesfromCityList.get(i).getEmployeeCountry());
						System.out.println();
					}
				}
			}else if(number==8) {
				runprogram=false;
				break;
			
			}
		}
	}

}
