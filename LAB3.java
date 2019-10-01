import java.io.*;
import java.util.*;

abstract class LAB8 {
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


	public static int IntegerInput(){
			int temp = 0;
			do{
				while(!scanner.hasNextInt()){
				
					scanner.next();
					System.out.println("Only integer values allowed.!");
				}
				temp = scanner.nextInt();
				scanner.nextLine();				

			}while(temp<0);

			return temp;
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
			public static String name;
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

abstract class AbstractKeyword{

	public abstract void NewName(String name,int jerseynumber);	
	public abstract boolean addNewCricketer(Cricketer cricketer);	
	public abstract int findCricketer(int jerseyNumber);
	public abstract void StrikeRate(int jerseynumber);
	public abstract void Average(int jerseynumber);
	public abstract void updateCricketerInfo(int jerseyNumber);
	public abstract void removeCricketer(int jerseyNumber);
	public abstract void displayCricketerInfo(int jerseyNumber);	
}

class Records extends AbstractKeyword{
	public static Scanner scanner = new Scanner(System.in);
	private ArrayList<Cricketer> cricketersList;
	public Records(){
		this.cricketersList = new ArrayList<Cricketer>();
		
	}
//	@Override 
	public final void NewName(String name,int jerseynumber){

		/*if(findCricketer(cricketer.getjerseynumber()) >=0){
		
			

		}
		else{
			System.out.println("Player with entered Jersey number does not exisst.");
		}*/
	}


//	@Override
	public final boolean addNewCricketer(Cricketer cricketer){

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

//	@Override
	public final int findCricketer(int jerseyNumber){
		
		for(int i=0;i<this.cricketersList.size();++i){

			int x = this.cricketersList.get(i).getjerseynumber();
			//System.out.println("X:- " +x);
				if(x == jerseyNumber){
					return i;
				}
			}
		
		return -1;
		
	}


//	@Override
	public final void StrikeRate(int jerseynumber){


		int pos = findCricketer(jerseynumber);
		
		if(pos<0){
		
			System.out.println("No Cricketer with the given jersey number exists in Records.");
		}
		else{

			int r,b,m;
			double sr;
			r = this.cricketersList.get(pos).getTotalRuns();
			b = this.cricketersList.get(pos).getTotalBalls();
			m = this.cricketersList.get(pos).getMatches();
			sr = ((double)r/(double)b)*100;
			System.out.printf("%d total runs in  %d  matches at a strike rate of %.2f",r,m,sr);

		}

	}

//	@Override
	public final void Average(int jerseynumber){

		int pos = findCricketer(jerseynumber);

		if(pos<0){
		
			System.out.println("No Cricketer with the given jersey number exists in Records.");
		}
		else{

			int m,t,avg;
			m = this.cricketersList.get(pos).getMatches();
			t = this.cricketersList.get(pos).getTotalRuns();

			avg = t/m;
			System.out.println(t +" total runs in " + m + " matches at an average of " + avg );

		}
	}


//	@Override
	public final void updateCricketerInfo(int jerseyNumber){

		int foundPosition = findCricketer(jerseyNumber);
		if(foundPosition <0){

			System.out.println("No Cricketer with the given jersey number exists in Records.");
		}
		else{
		
			int temp,temp1,temp2,w,x;

			w = cricketersList.get(foundPosition).getMatches();
			x = w+1;
			this.cricketersList.get(foundPosition).setMatches(x);			

			System.out.println("Enter wickets taken :-");
			do{
				
				while(!scanner.hasNextInt()){

					scanner.next();
					System.out.println("Please enter an integer.");
				}
				temp = scanner.nextInt();
				scanner.nextLine();
//				System.out.println("Number of balls faced cant be negative");
			}while(temp<0 || temp>10);	

			this.cricketersList.get(foundPosition).getWicketsCount().add(temp);

			System.out.println("Enter runs scored & balls faced");
			do{
				
				while(!scanner.hasNextInt()){

					scanner.next();
					System.out.println("Please enter an integer.");
				}
				temp1 = scanner.nextInt();
				scanner.nextLine();
//				System.out.println("Number of runs scored cant be negative");
			}while(temp1<0);
	
			
			do{
				
				while(!scanner.hasNextInt()){

					scanner.next();
					System.out.println("Please enter an integer.");
				}
				temp2 = scanner.nextInt();
				scanner.nextLine();
				//System.out.println("Number of balls faced cant be negative");
			}while(temp2<0);	
		
			this.cricketersList.get(foundPosition).getrunsInEachMatch().add(new int[] {temp1, temp2});	
			
			System.out.println("Records updated Successfully");
		}

	}

//	@Override
	public final void removeCricketer(int jerseyNumber){

		int pos = findCricketer(jerseyNumber);
		if(pos>=0){
			displayCricketerInfo(jerseyNumber);
			cricketersList.remove(pos);
			System.out.println("Cricketer with jersey Number " + jerseyNumber + " removed Successfully!!"); 
		}
		else
		System.out.println("Cricketer with given jersey number not found.");

	}
	
//	@Override
	public final void displayCricketerInfo(int jerseyNumber){

		int pos = findCricketer(jerseyNumber);
		if(pos>=0){
		Cricketer c = cricketersList.get(pos);
		System.out.println("___________________________________________");
		System.out.println("Player Info:-");
		System.out.println("Name:-        " + c.getName());
		System.out.println("Age:-         " + c.getAge());
		System.out.println("Jersey Number " + c.getjerseynumber2());
		System.out.println("Matches:-     " + c.getMatches());		
		System.out.println("___________________________________________");
		}
		else{
		int x = jerseyNumber ^ 123456;
		System.out.println("The jersey number you entered doesnt corresponds to any of the Encrypted Jersey number.");
		System.out.println("Encrypted form of your jersey number is :" + x);
		}
	}
}

class Cricketer{

	private static final int key = 123456;
	public static final Scanner scanner = new Scanner(System.in);
	private final String name;
	public int matches;
	private int age;
	private final int jerseynumber;
	private double average;
	private ArrayList<Integer> wicketsCount = new ArrayList<Integer>(); 							//creation of 1-D array to store number of wickets
	private ArrayList<int[]> runsInEachMatch = new ArrayList<int[]>();							//Creation of List of 1-D arrays i.e. Array of Arrays or 2-D array to store runs in each Match


	public Cricketer(String name,int matches,int age,int jerseynumber){

		this.name = name;
		this.matches = matches;
		this.jerseynumber = jerseynumber ^ key;
		this.age = age;
		System.out.println();
		System.out.println("Jerseynumber stored as Encrypted password :-    " + this.jerseynumber);
		System.out.println();
		this.storeWickets();
		this.storeRuns();
		
	}


	public final void storeWickets(){
			
		int temp;	
		for(int i=0;i<this.matches;++i){
			int j = i+1;
			System.out.println("Enter wickets taken in Match No. " + j);
			do{
				
				while(!scanner.hasNextInt()){

					scanner.next();
					System.out.println("Please enter an integer.");
				}
				temp = scanner.nextInt();
				scanner.nextLine();
				//System.out.println("Number of wickets can be between '0' & '10' only");
			}while(temp<0 || temp>10);
	
			this.wicketsCount.add(temp);
		}
	}

	public final void storeRuns(){
			
		int temp1,temp2;	
		for(int i=0;i<this.matches;++i){
			int j = i + 1;
			System.out.println("Enter runs scored & balls faced in Match No. " + j);
			do{
				//System.out.println("Number of runs scored cant be negative");
				while(!scanner.hasNextInt()){

					scanner.next();
					System.out.println("Please enter an integer.");
				}
				temp1 = scanner.nextInt();
				scanner.nextLine();
				
			}while(temp1<0);
	
			
			do{
				//System.out.println("Number of balls faced cant be negative");
				while(!scanner.hasNextInt()){

					scanner.next();
					System.out.println("Please enter an integer.");
				}
				temp2 = scanner.nextInt();
				scanner.nextLine();
				
			}while(temp2<0);		

			this.runsInEachMatch.add(new int[] { temp1, temp2 });


		}
	}

	public final ArrayList<Integer> getWicketsCount(){

		return wicketsCount;
	}


	public final int getTotalRuns(){


		int total=0,t;
		for(int i=0;i<this.matches;++i){

			t = this.runsInEachMatch.get(i)[0];
			total+=t;

		}
			return total;

	}


	public final int getTotalBalls(){


		int total=0,t;
		for(int i=0;i<this.matches;++i){

			t = this.runsInEachMatch.get(i)[1];
			total+=t;
		}
			return total;
	}

	public final ArrayList<int[]> getrunsInEachMatch(){

		return runsInEachMatch;
	}
	
	public final void setMatches(int Matches){
		this.matches = Matches;
	}

	public final String getName(){
		return this.name;
	}

	public void SetName(String name) throws Exception{

		try{
			this.name = name;
		}catch(Error e){

			throw new Exception(e + "Exception thrown By JVM when tried to alter content of a 'FINAL' feild NAME"); 
			return "";
		}
		System.out.println("FINAL feilds cannot be re-initialised");
	}	

	public final int getAge(){
		return this.age;
	}


	public final int getjerseynumber2(){
		return this.jerseynumber;
	}

	public final int getjerseynumber(){
		return this.jerseynumber^key;
	}

	public final int getMatches(){
		return this.matches;
	}

	public final static Cricketer newCricketer(String name,int matches,int age,int jerseynumber){
		return new Cricketer(name,matches,age,jerseynumber);
	}

}