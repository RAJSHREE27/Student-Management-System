
// to remove a student data
//make all the attributes null

public class RemoveStudent{
	
	int numVal; 
	
	public int RemoveStudentRecord(StudentDetails [] stu, String removeName, int totalIndex){
		
		for(int index=1; index<= totalIndex; index++){
			
			if(stu[index-1].studentName==null){
				continue;
			}
			else if(stu[index-1].studentName.equalsIgnoreCase(removeName)==true){
				
				stu[index-1]=null;
				numVal = index-1;
				break;
			}
			
			
		}
		if(numVal != (totalIndex-1)){		//if its not the last element
			
			int val;
				for( val = numVal+1; val<totalIndex; val++){
					stu[val-1] = stu[val];
				}
			stu[totalIndex-1] = null;
		}
		
		totalIndex = totalIndex-1;
			
		
		System.out.println("\n			Record removed successfully");
		javax.swing.JOptionPane.showMessageDialog(null,"Record removed successfully");
		
		for(int index=1; index<= totalIndex; index++){
				
				stu[index-1].ShowDetails();
		}	
			
		return totalIndex;
	}
		
}//end class
	
	
	
