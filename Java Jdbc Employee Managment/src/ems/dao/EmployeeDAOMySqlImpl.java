package ems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import ems.Employee;
import ems.exception.EmployeeNotFoundException;

public class EmployeeDAOMySqlImpl  implements IEmployeeDAO{
	
	private Connection cn = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	
	 public static final String INS_COMMAND ="INSERT INTO employee VALUES(?,?,?,?)";
	 public static final String UPDATE_COMMAND ="UPDATE  employee SET empname=?, designation=?,dayattende=? WHERE  empid=?";
	 public static final String DELETE_COMMAND="DELETE FROM employee where empid =?";
     public static final String FIND_COMMAND="SELECT * FROM employee Where empid =?";
     public static final String  SELECT_ALL ="SELECT * FROM employee";

 public EmployeeDAOMySqlImpl() {
	 try {
		cn=DriverManager.getConnection(IEmployeeDAO.URL,IEmployeeDAO.USERNAME,IEmployeeDAO.PASSWORD);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println("Unable to Establish Connection");
		e.printStackTrace();
	}
 }

	@Override
	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		 int i =0;
		 try {
		 pst = cn.prepareStatement(INS_COMMAND);
		 pst.setInt(1,e.getEmpid());
		 pst.setString(2, e.getEmpname());
		 pst.setString(3, e.getDesignation());
		 pst.setInt(4,e.getDaysAttended());
		 i = pst.executeUpdate();
		 if(i>1) {
			 System.out.println("Records added");
		 }
		 }catch(SQLException e1) {
			 System.out.println("UNABLE TO  exceute insert ");
			 e1.printStackTrace();
		 }
		 
		
	}

	@Override
	public void deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		 int i =0;
		 try {
		 pst = cn.prepareStatement(DELETE_COMMAND);
		 pst.setInt(1,empid);
//		 pst.setString(2, e.getEmpname());
//		 pst.setString(3, e.getDesignation());
//		 pst.setInt(4,e.getDaysAttended());
		 i = pst.executeUpdate();
		 if(i>1) {
			 System.out.println("Records added");
		 }
		 }catch(SQLException e1) {
			 System.out.println("UNABLE TO  delete operation ");
			 e1.printStackTrace();
		 } finally {
			 try {
				 pst.close();
				 
			 } catch(SQLException e) {
				 e.printStackTrace();
			 }
		 }
		
	}

	@Override
	public void updateEmployee(Employee e) {
		// TODO Auto-generated method stub
		 int i =0;
		 try {
		 pst = cn.prepareStatement(UPDATE_COMMAND);
		 pst.setInt(4,e.getEmpid());
		 pst.setString(1, e.getEmpname());
		 pst.setString(2, e.getDesignation());
		 pst.setInt(3,e.getDaysAttended());
		 i = pst.executeUpdate();
		 if(i>1) {
			 System.out.println("Records added");
		 }
		 }catch(SQLException e1) {
			 System.out.println("UPDATE  TO   Record Failed  ");
			 e1.printStackTrace();
		 } finally {
			 try {
			 pst.close();
			 
		 } catch(SQLException e1) {
			 e1.printStackTrace();
		 }
		 }
		
	}

	@Override
	public Employee findEmployee(Employee e) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		Employee findTemp =null;
		try {
			pst = cn.prepareStatement(FIND_COMMAND);
		} catch (SQLException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			pst .setInt(1, e.getEmpid());
			rs= pst.executeQuery();
			if(!rs.next()) {
				throw new EmployeeNotFoundException();
				}
			findTemp = new Employee();
			findTemp.setEmpname(rs.getString("empname"));
			findTemp.setDesignation(rs.getString("designation"));
			findTemp.setDaysAttended(rs.getInt("dayattended"));
			findTemp.setEmpid(e.getEmpid());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (EmployeeNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return findTemp;
	}

	@Override
	public List<Employee> showAllEmployees() {
		// TODO Auto-generated method stub
		Employee selectAllTemp = null;
		List <Employee> elist =  new LinkedList<>();
		 try {
			pst = cn.prepareStatement(SELECT_ALL);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			rs =pst.executeQuery();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			while(rs.next()) {
				selectAllTemp = new Employee();
				selectAllTemp.setEmpid(rs.getInt("empid"));
				try {
					selectAllTemp.setEmpname(rs.getString("empname"));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					selectAllTemp.setDesignation(rs.getString("designation"));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					selectAllTemp.setDaysAttended(rs.getInt("dayattende"));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}


			}
			elist.add(selectAllTemp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return elist;
	}
	

}
