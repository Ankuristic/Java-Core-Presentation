package ems.service;

import java.util.List;

import ems.Employee;
import ems.exception.EmployeeNotFoundException;

public interface IEmployeeService {
	
	public abstract void addEmployee(Employee e);
	public abstract void deleteEmployee (int empid);
	public abstract void updateEmployee(Employee e);
	public abstract Employee findEmployee(Employee e) throws EmployeeNotFoundException;
	public List<Employee> showAllEmployees();

}
