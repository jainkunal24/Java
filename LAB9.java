import java.util.*;
import java.io.*;

class LAB10{
	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Individuals> individualsList = new ArrayList<Individuals>();
	private static int age,matches,manOfMatchAwards,runs,tons,wickets,fivewiHaul,jerseynumber;
	private static String individualType,name,nationality,surname;
	private static double average,strikeRate,bowlingAverage,accuracy;

	public static void documentation(){
			System.out.println("_______________________________________");
			System.out.println("         JAVA Programming Lab                               ");
			System.out.println("_______________________________________");
			System.out.println("Lab Programe-09 | Lab Cycle-03 | 02-08-19       ");
			System.out.println("----                          String Methods        ----            ");
			System.out.println("_______________________________________"); 
			System.out.println("Name            :-    Kunal Jain                                 ");
			System.out.println("Class           :-    3-BCA-A                                       ");
			System.out.println("Register no.    :-    1841028                                  ");
			System.out.println("Domain          :-    Cricketers Records");
			System.out.println("_______________________________________");
			System.out.println("                      Cricket Fraternity                           ");
			System.out.println("_______________________________________");
	}

	public static int IntegerInput() throws InputMismatchException{
			int temp = 0;
			do{
				 try
    				{
				        temp = scanner.nextInt();
    				}
    				catch (InputMismatchException exception)
   				 {
				        System.out.println("Integers only, please.");
    				}
			}while(temp<0);

			return temp;
	}

	public static void list(){
		System.out.printf("\n\n");
		System.out.println("Choose:-");
		System.out.println("1-New Umpire");
		System.out.println("2-New Batsman");
		System.out.println("3-New Bowler");
		System.out.println("4-New All-Rounder");
		System.out.println("5-Display Individuals Information");
		System.out.println("6.Number of Vowels in Name");
		System.out.println("7-Exit");
		System.out.println("___________________________");
	}

	public static void InsertDetails(){
		String buffer;
		System.out.println("Insert Individual Details:-");
		System.out.println("Name:-");
		 buffer = scanner.nextLine();
		name = buffer.trim().toUpperCase();
		System.out.println("Surname:-");
		buffer = scanner.nextLine();
		surname = buffer.trim().toUpperCase();
		System.out.println("Individual Type:-");
		buffer = scanner.nextLine();
		individualType = buffer.toLowerCase();
		System.out.println("No. of Matches:-");
		matches = IntegerInput();
		System.out.println("Age:-");
		age = IntegerInput();
	}

	public static void InsertUmpire(){
	

		System.out.println("Accuracy:-");
		accuracy = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Nationality:-");
		nationality = scanner.nextLine();		
	}

	public static void InsertBatsman(){

		scanner.nextLine();
		System.out.println("Jersey Number:-");
		jerseynumber = IntegerInput();
		System.out.println("International Runs:-");
		runs = scanner.nextInt();
		System.out.println("Centuries:-");
		tons = scanner.nextInt();
		System.out.println("Strike Rate:-");
		strikeRate = scanner.nextDouble();
		System.out.println("Man of Match Awards:-");
		manOfMatchAwards = scanner.nextInt();
	}

	public static void InsertBowler(){

		scanner.nextLine();
		System.out.println("Jersey Number:-");
		jerseynumber = IntegerInput();
		System.out.println("Wickets:-");
		wickets = scanner.nextInt();
		System.out.println("5 wicket Hauls:-");
		fivewiHaul = scanner.nextInt();
		System.out.println("Bowling Average:-");
		bowlingAverage = scanner.nextDouble();
		System.out.println("Man of Match Awards:-");
		manOfMatchAwards = scanner.nextInt();
	}

	public static void InsertAllRounder(){
		scanner.nextInt();
		System.out.println("Jersey Number:-");
		jerseynumber = IntegerInput();
		System.out.println("International Runs:-");
		runs = scanner.nextInt();
		System.out.println("Centuries:-");
		tons = scanner.nextInt();
		System.out.println("Wickets:-");
		wickets = scanner.nextInt();
		System.out.println("5 wicket Hauls:-");
		fivewiHaul = scanner.nextInt();
		System.out.println("Man of Match Awards:-");
		manOfMatchAwards = scanner.nextInt();
	}

