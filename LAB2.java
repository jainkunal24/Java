import java.io.*;
import java.util.*;


class LAB2 {
			public static Records records = new Records();
			public static void documentation(){
			System.out.println("_______________________________________");
			System.out.println("         JAVA Programming Lab          ");
			System.out.println("_______________________________________");
			System.out.println("Lab Programe-02 | Lab Cycle-01 | 21-06-19");
			System.out.println("_______________________________________"); 
			System.out.println("Name            :-    Kunal Jain");
			System.out.println("Class           :-    3-BCA-A");
			System.out.println("Register no.    :-    1841028");
			System.out.println("Domain          :-    Cricketers Records");
			System.out.println("_______________________________________");
		}

			public static void list() {
	//		System.out.println("_______________________________________");
			System.out.println("Choose:-");
			System.out.println("1-Insert");
			System.out.println("2-Find");
			System.out.println("3-Retirement");
			System.out.println("4-Exit");
			System.out.println("_______________________________________");
		}

			public static void list1() {
	//		System.out.println("_______________________________________");
			System.out.println("Choose:-");
			System.out.println("1-New Entry");
			System.out.println("2-Existing Record");
			System.out.println("3-Exit");
			System.out.println("_______________________________________");
		}


	public static void updateData(){

		System.out.println("Jersey Number:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		jerseynumber = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Number of Wickets:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		wickets = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Runs Scored:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		runs = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Number of Matches:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		matches = scanner.nextInt();
		scanner.nextLine();

		records.updateCricketerInfo(jerseynumber,matches,runs,wickets);
		
	}

			
	public static void insertData(){
		
		System.out.println("Enter Player Details:-");
		System.out.println("Name:-");
		name = scanner.nextLine();
		

		System.out.println("Country:-");
		country = scanner.nextLine();
//		data.addcountry(country);

		System.out.println("Number of Matches Played:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		matches = scanner.nextInt();
		scanner.nextLine();
//		data.addmatches(matches);
			

		System.out.println("Age:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		age = scanner.nextInt();
		scanner.nextLine();                  
//		data.addage(age);
		

		System.out.println("Number of Centuries scored:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		cent = scanner.nextInt();
		scanner.nextLine();
//		data.addcent(cent);


		System.out.println("Number of half-centuries scored:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		halfcent = scanner.nextInt();
		scanner.nextLine();
//		data.addhalfcent(halfcent);
		

		System.out.println("Jersey Number:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		jerseynumber = scanner.nextInt();
		scanner.nextLine();
//		data.addjerseynumber(jerseynumber);
		

		System.out.println("Number of Wickets:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		wickets = scanner.nextInt();
		scanner.nextLine();
//		data.addwickets(wickets);
		

		System.out.println("Number of runs:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		runs = scanner.nextInt();
		scanner.nextLine();			
//		data.addruns(runs);

		average = (runs/matches);
//String name,String country,int matches,int age,int jerseynumber,int cent,int halfcent,int wickets,int runs,double average
		Cricketer cricketer = Cricketer.newCricketer(name,country,matches,age,jerseynumber,cent,halfcent,wickets,runs,average);
		records.addNewCricketer(cricketer);
		
	}

			
			public static double average;
			public static int matches,age,jerseynumber,cent,halfcent,wickets,runs;
			public static String name,country;
			public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args){
		documentation();
		boolean hasNextInt = false;
		int flag=1,choice=0,choice1=0,flag1=1;
				
			while(flag!=0){
			
				System.out.println("Enter your choice:-");
				list();
				do{

						while(!scanner.hasNextInt()){
						scanner.next();
						System.out.println("Please enter an integer");
					}
						choice = scanner.nextInt();
						scanner.nextLine();
				}while(choice<=0 || choice>4);	
					
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
					while(!scanner.hasNextInt()){
					scanner.next();
					System.out.println("Please enter an integer");
					}
					jerseynumber = scanner.nextInt();
					scanner.nextLine();
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
					case 4:
					flag--;
					break;								
			}//end of switch()
		
		}//end of while

	}//end of main

}//end of class



class Records{

	private ArrayList<Cricketer> cricketersList;
	public Records(){
		this.cricketersList = new ArrayList<Cricketer>();
		
	}

	public boolean addNewCricketer(Cricketer cricketer){

		if(findCricketer(cricketer.getjerseynumber()) >=0){

			System.out.println("A player with geiven jersey number already exists.");
			System.out.println("NOTE:-  There can't be two cricketers with same jersey number");
			return false;
		}
		else{

			cricketersList.add(cricketer);
			System.out.println("Player Added Successfully!!!.");
			return true;
		}
	}

	public int findCricketer(int jerseyNumber){
		
		for(int i=0;i<this.cricketersList.size();++i){

			int x = this.cricketersList.get(i).getjerseynumber();
			//System.out.println("X:- " +x);
				if(x == jerseyNumber){
					return i;
				}
			}
		
		return -1;
		
	}

	public void updateCricketerInfo(int jerseyNumber,int Matches,int Runs,int Wickets){

		int foundPosition = findCricketer(jerseyNumber);
		//System.out.println(foundPosition);
		if(foundPosition <0){

			System.out.println("No Cricketer with the given jersey number exists in Records.");
		}
		else{
			
			int w = cricketersList.get(foundPosition).getMatches();
			int x = w+Matches;
			this.cricketersList.get(foundPosition).setMatches(x);
			
			w = cricketersList.get(foundPosition).getRuns();
		        x = w+Runs;
			this.cricketersList.get(foundPosition).setRuns(x);

			
			w = cricketersList.get(foundPosition).getWickets();
			x = w+Wickets;
			this.cricketersList.get(foundPosition).setWickets(x);
			
			System.out.println("Records updated Successfully");
		}

	}

	public void removeCricketer(int jerseyNumber){

		int pos = findCricketer(jerseyNumber);
		if(pos>=0){
			displayCricketerInfo(jerseyNumber);
			cricketersList.remove(pos);
			System.out.println("Cricketer with jersey Number " + jerseyNumber + " removed Successfully!!"); 
		}
		else
		System.out.println("Cricketer with given jersey number not found.");

	}
	
	public void displayCricketerInfo(int jerseyNumber){

		int pos = findCricketer(jerseyNumber);
		if(pos>=0){
		Cricketer c = cricketersList.get(pos);
		System.out.println("___________________________________________");
		System.out.println("Player Info:-");
		System.out.println("Name:-        " + c.getName());
		System.out.println("Country:-     " + c.getCountry());
		System.out.println("Age:-         " + c.getAge());
		System.out.println("Jersey Number " + c.getjerseynumber());
		System.out.println("Matches:-     " + c.getMatches());		
		System.out.println("100's         " + c.getCent());
		System.out.println("50's          " + c.getHalfcent());
		System.out.println("Wickets       " + c.getWickets());
		System.out.println("Average       " + c.getAverage());
		System.out.println("___________________________________________");
		}
		else
		System.out.println("No Player with entered jersey number exists.");
	}
}

class Cricketer{

	private String name;
	private String country;
	public int matches;
	private int age;
	private int jerseynumber;
	public int cent;
	public int halfcent;
	public int wickets;
	public int runs;
	private double average;

	public Cricketer(String name,String country,int matches,int age,int jerseynumber,int cent,int halfcent,int wickets,int runs,double average){

		this.name = name;
		this.country = country;
		this.matches = matches;
		this.cent = cent;
		this.halfcent = halfcent;
		this.wickets = wickets;
		this.runs = runs;
		this.average = average;
		this.jerseynumber = jerseynumber;
		this.age = age;

	}


	public void setMatches(int Matches){
		this.matches = Matches;
	}

	public void setRuns(int Runs){
		this.runs = Runs;
	}

	public void setWickets(int Wickets){
		this.wickets = Wickets;
	}

		
	public String getName(){
		return this.name;
	}	

	public String getCountry(){
		return this.country;
	}	

	public int getCent(){
		return this.cent;
	}

	public int getHalfcent(){
		return this.halfcent;
	}

	public int getAge(){
		return this.age;
	}

	public int getjerseynumber(){
		return this.jerseynumber;
	}

	public int getMatches(){
		return this.matches;
	}

	public int getRuns(){
		return this.runs;
	}

	public int getWickets(){
		return this.wickets;
	}

	public double getAverage(){
		return this.average;
	}

	public static Cricketer newCricketer(String name,String country,int matches,int age,int jerseynumber,int cent,int halfcent,int wickets,int runs,double average){
		return new Cricketer(name,country,matches,age,jerseynumber,cent,halfcent,wickets,runs,average);
	}

}