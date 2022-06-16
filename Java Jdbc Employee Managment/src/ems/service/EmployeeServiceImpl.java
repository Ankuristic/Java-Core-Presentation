package ems.service;

import java.util.List;

import ems.Employee;
import ems.dao.EmployeeDAOMySqlImpl;
import ems.dao.IEmployeeDAO;
import ems.exception.EmployeeNotFoundException;

public class EmployeeServiceImpl implements IEmployeeService {
	private IEmployeeDAO empDao = new EmployeeDAOMySqlImpl();

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		empDao.addEmployee(e);
		
	}

	@Override
	public void deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		empDao.deleteEmployee(empid);
		
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		empDao.updateEmployee(e);
		
	}

	@Override
	public Employee findEmployee(Employee e) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		return  empDao.findEmployee(e);
	}

	@Override
	public List<Employee> showAllEmployees() {
		// TODO Auto-generated method stub
		return empDao.showAllEmployees();
	}

}
