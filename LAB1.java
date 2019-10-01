import java.io.*;
import java.util.*;
import java.util.ArrayList;

class LAB1{

	public static Scanner scanner = new Scanner(System.in);
	public static Data data = new Data();

	public static void documentation(){
	System.out.println("_______________________________________");
	System.out.println("         JAVA Programming Lab          ");
	System.out.println("_______________________________________");
	System.out.println("Lab Programe-01 | Lab Cycle-01 | 17-06-19");
	System.out.println("_______________________________________"); 
	System.out.println("Name            :-    Kunal Jain");
	System.out.println("Class           :-    3-BCA-A");
	System.out.println("Register no.    :-    1841028");
	System.out.println("Domain          :-    Cricketers Records");
	System.out.println("_______________________________________");

	}

	public static void list(){
		System.out.println("_______________________________________");
		System.out.println("Choose:-");
		System.out.println("1-Add");
		System.out.println("2-Update");
		System.out.println("3-Find");
		System.out.println("4-Retirement");
		System.out.println("5-Exit");
		System.out.println("_______________________________________");
	}

		public static int matches,age,jerseynumber,cent,halfcent,wickets,runs;
		public static String name,country;
		public static int w,x,y,z;

	public static void main(String[] args){
		
		documentation();
		boolean hasNextInt = false;
		int flag=1,choice=0;
		while(flag!=0){
			System.out.println("Enter your choice:-");
			list();
			while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		choice = scanner.nextInt();
		scanner.nextLine();
			switch(choice){
				case 1:
				insertData();
				break;
				case 2:
				System.out.println("UPDATE");
				System.out.println("Enter the number of matches:-");
				w = scanner.nextInt();
				System.out.println("Enter the runs scored:-");
				x = scanner.nextInt();
				System.out.println("Enter the wickets taken:-");
				y = scanner.nextInt();
				System.out.println("Enter the jerseynumber of the player:-");
				z = scanner.nextInt();
				data.updateinfo(w,x,y,z);
				break;
				case 3:
				System.out.println("Enter the jerseynumber of the player:-");
				x = scanner.nextInt();
				data.printinfo(x);
				break;
				case 4:
				System.out.println("Enter the jersey number:-");
				w = scanner.nextInt();
				data.retire(w);
				break;
				case 5:
					flag--;
				break;								
			}//end of switch()
		
		}//end of while

	}//end of main()