	public static void DisplayInfo(){

		Individuals I;
		if(individualsList.size() == 0){

			System.out.println("No entries in  the Database.");
			return;
		}
		for(int i=0;i<individualsList.size();++i){

			I = individualsList.get(i);
			System.out.println("___________________________________");
			I.name = I.name.concat(" ");
			System.out.println("Name:-	" + I.name.concat(I.surname));
			System.out.println("Type:-" + I.individualType);
		}
	}

	public static void InsertNewCricketer(Individuals I){

		for(int j=0;j<individualsList.size();++j){
	
			Individuals checkedCricketer = individualsList.get(j);
			if(checkedCricketer.name.compareToIgnoreCase(I.name) >= 0){
				individualsList.add(j,I);
				return;
			}
		}
	
		System.out.println("Lexicographically largest name entered.");
		individualsList.add(I);
	}

	public static void numberOfVowels(){

		System.out.println("Enter Jersey Number:-");
		jerseynumber = IntegerInput();
		for(int i=0;i<individualsList.size();++i){

			Individuals I = individualsList.get(i);
			if(I.jerseynumber == jerseynumber){
	
				System.out.println(I.name.trim() + " " + I.surname.trim());
				System.out.println(I.individualType);
				String str = I.name + I.surname;
				int count = 0;
				for(int k=0;k<str.length();++k){
				
					if(str.charAt(k) == 'I' || str.charAt(k) == 'E'  || str.charAt(k) == 'A'  || str.charAt(k) == 'O'  || str.charAt(k) == 'U' )
						count++;		
				}
				System.out.println("No. of Vowels =     " + count);
			}

		}

	}

	public static void main(String[] args){
		int choice=0,flag=1;
		documentation();
		Individuals I;
		while(flag!=0){
			list();
			choice = IntegerInput();
			switch(choice){
/*
				case 1:
					InsertDetails();
					InsertUmpire();
					I = new Umpire(matches,name,individualType,age,accuracy,nationality,surname);
					InsertNewCricketer(I);
				break;
*/
				case 2:
					InsertDetails();
					InsertBatsman();
					I = new Batsman(jerseynumber,matches,name,individualType,age,runs,tons,strikeRate,manOfMatchAwards,surname);
					InsertNewCricketer(I);
				break;
				case 3:
					InsertDetails();
					InsertBowler();
					I = new Bowler(jerseynumber,matches,name,individualType,age,wickets,fivewiHaul,bowlingAverage,manOfMatchAwards,surname);
					InsertNewCricketer(I);
				break;
				case 4:
					InsertDetails();
					InsertAllRounder();
					I = new AllRounder(jerseynumber,matches,name,individualType,age,runs,wickets,tons,fivewiHaul,manOfMatchAwards,surname);
					InsertNewCricketer(I);
				break;
				case 7:
					System.out.println("End of Programme.");
					flag--;
				break;
				case 5:
					DisplayInfo();
				break;
				case 6:
					numberOfVowels();
			}//end of while

		}//end of switch

	}//end of main

}


class Individuals{
	int jerseynumber;
	int matches;
	String name,surname;
	String individualType;
	int age;
	public Individuals(int jerseynumber,int matches,String name,String individualType,int age,String surname){

		this.matches = matches;
		this.name = name;
		this.individualType = individualType;
		this.age = age;
		this.surname = surname;
		this.jerseynumber = jerseynumber;
	}

	public void displayData(){
		System.out.println("New member added into the Cricket Fraternity !! and he is a "  +  this.individualType );
	}	
}


/*class Umpire extends Individuals{

	double accuracy;
	String nationality;

	public Umpire(int matches,String name,String individualType,int age,double accuracy,String nationality,String surname){

		super(matches,name,individualType,age,surname);
		this.accuracy = accuracy;
		this.nationality = nationality;
		this.displayData();
	}

	@Override
	public void displayData(){
		System.out.println("_____________________________________");
		System.out.println("Umpire's Records"); 	
		System.out.println("_____________________________________");
		System.out.printf("\n%s    %s",super.individualType,super.name);
		System.out.printf("\n%d years of age and is from %s",super.age,nationality);
		System.out.printf("\nHas Stood in %d international matches",super.matches);
		System.out.printf("\nAccuracy of %3.2f in making decisions",accuracy);
		System.out.printf("\n_____________________________________");
	}	
}
*/
class Cricketer extends Individuals{

	
	int manOfMatchAwards;
	public Cricketer(int jerseynumber,int matches,String name,String individualType,int age,int manOfMatchAwards,String surname){

		super(jerseynumber,matches,name,individualType,age,surname);
		this.jerseynumber = jerseynumber;
		this.manOfMatchAwards = manOfMatchAwards;
		//this.displayData();
	}
}

