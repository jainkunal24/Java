import java.io.*;
import java.util.*;

class Practise{
	
	public static Scanner scanner = new Scanner(System.in);
	public static Records records = new Records();
	public static String name;
	public static int registernumber;
	public static int IntegerInput(int x){

		int temp;
		do{
	
			while(!scanner.hasNextInt()){

				scanner.next();
				System.out.println("Only positive integer allowed");
			}
			
			temp = scanner.nextInt();
			scanner.nextLine();
		}while(temp<=0 || temp>x);
		return temp;
	}

	public static int IntegerInput(){

		int returnedElement = IntegerInput(99999);
		return returnedElement;
	}

	public static void list(){

		System.out.println("Choose:-");
		System.out.println("1-Insert");
		System.out.println("2-Display");
		System.out.println("3-Exit");
		System.out.println("_______________________________________");
	}
	
	public static void insertNewStudent(){

		System.out.println("Enter name & register number:-");
		name = scanner.nextLine();
		registernumber = scanner.nextInt();
		Student s = Student.newStudent(name,registernumber);
		records.addNewStudent(s);
	}

	
	public static void StudentDetails(){

		records.printStudentDetails();
	}
	
	public static void main(String[] args){
		int choice = 0,flag = 1;
		while(flag!=0){
				list();
				choice = IntegerInput(3);
				switch(choice){

				case 1:
					insertNewStudent();
				break;
				case 2:
					StudentDetails();
				break;
				case 3: 	 
					flag--;	
				break;

				}//end of switch
			
			}//end of while

	}//end of main()

}//end of class

class Records{

	private ArrayList<Student> ListOfStudents;

	public Records(){

		ListOfStudents = new ArrayList<Student>();
	}

	public void addNewStudent(Student s){

		int pos = findStudent(s);
		if(pos<0){
			ListOfStudents.add(s);
			System.out.println("Student with " + s.getRegisterNumber() + " added to the database.");
		}
		else{
			System.out.println("Student with Register Number " + s.getRegisterNumber() + " already exists in database.");
		}
	}

	public void printStudentDetails(){

		for(int i=0;i<this.ListOfStudents.size();++i){
			Student st = this.ListOfStudents.get(i);
			System.out.println("________________________________________");
			System.out.printf("Name                    :-%20s\n",st.getName());
			System.out.printf("Register Number  :-%20d\n",st.getRegisterNumber());
			System.out.println("________________________________________");
		}
	}

	public int findStudent(Student s){
		
		int toCheckRegisterNumber = s.getRegisterNumber();
		for(int i=0;i<this.ListOfStudents.size();++i){

			if(this.ListOfStudents.get(i).getRegisterNumber() == toCheckRegisterNumber)
			return i;
		}
	
			return -1;
	}

}

class Student{

	private int registerNumber;
	private String name;

	public Student(){
		//default constructor
		this("Default Student",0);
	}

	public Student(String name,int registerNumber){

		this.name = name;
		this.registerNumber = registerNumber;
	}

	public int getRegisterNumber(){
		return this.registerNumber;
	}

	public String getName(){
		return this.name;
	}

	public static Student newStudent(String name,int registerNumber){
		return new Student(name,registerNumber);
	}
}