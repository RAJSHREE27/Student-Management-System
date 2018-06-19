//Student Details


public class StudentDetails {
	
	int ID;
	String studentName;
	int studentAge;
	String gender;
	float marksObtained;
	String branch;
	// all the data is public
	
	public StudentDetails(int ID, String studentName , int studentAge, String gender, float marksObtained, String branch){
		
		this.ID = ID;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.gender = gender;
		this.marksObtained = marksObtained;
		this.branch = branch;
		
	}//constructor
	
	void ShowDetails(){
			
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("\n 				Details of Student "+ this);
		System.out.println("\n					Name	: "+studentName);
		System.out.println("					ID	: "+ID);
		System.out.println("					Age	: "+studentAge);
		System.out.println("					Gender	: "+gender);
		System.out.println("					Branch	: "+branch);
		System.out.println("				Marks Obtained	: "+marksObtained);
		System.out.println("");
		
	}//to show student details
	
	
	
	
}//end class 