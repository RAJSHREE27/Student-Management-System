
//main class
//to choose an option from here to what operation to be performed in set of student data!

import java.util.Scanner;

public class StudentDemo{
	
		 public static void main(String args[]){
		
						Scanner scan = new Scanner(System.in);
						SearchStudent sd= new SearchStudent();
						
						try{
							
								StudentDetails []stdtls = new StudentDetails[11];
																								//INITIAL RECORDS
								stdtls [0] = new StudentDetails(22, "Rajat", 21, "Male", 67.6f, "CSE");
								stdtls [1] = new StudentDetails(34, "Krishna", 22, "Male", 45.0f, "Electronics");
								stdtls [2] = new StudentDetails(90, "Pratibha", 20, "Female", 93.8f, "Civil");
								stdtls [3] = new StudentDetails(32, "Shiv", 20, "Male", 88.8f, "Geology");
								stdtls [4] = new StudentDetails(67, "Varsha", 22, "Female", 90.4f, "Information & Technology");
								stdtls [5] = new StudentDetails(82, "Veerey", 21, "Female", 23.8f, "Biotech");
								stdtls [6] = new StudentDetails(21, "Varun", 23, "Male", 87.2f, "Metallurgy");
								stdtls [7] = new StudentDetails(67, "Salman", 20, "Male", 21.6f, "Mining");
								stdtls [8] = new StudentDetails(80, "Rahim", 23, "Male", 56.8f, "Biomed");
								stdtls [9] = new StudentDetails(56, "Ashish", 25, "Male", 99.9f, "Electrical");
								stdtls [10]= new StudentDetails(99, "Kiran", 20, "Female", 33.3f, "CSE");
								
								int totalIndex =11;
								
								int answer;
								
								System.out.println("\n ------------------------------------------------------------------------------------------------");
								System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ STUDENT MANAGEMENT SYSTEM @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
								System.out.println("------------------------------------------------------------------------------------------------\n");
								
								System.out.println("\n Operations to be performed on student's data :: ");
								System.out.println("\n 			1. Insertion of new Student data ");
								System.out.println("\n			2. Search any Student data ");
								System.out.println("\n			3. Sort the student data ");
								System.out.println("\n			4. Remove any specific data ");	//vanish the reord
								System.out.println("\n			5. Delete any student data ");//make all the attributes null
								System.out.println("\n			6. Display all the Student data   ");
								System.out.println("\n ----------------------------------------------------------------------------------------------");
								
							while(true){
										System.out.print("\n 		Enter your choice (1-6) : ");
										answer = scan.nextInt();
										
								switch(answer){
									
									case 1 :  System.out.println("\n	@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ INSERTION @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n");
												
												System.out.print("\n 	  Enter the number of students whose data you want to add : ");
												int numberOfStudents = scan.nextInt();
												
												StudentDetails []std = new StudentDetails[numberOfStudents];
												
												for(int index = 1; index<= numberOfStudents ; index++){
													
													System.out.println(" 	................................................\n");
													
													System.out.print("\n		enter student's name  : ");
													String name = new Scanner(System.in).nextLine();
													
													
													System.out.print("\n		enter student ID (integer ): ");
													int id = new Scanner(System.in).nextInt();
													
													System.out.print("\n		enter student's age : ");
													int age = new Scanner(System.in).nextInt();
													
													System.out.print("\n		enter student's Gender : ");
													String gen = new Scanner(System.in).nextLine();
													
													System.out.print("\n		enter student's marks  : ");
													float mark = new Scanner(System.in).nextFloat();
													
													System.out.print("\n		enter student's branch : ");
													String brch = new Scanner(System.in).nextLine();
													
													std[index-1] = new StudentDetails(id, name, age, gen, mark, brch);
													
													
												}
												//totalIndex+= numberOfStudents;
												
												StudentDetails []student = new StudentDetails[totalIndex+numberOfStudents];
												
												for(int index= 1; index<= totalIndex; index++){
													student[index-1] = stdtls[index-1];
												}
												for(int index= totalIndex+1; index<= totalIndex+numberOfStudents; index++){
													student[index-1] = std[index-1-totalIndex];
												}
												
												totalIndex+= numberOfStudents;
												stdtls = student;
												
												for(int i = 1; i<= totalIndex; i++){
													stdtls[i-1].ShowDetails();
												}
												
												break;
									
									case 2	: System.out.println("\n	@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ SEARCHING @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n");
											  System.out.println("\n 	----------------------------------------------------------------------------\n");
											  System.out.println("	 			Search by : ");
											  System.out.println("\n		 	a.	Student Name  ");
											  System.out.println("\n		 	b.	Student ID  ");
											  System.out.println("\n		 	c.	Student Gender  ");
											  System.out.println("\n		 	d.	Student Age  ");
											  System.out.println("\n		 	e.	Student Branch  ");
											  System.out.println("\n		 	f.	Student Mark  ");
											  System.out.println("\n 	----------------------------------------------------------------------------\n");
											  System.out.print("			Enter you choice (a-e) : ");
											  char ans = new Scanner(System.in).nextLine().charAt(0);
											  
											  switch(ans){
												  
													case 'a'	:
																System.out.print("\n 		Enter the name you want to search : ");
																String enteredName = new Scanner(System.in).nextLine();
																System.out.println("\n");
																
																try{
																		for(int i =1; i<=5; i++){
																			System.out.print("		@ ");
																			Thread.sleep(1000);
																		}
																}catch(Exception e){}
																
																 System.out.println("\n");
																sd.SearchStudentByName(stdtls,enteredName,totalIndex);
																
																break;
																
												   case 'b'	:	System.out.print("\n 		Enter the ID you want to search : ");
																int enteredID = new Scanner(System.in).nextInt();
																System.out.println("\n");
																try{
																		for(int i =1; i<=5; i++){
																			System.out.print("		@ ");
																			Thread.sleep(1000);
																		}
																}catch(Exception e){}
																
																System.out.println("\n");
																
																sd.SearchStudentByID(stdtls, enteredID, totalIndex);
																break;
																
													case 'c'  :	System.out.print("\n		Enter the Gender you want to search : ");
																String enteredGender = new Scanner(System.in).nextLine();
																System.out.println("\n");
																
																try{
																		for(int i =1; i<=5; i++){
																			System.out.print("		@ ");
																			Thread.sleep(1000);
																		}
																}catch(Exception e){}
																
																System.out.println("\n");
																
																sd.SearchStudentByGender(stdtls,enteredGender, totalIndex);
																break;
												 
												 
													case 'd'  :	System.out.print("\n         Enter the age of student you want to search : ");
																int enteredAge = new Scanner(System.in).nextInt();
																System.out.println("\n");
																
																try{
																		for(int i =1; i<=5; i++){
																			System.out.print("		@ ");
																			Thread.sleep(1000);
																		}
																}catch(Exception e){}
																
																System.out.println("\n");
																
																sd.SearchStudentByAge(stdtls,enteredAge,totalIndex);
																break;
															
													case 'e'  :	System.out.print("\n		Enter the Branch you want to search : ");
																String enteredBranch = new Scanner(System.in).nextLine();
																System.out.println("\n");
																
																try{
																		for(int i =1; i<=5; i++){
																			System.out.print("		@ ");
																			Thread.sleep(1000);
																		}
																}catch(Exception e){}
																
																System.out.println("\n");
																
																sd.SearchStudentByBranch(stdtls,enteredBranch, totalIndex);
																break;
												 
																
																
													case 'f'  :	System.out.print("\n			Enter the mark you want to search : ");
																float enteredMark = new Scanner(System.in).nextFloat();
																System.out.println("\n");
																try{
																		for(int i =1; i<=5; i++){
																			System.out.print("		@ ");
																			Thread.sleep(1000);
																		}
																}catch(Exception e){}
																
																System.out.println("\n");
																
																sd.SearchStudentByMark(stdtls, enteredMark,totalIndex);
																break;
																
												 
													 default	: System.out.println("\n				xxxxxxxxxxxxxx INVALID CHOICE xxxxxxxxxxxxxx ");
																javax.swing.JOptionPane.showMessageDialog(null,"INVALID CHOICE");
												
													}
											  
													break;
											
									  case 3 	:	System.out.println("\n	@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ SORTING @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n");
														  System.out.println("\n 	----------------------------------------------------------------------------\n");
														  System.out.println("	 			Sort by : ");
														  System.out.println("\n		 	a.	Student Name  ");
														  System.out.println("\n		 	b.	Student ID  ");
														  System.out.println("\n		 	c.	Student Gender  ");
														  System.out.println("\n		 	d.	Student Age  ");
														  System.out.println("\n		 	e.	Student Branch  ");
														  System.out.println("\n		 	f.	Student Mark  ");
														  System.out.println("\n 	----------------------------------------------------------------------------\n");
														  System.out.print("			Enter you choice (a-e) : ");
														  char ans2 = new Scanner(System.in).nextLine().charAt(0);
														  
														  SortStudent st = new SortStudent();
														  System.out.println("\n");
														  
														  try{
																		for(int i =1; i<=5; i++){
																			System.out.print("		@ ");
																			Thread.sleep(1000);
																		}
																}catch(Exception e){}
																
														  
														  switch(ans2){
															  
															  case 'a'	: 	 System.out.println("\n	-------------------------------------------------------------------\n"); 
																			st.SortStudentByName(stdtls,totalIndex);
																			break;
															  
															  case 'b'	: 	 System.out.println("\n	---------------------------------------------------------------------\n"); 
																			st.SortStudentByName(stdtls,totalIndex);
																			break;
																		
															  case 'c'	: 	 System.out.println("\n	---------------------------------------------------------------------\n"); 
																			st.SortStudentByName(stdtls,totalIndex);
																			break;
																			
															  case 'd'	: 	 System.out.println("\n	-----------------------------------------------------------------------\n"); 
																			st.SortStudentByName(stdtls,totalIndex);
																			break;
																			
															  case 'e'	: 	 System.out.println("\n	-----------------------------------------------------------------------\n"); 
																			st.SortStudentByBranch(stdtls,totalIndex);
																			break;
																			
															  case 'f'	: 	 System.out.println("\n	-----------------------------------------------------------------------\n"); 
																			st.SortStudentByName(stdtls,totalIndex);
																			break;
															
															  default 	:	System.out.println("\n		INVALID CHOICE");
																			javax.swing.JOptionPane.showMessageDialog(null,"INVALID CHOICE");
			
																			
														  }
														
														break;
														
									  case 4	 :		System.out.println("\n	@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ REMOVE RECORD @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n");
														
														System.out.print("		Enter the name of student whose record you want to remove : ");
														String removeName  = new Scanner(System.in).nextLine();
														
														RemoveStudent rs = new RemoveStudent();
														
														totalIndex = rs.RemoveStudentRecord(stdtls, removeName, totalIndex); 
														
														break;
														
														
											
									  case 5   	 :		System.out.println("\n	@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ DELETE RECORD @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n");
													
														System.out.print("		Enter the name of student whose record you want to delete : ");
														String nameValue = new Scanner(System.in).nextLine();
														
														DeleteStudent ds = new DeleteStudent();
														
														totalIndex = ds.DeleteStudentRecord(stdtls, nameValue, totalIndex);
														
														break;
									  
										
									  case 6	:	System.out.println("\n	@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ DISPLAY INFO. @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n");
												  
														for(int index= 1; index<=totalIndex; index++){
															
															stdtls[index-1].ShowDetails();
														}
													
													break;
													
													
									 default	:   System.out.println("\n 				xxxxxxxxxxxxxx INVALID CHOICE xxxxxxxxxxxxxx ");
														javax.swing.JOptionPane.showMessageDialog(null,"INVALID CHOICE");
												
											  
								}
								
								System.out.print("\n			Do you want to continue ? (y/n) : ");
								char response = new Scanner(System.in).nextLine().charAt(0);
								
								System.out.println("\n ********************************************************************************************* \n");
								
								if (response == 'n' || response == 'N'){
									break;
								}
								
								
						}
							
						}catch(ArrayIndexOutOfBoundsException e){
							System.out.println("please check array indexing ! ");
						}catch(Exception e){
							System.out.println("Terminated untimely !");
					}
		
		}
		
				
	}