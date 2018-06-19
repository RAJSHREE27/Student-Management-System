import java.util.*;

public class SortStudent{
	
	Scanner s = new Scanner(System.in);
	
	public void SortStudentByName(StudentDetails []stu,int totalIndex){
		
		
				for(int stdnam =0; stdnam < totalIndex-1; stdnam++){
					for(int i =1; i<totalIndex; i++){
						if(stu[i-1].studentName.compareTo(stu[i].studentName) > 0){
		
							String temporaryString = stu[i-1].studentName;
							stu[i-1].studentName = stu[i].studentName;
							stu[i].studentName = temporaryString;
		
							}
						}
				}
		
		
		System.out.println("\n				Order by - ");
		System.out.println("\n			1. Ascending ");
		System.out.println("			2. Descending ");
		System.out.print("\n		Enter your choice :: ");
		int ans = s.nextInt();
		
		if(ans==1){
				for(int i =1; i<=totalIndex; i++){
				System.out.println("			"+i+". "+ stu[i-1].studentName);
			}
		
		}else if(ans==2){
			for(int i =totalIndex; i>=1; i--){
				System.out.println("			"+i+". "+stu[i-1].studentName);
			}
		
		}else{
			System.out.println("			 INVALID CHOICE");
			javax.swing.JOptionPane.showMessageDialog(null,"INVALID CHOICE");
												
		}
			
		
		
	}// end SortStudentByName
	
	//-----------------------------------------------------------------------------------------------------------
	
	public void SortStudentByID(StudentDetails []stu, int totalIndex){
		for(int stdid =0; stdid<totalIndex-1 ; stdid++){
			
			for(int i =1; i<totalIndex; i++){
					if( stu[i-1].ID > stu[i].ID){
						
						int temporaryID = stu[i-1].ID;
						stu[i-1].ID = stu[i].ID;
						stu[i].ID = temporaryID;
						
					}
				}
			
		}
		System.out.println("\n				Order by - ");
		System.out.println("\n			1. Ascending ");
		System.out.println("			2. Descending ");
		System.out.print("\n		Enter your choice :: ");
		int ans = s.nextInt();
		
		if (ans ==1){
		
			for(int i =1; i<=totalIndex; i++){
				System.out.println("			"+i+". "+ stu[i-1].ID);
			}
			
		}else if(ans==2){
			for(int i =totalIndex; i>=1 ; i--){
				System.out.println("			"+i+". "+ stu[i-1].ID);
			}
		}else{
			System.out.println(" 			INVALID CHOICE");
			javax.swing.JOptionPane.showMessageDialog(null,"INVALID CHOICE");
												
		}
		
	}
	
	//-----------------------------------------------------------------------------------------------------------
	
	public void SortStudentByBranch(StudentDetails []stu, int totalIndex){
		for(int stdbr =0; stdbr<totalIndex-1 ; stdbr++){
			
			for(int i =1; i<totalIndex; i++){
					if( stu[i-1].branch.compareTo(stu[i].branch) > 0){
						
						String temporaryBranch = stu[i-1].branch;
						stu[i-1].branch = stu[i].branch;
						stu[i].branch = temporaryBranch;
						
					}
				}
			
		}
		
		
		System.out.println("\n				Order by - ");
		System.out.println("\n			1. Ascending ");
		System.out.println("			2. Descending ");
		System.out.print("\n		Enter your choice :: ");
		int ans = s.nextInt();
		
		if(ans ==1){
			for(int i =1; i<=totalIndex; i++){
				System.out.println("			"+i+". "+ stu[i-1].branch);
			}
			
		}else if(ans==2){
			for(int i =totalIndex; i>=1; i--){
				System.out.println("			"+i+". "+ stu[i-1].branch);
			}
		}else{
			System.out.println("			 INVALID CHOICE");
			javax.swing.JOptionPane.showMessageDialog(null,"INVALID CHOICE");
												
		}
		
	}
	
