package ems.dao;

import ems.exception.EmployeeNotFoundException;
import java.util.List;
import ems.Employee;

import java.util.List;

public interface IEmployeeDAO {
	
	public abstract void addEmployee(Employee e);
	public abstract void deleteEmployee (int empid);
	public abstract void updateEmployee(Employee e);
	public abstract Employee findEmployee(Employee e) throws EmployeeNotFoundException;
	public List<Employee> showAllEmployees();
	
	public static final String URL ="jdbc:mysql://localhost:3306/Jdeveloper";
	public static final String USERNAME ="root";
//	public static final String USERNAME ="root";
	public static final String PASSWORD ="1234";
	public static final String DRIVER_CLASSNAME ="com.mysql.jdbc.Driver";



	

}
