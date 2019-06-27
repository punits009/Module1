package com.cg.pl;

import com.cg.bean.Department;
import com.cg.bean.Employee;
import com.cg.service.EmployeeService;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.*;
import java.util.List;

public class UserInterface {
	public static void main(String[] args) {
		EmployeeService service = new EmployeeService();
		Map<Integer,Employee> acc=new HashMap<>();
		Employee emp = new Employee();
		emp.setEmployeeId(100);
		emp.setSalary(1000.00);
		emp.setFirstName("Rahul");
		emp.setLastName("Sharma");
		emp.setDepartment(new Department(101, "AUTO", 100,null));
		service.addEmp(emp);
		
		Calendar d=Calendar.getInstance();
		d.set(2019, 06, 25);
		emp.setHireDate(d);
		service.addEmp(emp);
		String l=service.getHireDateDetails(100);
		System.out.println(l);
				
		emp = new Employee();
		emp.setEmployeeId(101);
		emp.setSalary(1000.00);
		emp.setDepartment(new Department(100, "Mac", 100,emp));
		service.addEmp(emp);
		
		emp = new Employee();
		emp.setEmployeeId(102);
		emp.setFirstName("Punit");
		emp.setDepartment(null);
		emp.setSalary(1000.00);
		service.addEmp(emp);
		
		System.out.println("Sumof salary is="+service.getSalarySum());
		System.out.println("Department and there employees are");
		service.getDepartAndEmpCount().stream().forEach(System.out::println);
		System.out.println("employee without department are");
		service.getEmployeesWithoutDepartment().stream().forEach(System.out::println);
		System.out.println("department without employee are");
		service.getDepartmentWithoutEmployee().stream().forEach(a->System.out.println(a.getDepartmentId()));
		//List<String> l=service.getHireDateDetails(101);
		//System.out.println(l);
	}
}
