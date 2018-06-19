
// to delete a student data
//remove the whole object

public class DeleteStudent{
	
	public int DeleteStudentRecord(StudentDetails [] stu, String nameValue,int totalIndex){
		
		
		for(int index=1; index<= totalIndex; index++){
			
			if(stu[index-1].studentName==null){
				continue;
			}
			else if(stu[index-1].studentName.equalsIgnoreCase(nameValue)==true){
				
				stu[index-1].studentName = null;
				stu[index-1].ID = -1;		// since ID cannot be negative
				stu[index-1].studentAge = -1;
				stu[index-1].gender = null;
				stu[index-1].marksObtained = -0;
				stu[index-1].branch = null;
				
				
			}
			
			
		}
		System.out.println("\n			Record Deleted successfully");
		javax.swing.JOptionPane.showMessageDialog(null,"Record deleted successfully");
		
		for(int index=1; index<= totalIndex; index++){
				stu[index-1].ShowDetails();
		}	
			
		return totalIndex;
	}
	
	
}