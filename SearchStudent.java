//to search student data

import java.util.*;

public class SearchStudent{
	
	//--------(1)-----------------------------------------------------------------------------------------------------------
	
					public void SearchStudentByName(StudentDetails []stu, String enteredName,int totalIndex){
								int flag=0;
								for(int index=1; index<=totalIndex; index++){
									
										if(enteredName.equalsIgnoreCase(stu[index-1].studentName)==true){
												flag=1;
												break;
											}
								}	
								if(flag==1){
									System.out.println("\n	``````````````````````````````````````````````````````````````````");
									System.out.println(" 		yes! student of name "+enteredName+ " is present here !");
									System.out.println("	``````````````````````````````````````````````````````````````````");
									javax.swing.JOptionPane.showMessageDialog(null,"student found!");
													  
								}else{
										System.out.println("\n	``````````````````````````````````````````````````````````````````");
																
										System.out.println("		 No student of such name can be found! ");
										System.out.println("	``````````````````````````````````````````````````````````````````");
																
										javax.swing.JOptionPane.showMessageDialog(null,"student not found");
													  
									}
							
					}
	//--------(2)-----------------------------------------------------------------------------------------------------------
	
					public void SearchStudentByID(StudentDetails []stu, int enteredID,int totalIndex){
						
						int flag=0;
						for(int index=1; index<=totalIndex; index++){
							if(enteredID== stu[index-1].ID){
								
								flag =1;
								break;
								
							}
						}
							if(flag==1){
								System.out.println("\n	``````````````````````````````````````````````````````````````````");
								System.out.println("		yes! student with ID "+enteredID+ " is present here !");
								System.out.println("	``````````````````````````````````````````````````````````````````");
								javax.swing.JOptionPane.showMessageDialog(null,"student found!");
					  
							}else{
								System.out.println("\n	``````````````````````````````````````````````````````````````````");
								System.out.println("			No student of such ID can be found! ");
								System.out.println("	``````````````````````````````````````````````````````````````````");
								javax.swing.JOptionPane.showMessageDialog(null,"student not found");
					  
							}
						
					}
	//---------(3)----------------------------------------------------------------------------------------------------------
	
					public void SearchStudentByGender(StudentDetails []stu, String enteredGender,int totalIndex){
						
						int flag=0;
						for(int index=1; index<=totalIndex; index++){

							if(enteredGender== stu[index-1].gender){
											
							flag =1;
							break;
							
							}
						}
						if(flag ==1){
								System.out.println("\n	``````````````````````````````````````````````````````````````````");
								System.out.println("		yes! student of gender "+enteredGender+ " is present here !");
								System.out.println("	``````````````````````````````````````````````````````````````````");
								javax.swing.JOptionPane.showMessageDialog(null,"student found!");
					  
							}else{
								System.out.println("\n	``````````````````````````````````````````````````````````````````");
								System.out.println("		No student of such gender can be found! ");
								System.out.println("	``````````````````````````````````````````````````````````````````");
								javax.swing.JOptionPane.showMessageDialog(null,"student not found");
					  
							}
						
					}
	//------(4)-------------------------------------------------------------------------------------------------------------
	
					public void SearchStudentByBranch(StudentDetails []stu, String enteredBranch,int totalIndex){
						
						int flag=0;
						for(int index=1; index<=totalIndex; index++){
							if(enteredBranch.equalsIgnoreCase(stu[index-1].branch)==true){
											
							flag =1;
							break;
							}
						}
							if(flag==1){
								
								System.out.println("\n	``````````````````````````````````````````````````````````````````");
								System.out.println("		yes! student of Branch "+enteredBranch+ " is present here !");
								System.out.println("	``````````````````````````````````````````````````````````````````");
								javax.swing.JOptionPane.showMessageDialog(null,"student found!");
					  
							}else{
								System.out.println("\n	``````````````````````````````````````````````````````````````````");
								System.out.println("		No student of such branch can be found! ");
								System.out.println("	``````````````````````````````````````````````````````````````````");
								javax.swing.JOptionPane.showMessageDialog(null,"student not found");
					  
								//use javax.swing here
							}
						
					}
	//-------(5)------------------------------------------------------------------------------------------------------------
	
					public void SearchStudentByAge(StudentDetails []stu, int enteredAge,int totalIndex){
						
						int flag=0;
						for(int index=1; index<=totalIndex; index++){
							if(enteredAge== stu[index-1].studentAge){
											
							flag =1;
							break;
							}
						}
							if(flag ==1){	
								System.out.println("\n	``````````````````````````````````````````````````````````````````");
								System.out.println("		yes! student of Age "+enteredAge+ " is present here !");
								System.out.println("	``````````````````````````````````````````````````````````````````");
								javax.swing.JOptionPane.showMessageDialog(null,"student found!");
					  
							}else{
								System.out.println("\n	``````````````````````````````````````````````````````````````````");
								System.out.println("		No student of such Age can be found! ");
								System.out.println("	``````````````````````````````````````````````````````````````````");
								javax.swing.JOptionPane.showMessageDialog(null,"student not found");
					  
								//use javax.swing here
							}
						
					}
	//--------(6)-----------------------------------------------------------------------------------------------------------
					public void SearchStudentByMark(StudentDetails []stu, float enteredMark,int totalIndex){
						
						int flag=0;
						for(int index=1; index<=totalIndex; index++){
							if(enteredMark== stu[index-1].marksObtained){
											
							flag =1;
							break;
							}
						}
						if(flag==1){
								System.out.println("\n	``````````````````````````````````````````````````````````````````");
								System.out.println("		yes! student of mark "+enteredMark+ " is present here !");
								System.out.println("	``````````````````````````````````````````````````````````````````");
								javax.swing.JOptionPane.showMessageDialog(null,"student found! ");
					  
							}else{
								System.out.println("\n	``````````````````````````````````````````````````````````````````");
								System.out.println("		No student of such mark can be found! ");
								System.out.println("	``````````````````````````````````````````````````````````````````");
								javax.swing.JOptionPane.showMessageDialog(null,"student not found");
					  
							}
						
					}
		
	
	
}