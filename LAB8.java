import LAB11Package.*;			
import java.io.*;
import java.util.*;


class LAB8 {
			public static Records records = new Records();
			public final static void documentation(){
			System.out.println("_______________________________________");
			System.out.println("         JAVA Programming Lab          ");
			System.out.println("_______________________________________");
			System.out.println("Lab Programe-08 | Lab Cycle-02 | 19-07-19");
			System.out.println("_______________________________________"); 
			System.out.println("Name            :-    Kunal Jain");
			System.out.println("Class           :-    3-BCA-A");
			System.out.println("Register no.    :-    1841028");
			System.out.println("Domain          :-    Cricketers Records");
			System.out.println("_______________________________________");
		}

			public final static void list() {
			System.out.println("Choose:-");
			System.out.println("1-Insert");
			System.out.println("2-Find");
			System.out.println("3-Retirement");
			System.out.println("4-Average");
			System.out.println("5-Strike Rate");
			System.out.println("6-Change Player Name");
			System.out.println("7-Exit");
			System.out.println("_______________________________________");
		}

			public final static void list1() {
			System.out.println("Choose:-");
			System.out.println("1-New Entry");
			System.out.println("2-New Match statistics");
			System.out.println("3-Exit");
			System.out.println("_______________________________________");
		}


	public final static void updateData(){

	do{
		//System.out.println("Jersey Number can not be <=0.");
		System.out.println("Jersey Number:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		jerseynumber = scanner.nextInt();
		scanner.nextLine();	
		
	}while(jerseynumber<=0);	

		records.updateCricketerInfo(jerseynumber);
		
	}

			
	public static void insertData(){
		
		System.out.println("Enter Player Details:-");
		System.out.println("Name:-");
		name = scanner.nextLine();
	do{

//		System.out.println("Number of matches can not be <=0.");
		System.out.println("Number of Matches Played:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		matches = scanner.nextInt();
		scanner.nextLine();
		
	}while(matches<=0);		
	
	do{

//		System.out.println("Age can not be <=0.");
		System.out.println("Age:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		age = scanner.nextInt();
		scanner.nextLine();                 
		
	}while(age<=0);		 
		

	do{
//		System.out.println("Jersey Number can not be <=0.");
		System.out.println("Jersey Number:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		jerseynumber = scanner.nextInt();
		scanner.nextLine();	
		
	}while(jerseynumber<=0);		

		Cricketer cricketer = Cricketer.newCricketer(name,matches,age,jerseynumber);
		records.addNewCricketer(cricketer);
		
	}

	public static void printAverage(){


	do{
//		System.out.println("Jersey Number can not be <=0.");
		System.out.println("Jersey Number:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		jerseynumber = scanner.nextInt();
		scanner.nextLine();	
		
	}while(jerseynumber<=0);	

		
		records.Average(jerseynumber);

	}


	public static void printStrikeRate(){

	do{

		System.out.println("Jersey Number:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		jerseynumber = scanner.nextInt();
		scanner.nextLine();	
		
	}while(jerseynumber<=0);	


		records.StrikeRate(jerseynumber);


	}

	public final static void ChangePlayerName(){
	
		System.out.println("Enter Jersey Number of Player:-");
		jerseynumber = scanner.nextInt();
		System.out.println("Enter new Name:-");
		name = scanner.nextLine();
		records.NewName(name,jerseynumber);
	}
			
			public static int matches,age,jerseynumber;
			public static String name,x;
			public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		documentation();
		boolean hasNextInt = false;
		int flag=1,choice=0,choice1=0,flag1=1;
				
			while(flag!=0){
			
				//System.out.println("Enter your choice:-");
				list();
				do{

						while(!scanner.hasNextInt()){
						scanner.next();
						System.out.println("Please enter an integer");
					}
						choice = scanner.nextInt();
						scanner.nextLine();
				}while(choice<=0 || choice>7);	
					
				switch(choice){

					case 1:
				while(flag1!=0){
					list1();
					do{
							while(!scanner.hasNextInt()){
							scanner.next();
							System.out.println("Please enter an integer");
						}
						choice1 = scanner.nextInt();
						scanner.nextLine();
					}while(choice1<=0 || choice1>3);
							
						switch(choice1){
						case 1:
						System.out.println("* * * * ");
						insertData();
						break;
						case 2:
						System.out.println("* * * * ");
						updateData();	
						break;
						case 3:
						System.out.println("* * * * ");
						flag1--;
						break;
					}
				}
					flag1 = 1;
					break;
					case 2:
					System.out.println("Jersey Number:-");
					x = PasswordField.readPassword("Enter the Jersey number:-	");
					jerseynumber = Integer.parseInt(x);
					records.displayCricketerInfo(jerseynumber);
					break;
					case 3:
					System.out.println("Jersey Number:-");
					while(!scanner.hasNextInt()){
					scanner.next();
					System.out.println("Please enter an integer");
					}
					jerseynumber = scanner.nextInt();
					scanner.nextLine();
					records.removeCricketer(jerseynumber);
					case 7:
					flag--;
					break;
					case 4:
					printAverage();
					System.out.println("_______________________________________");
					break;
					case 5:
					printStrikeRate();
					System.out.printf("\n_______________________________________");
					break;	
					case 6:
					ChangePlayerName();
					break;							
			}//end of switch()
		
		}//end of while

	}//end of main

}//end of class