	//-----------------------------------------------------------------------------------------------------------
	
	public void SortStudentByAge(StudentDetails []stu, int totalIndex){
		for(int stdage =0; stdage <totalIndex-1 ; stdage++){
			
			for(int i =1; i<totalIndex; i++){
					if( stu[i-1].studentAge > stu[i].studentAge){
						
						int temporaryAge = stu[i-1].studentAge;
						stu[i-1].studentAge = stu[i].studentAge;
						stu[i].studentAge = temporaryAge;
						
					}
				}
			
		}
		
		
		System.out.println("\n				Order by - ");
		System.out.println("\n			1. Ascending ");
		System.out.println("			2. Descending ");
		System.out.print("\n		Enter your choice :: ");
		int ans = s.nextInt();
		 
		 if(ans==1){
		 
			for(int i =1; i<=totalIndex; i++){
				System.out.println("			"+i+". "+ stu[i-1].studentAge);
			}
		 }else if(ans==2){
			 for(int i =totalIndex; i>=1; i--){
				System.out.println("			"+i+". "+ stu[i-1].studentAge);
			}
		 }else{
			System.out.println("			 INVALID CHOICE");
			javax.swing.JOptionPane.showMessageDialog(null,"INVALID CHOICE");
												
		}
		 
	}
	
	//-----------------------------------------------------------------------------------------------------------------------
	public void SortStudentByGender(StudentDetails []stu, int totalIndex){
		for(int stdgen =0; stdgen < totalIndex-1 ; stdgen++){
			
			for(int i =1; i<totalIndex; i++){
					if( stu[i-1].gender.compareTo(stu[i].gender) > 0){
						
						String temporaryGender = stu[i-1].gender;
						stu[i-1].gender = stu[i].gender;
						stu[i].gender = temporaryGender;
						
					}
				}
			
		}
		
		
		System.out.println("\n				Order by - ");
		System.out.println("\n			1. Ascending ");
		System.out.println("			2. Descending ");
		System.out.print("\n		Enter your choice :: ");
		int ans = s.nextInt();
		
		if(ans==1){
			for(int i =1; i<=totalIndex; i++){
				System.out.println("			"+i+". "+ stu[i-1].gender);
			}
		}else if(ans==2){
			for(int i =totalIndex; i>=1 ; i--){
				System.out.println("			"+i+". "+ stu[i-1].gender);
			}
		}else{
			System.out.println("			 INVALID CHOICE");
			javax.swing.JOptionPane.showMessageDialog(null,"INVALID CHOICE");
												
		}
	}
	//----------------------------------------------------------------------------------------------------------------------
	
	public void SortStudentByMark(StudentDetails []stu, int totalIndex){
		for(int stdmrk =0; stdmrk < totalIndex-1 ; stdmrk++){
			
			for(int i =1; i<totalIndex; i++){
					if( stu[i-1].marksObtained > stu[i].marksObtained){
						
						float temporaryMrk = stu[i-1].marksObtained;
						stu[i-1].marksObtained = stu[i].marksObtained;
						stu[i].marksObtained = temporaryMrk;
						
					}
				}
			
		}
		
		
		System.out.println("\n				Order by - ");
		System.out.println("\n			1. Ascending ");
		System.out.println("			2. Descending ");
		System.out.print("\n		Enter your choice :: ");
		int ans = s.nextInt();
		
		if(ans==1){
		
			for(int i =1; i<=totalIndex; i++){
				System.out.println("			"+i+". "+ stu[i-1].marksObtained);
			}
		}
		else if(ans==2){
			for(int i =totalIndex ; i>=1; i--){
				System.out.println("			"+i+". "+ stu[i-1].marksObtained);
			}
		}else{
			System.out.println("			 INVALID CHOICE");
			javax.swing.JOptionPane.showMessageDialog(null,"INVALID CHOICE");
												
		}
	}
	
	
	
	
}//end class