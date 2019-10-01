package LAB11Package;
import java.util.*;
import java.io.*;


public class Cricketer{

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

/*
		try{
			this.name = name;
		}catch(Error e){

			throw new Exception(e + "Exception thrown By JVM when tried to alter content of a 'FINAL' feild NAME"); 
			return "";
		}
		System.out.println("FINAL feilds cannot be re-initialised");
*/
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


