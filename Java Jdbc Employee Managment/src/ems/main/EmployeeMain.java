package ems.main;

import java.util.List;

import ems.Employee;
import ems.service.EmployeeServiceImpl;
import ems.service.IEmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IEmployeeService eservice = new EmployeeServiceImpl();
		eservice.addEmployee( new Employee(101,"ANKUR","PROJECT Manager",25));
		eservice.addEmployee( new Employee(102,"Poojith","Senior Developer",26));
		eservice.addEmployee( new Employee(103,"vikas","Developer",27));
		eservice.addEmployee( new Employee(104,"satsweerBabu","Lead Developerr",216));
		
		System.out.println();
		
		List<Employee> elist = eservice.showAllEmployees();
		for(Employee e: elist) {
			System.out.println(e.getEmpid()+":"+e.getEmpname()+":"+e.getDesignation()+":"+e.getDaysAttended());
			System.out.println("");
		}
		
		eservice.deleteEmployee(1111);
		eservice.updateEmployee( new Employee (105,"updated","LeadDeveloper",29));
		

	}

}
