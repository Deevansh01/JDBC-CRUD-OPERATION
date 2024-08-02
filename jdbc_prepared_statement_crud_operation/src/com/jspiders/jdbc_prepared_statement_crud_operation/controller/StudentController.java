package com.jspiders.jdbc_prepared_statement_crud_operation.controller;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.jspiders.jdbc_prepared_statement_crud_operation.dao.StudentDao;
import com.jspiders.jdbc_prepared_statement_crud_operation.dto.Student;

public class StudentController {
		public static void main(String[] args) {
			StudentDao sd=new StudentDao();
			Scanner sc=new Scanner(System.in);
			while(true){
				System.out.println("Enter The Option");
				System.out.println("1.Insert\n2.Display\n3.Update\n4.Delete\n5.Display Single Student data\n6.Save Multiple Student\n7.Exit");
				int input=sc.nextInt();
				sc.nextLine();
				switch(input) {
				
				case 1:{
					System.out.println("Enter Your Name: ");
					String name=sc.nextLine();
					
					System.out.println("Enter Your Email: ");
					String email=sc.nextLine();
					
					System.out.println("Enter Your Phone: ");
					Long phone=sc.nextLong();
					
					System.out.println("Enter Your DOB: ");
					String dob=sc.next();
					
					System.out.println("Enter Your Gender: ");
					String gender=sc.next();
					
					Student student=new Student(name, email, phone, LocalDate.parse(dob), gender);
					Student student2=sd.saveStudentDao(student);
					if(student2!=null) {
						System.out.println("Data Stored....");
					}
					else {
						System.out.println("Data not stored please check your code....");
					}
				}
				break;
				case 2:{
					Student[] student = sd.displayAllStudent();
					
					for (Student student2 : student) {
						if(student2!=null)
						System.out.println(student2);
					}
					
				}
				break;
				case 3:{
					System.out.println("ENTER Student Id to update Student name");
					int id=sc.nextInt();
					System.out.println("Enter Student new name to update");
					String name=sc.next();
					
					int value= sd.updateStudentNameByStudentIdDao(name, id);
					if(value==1) {
						System.out.println("DATA UPDATED");
					}
					else {
						System.out.println("Id is invalid");
					}
					
					
				}
				break;
				case 4:{
					System.out.println("Enter the Student Id");
					int id=sc.nextInt();
					int value = sd.deleteStudentByIdDao(id);
					if(value==1)
					{
						System.out.println("Data Deleted Successfully");
					}else {
						System.out.println("Data to be deleted is invalid");
					}
					
				}
				break;
				case 5:{
					System.out.println("Enter the id for the single student data : ");
					int id=sc.nextInt();
					Student student=sd.getStudentByIdDao(id);
					
					if(student!=null) {
						System.out.println(student);
					}
				}
				break;
				case 6:{
					System.out.println("Enter how many students you want to add");
					int size=sc.nextInt();
					System.out.println("Enter students details");
					List<Student> students= new ArrayList<Student>();
					int j=1;
					for(int i=0;i<size;i++)
					{
						
						System.out.println("Enter Student name");
						sc.nextLine();
						String name=sc.nextLine();
						System.out.println("Enter Student email");
						String email=sc.next();
						System.out.println("Enter Student phone");
						Long phone=sc.nextLong();
						System.out.println("Enter Student dob");
						String dob=sc.next();
						System.out.println("Enter Student gender");
						String gender=sc.next();
						
						Student student=new Student(name, email, phone, LocalDate.parse(dob), gender);
						students.add(student);
						
						j++;
					}
					sd.saveMultipleStudentDao(students);
				}
				break;
				case 7:{
					System.out.println("PROGRAM ENDS...!!");
					return;
				}	
				}
			}
			
		}
	}