	public static void insertData(){
		
		System.out.println("Enter Player Details:-");
		System.out.println("Name:-");
		name = scanner.nextLine();
		data.addname(name);

		System.out.println("Country:-");
		country = scanner.nextLine();
		data.addcountry(country);

		System.out.println("Number of Matches Played:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		matches = scanner.nextInt();
		scanner.nextLine();
		data.addmatches(matches);
			

		System.out.println("Age:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		age = scanner.nextInt();
		scanner.nextLine();                  
		data.addage(age);
		

		System.out.println("Number of Centuries scored:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		cent = scanner.nextInt();
		scanner.nextLine();
		data.addcent(cent);


		System.out.println("Number of half-centuries scored:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		halfcent = scanner.nextInt();
		scanner.nextLine();
		data.addhalfcent(halfcent);
		

		System.out.println("Jersey Number:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		jerseynumber = scanner.nextInt();
		scanner.nextLine();
		data.addjerseynumber(jerseynumber);
		

		System.out.println("Number of Wickets:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		wickets = scanner.nextInt();
		scanner.nextLine();
		data.addwickets(wickets);
		

		System.out.println("Number of runs:-");
		while(!scanner.hasNextInt()){
			scanner.next();
			System.out.println("Please enter an integer");
		}
		runs = scanner.nextInt();
		scanner.nextLine();			
		data.addruns(runs);
	}		

}//end of class LAB1

class Data{

	private ArrayList<Double> average	=	new ArrayList<Double>();
	private ArrayList<String> name		=	new ArrayList<String>();
	private ArrayList<String> country 	=	new ArrayList<String>();
	private ArrayList<Integer> matches 	=	new ArrayList<Integer>();
	private ArrayList<Integer> age 		=	new ArrayList<Integer>();
	private ArrayList<Integer> jerseynumber = 	new ArrayList<Integer>();
	private ArrayList<Integer> cent 	=	new ArrayList<Integer>();
	private ArrayList<Integer> halfcent 	=	new ArrayList<Integer>();
	private ArrayList<Integer> wickets 	=	new ArrayList<Integer>();
	private ArrayList<Integer> runs 	=	new ArrayList<Integer>();

	
	public void addaverage(int runsx, int matchesx){

		double temp = (double)(runsx/matchesx);
		average.add(temp);
		
	}

	public void addname(String namex){
		name.add(namex);
	}
	
	public void addcountry(String countryx){
		country.add(countryx);
	}

	public void addmatches(int matchesx){
		matches.add(matchesx);
	}

	public void addage(int agex){
		age.add(agex);
	}

	public void addjerseynumber(int jerseynumberx){
		jerseynumber.add(jerseynumberx);
	}

	public void addcent(int centx){
		cent.add(centx);
	}

	public void addhalfcent(int halfcentx){
		halfcent.add(halfcentx);
	}

	public void addwickets(int wicketsx){
		wickets.add(wicketsx);
	}

	public void addruns(int runsx){
		runs.add(runsx);
	}


	public void printinfo(int x){

		boolean exists = jerseynumber.contains(x);
		int pos = jerseynumber.indexOf(x);
		if(exists){
		System.out.println("_______________________________________");
		System.out.println(name.get(pos) + " a " + age.get(pos) + " year old player playing for " + country.get(pos));
		System.out.println("has scored a total of " + cent.get(pos) + " international centuries and " + halfcent.get(pos) + "international half-centuries" );
		System.out.println("He has taken " + wickets.get(pos) + " number of international wickets ");
		System.out.println("Average:- " + average.get(pos));
		System.out.println("_______________________________________");
		}
		else{
			System.out.println("_______________________________________");
			System.out.println("No player with the given jersey number exists in the database");
			System.out.println("_______________________________________");
		}

	}	


	public void updateinfo(int w,int x,int y,int z){

		boolean exists = jerseynumber.contains(z);
		int pos = jerseynumber.indexOf(z);

		if(exists){
			int a1,a2,a3;
			double tempx;
			a1 = matches.get(pos) + w;
			a2 = runs.get(pos) + x;
 			a3 = wickets.get(pos) + y;
			matches.set(pos, a1);
			runs.set(pos, a2);
			wickets.set(pos, a3);
			tempx = a2/a1;
			average.set(pos, tempx);
			System.out.println("Information successfully Updated !!!!");
		}
		else{
			System.out.println("_______________________________________");
			System.out.println("No player with the given jersey number exists in the database");
			System.out.println("_______________________________________");
	
		}
}



		public void retire(int w){

			boolean exists = jerseynumber.contains(w);
		int pos = jerseynumber.indexOf(w);

		if(exists){
			System.out.println("_______________________________________");
			System.out.println(name.get(pos) + " retires from International Cricket.");
			System.out.println("You have had a great career mate !! The cricketing world would surely remeber you for a long time");
			System.out.println(name.get(pos) + " scored a total of " + cent.get(pos) + " international centuries and " + halfcent.get(pos) + "international half-centuries" );
			System.out.println("He has taken " + wickets.get(pos) + " number of international wickets throughout his career.");
			 average.remove(pos);
			 name.remove(pos);
			 country.remove(pos);
			 matches.remove(pos);
			 age.remove(pos);
			 jerseynumber.remove(pos);
		 	 cent.remove(pos);
			 halfcent.remove(pos);
 			 wickets.remove(pos);
 			 runs.remove(pos);

			System.out.println("\nInformation successfully Updated !!!!");
			System.out.println("_______________________________________");
	
		
		}
		else{
			System.out.println("No player with the given jersey number exists in the database");
			
		}
	
	}

}//end of class data