class Batsman extends Cricketer{

	int runs;
	int tons;
	double average;
	double strikeRate;
	public Batsman(int jerseynumber,int matches,String name,String individualType,int age,int runs,int tons,double strikeRate,int manOfMatchAwards,String surname){

		super(jerseynumber,matches,name,individualType,age,manOfMatchAwards,surname);
		this.runs = runs;
		this.tons = tons;
		this.average = (double)runs/(double)matches;
		this.strikeRate = strikeRate;
		this.displayData();
	}
	
	@Override
	public void displayData(){
		System.out.println("_____________________________________");
		System.out.println("Batsman's Records"); 	
		System.out.println("_____________________________________");
		System.out.printf("\n%s",super.name);
		System.out.printf("\n%s",super.individualType);
		System.out.printf("\n%d International Centuries",this.tons);
		System.out.printf("\n%d international runs with an average of %4.2f",this.runs,this.average);
		System.out.printf("\nReceived %d Man of Match Awards.",super.manOfMatchAwards);
		System.out.printf("\n_____________________________________");
		System.out.printf("\nOver-Ridden Method From Batsman Class Executed Succefully!!");
		System.out.printf("\n_____________________________________");
	}	

}

class Bowler extends Cricketer{

	int wickets;
	int fivewiHaul;
	double bowlingAverage;
	public Bowler(int jerseynumber,int matches,String name,String individualType,int age,int wickets,int fivewiHaul,double bowlingAverage,int manOfMatchAwards,String surname){

		super(jerseynumber,matches,name,individualType,age,manOfMatchAwards,surname);
		this.wickets = wickets;
		this.fivewiHaul = fivewiHaul;
		this.bowlingAverage = bowlingAverage;
	}
	@Override
	public void displayData(){
		System.out.println("_____________________________________");
		System.out.println("Bowler's Records"); 	
		System.out.println("_____________________________________");
		System.out.printf("\n%s    %s",super.individualType,super.name);
		System.out.printf("\n%d International Wickets",this.wickets);
		System.out.printf("\n%d international wickets with an average of %4.2f",this.wickets,this.bowlingAverage);
		System.out.printf("\nReceived %d Man of Match Awards.",super.manOfMatchAwards);
		System.out.printf("\n_____________________________________");
		System.out.printf("\nOver-Ridden Method From Bowler Class Executed Succefully!!");
		System.out.printf("\n_____________________________________");
	}	

}


class AllRounder extends Cricketer{

	int runs;
	int wickets;
	int tons;
	int fivewiHaul;
	public AllRounder(int jerseynumber,int matches,String name,String individualType,int age,int runs,int wickets,int tons,int fivewiHaul,int manOfMatchAwards,String surname){

		super(jerseynumber,matches,name,individualType,age,manOfMatchAwards,surname);
		this.runs = runs;
		this.wickets = wickets;
		this.tons = tons;
		this.fivewiHaul = fivewiHaul;
	}
	@Override
	public void displayData(){
		System.out.println("_____________________________________");
		System.out.println("All-Rounder's Records"); 	
		System.out.println("_____________________________________");
		System.out.printf("\n%s    %s",super.individualType,super.name);
		System.out.printf("\n%d International runs and %d International Centuries",this.runs,this.tons);
		System.out.printf("\n%d International Wickets and %d 5 Wicket hauls .",this.wickets,this.fivewiHaul);
		System.out.printf("\nReceived %d Man of Match Awards.",super.manOfMatchAwards);
		System.out.printf("\n_____________________________________");
		System.out.printf("\nOver-Ridden Method From All-Rounder Class Executed Succefully!!");
		System.out.printf("\n_____________________________________");
	}	

}