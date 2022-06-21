package ems.main;
import ems.service.*;


import java.util.List;
import java.util.Scanner;

import ems.Employee;
import ems.exception.EmployeeNotFoundException;
import ems.service.EmployeeServiceImpl;
import ems.service.IEmployeeService;

public class EmployeeMain {

	public static void main(String[] args) throws EmployeeNotFoundException {
		// TODO Auto-generated method stub
		
//		IEmployeeService eservice = new EmployeeServiceImpl();
//		eservice.addEmployee( new Employee(101,"ANKUR","PROJECT Manager",25));
//		eservice.addEmployee( new Employee(102,"Poojith","Senior Developer",26));
//		eservice.addEmployee( new Employee(103,"vikas","Developer",27));
//		eservice.addEmployee( new Employee(104,"satsweerBabu","Lead Developerr",216));
//		
//		System.out.println(" ");
//		
////		List<Employee> elist = eservice.showAllEmployees();
////		for(Employee e: elist) {
////			System.out.println(e.getEmpid()+":"+e.getEmpname()+":"+e.getDesignation()+":"+e.getDaysAttended());
////			System.out.println("");
////
////		}
//
//		
//		eservice.deleteEmployee(101);
//		eservice.updateEmployee( new Employee (102,"amber","LeadDeveloper",219));
//		Employee temp = eservice.findEmployee(new Employee(102,"amber","LeadDeveloper",28));
//		

//}
//
//}
		System.out.println("Welcome to employee  Management App");
		  Scanner scn = new Scanner(System.in);
		while(true)
		{
			System.out.println("Press 1 to add student");
			System.out.println("Press 2 to delete the student");
			System.out.println("Press 3 to display the student");
			System.out.println("Press 4 to udate the student");
			System.out.println("Press 5 to exit");
			int c = Integer.parseInt(scn.next());
			
			if(c==1)
			{
				//add student
				System.out.println("Enter user id : ");
				String name = scn.next();
				
				System.out.println("Enter user name : ");
				String phone = scn.next();
				
				System.out.println("Enter user posting : ");
				String city = scn.next();
				
				System.out.println("Enter user age : ");
				String age = scn.next();
				
				//create student object to store student
				IEmployeeService eservice = new EmployeeServiceImpl();
				boolean answer = eservice.addEmployee( newEmployee);

//				if(answer)
//				{
//					System.out.println("Student is successfully added...");
//				}else
//				{
//					System.out.println("something went wrong..");
//				}
				
				System.out.println(eservice);
				
//				
		}
//			else if(c==2)
//			{
//				//delete student
//				System.out.println("Enter student id to delete : ");
//				int userId = Integer.parseInt(br.readLine());
//				boolean f = StudentDao.deleteStudent(userId);
//				if(f)
//				{
//					System.out.println("Deleted");
//				}else
//				{
//					System.out.println("something went wrong...");
//				}
//			}
//			else if(c==3)
//			{
//				//display student
//eservice.showAllStudents();
//			}
//			else if(c==4)
//			{
//				System.out.println("Enter user name : ");
//				String name = br.readLine();
//				
//				System.out.println("Enter user id : ");
//				Integer id = br.read();
//				
//				Student st1 = new Student();
//			    //int first_value = Integer.parseInt(br.readLine());
//				boolean st = StudentDao.updateStudents(st1);
//				
//				// f= StudentDao.updateStudents(answer);
//				
//				
//				/*if(answer) 
//				{
//					System.out.println("Student is successfully udate...");
//				}else
//				{
//					System.out.println("something went wrong..");
//				}
//				
//				System.out.println(st);*/
//				
//			} else if(c==5)
//			{
//				break;
//			}
//		}
//		System.out.println("Thank you for using this application");

	}

}
}
	