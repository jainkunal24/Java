import java.io.*;
import java.util.*;


class LAB14{
		
		public static Scanner scanner = new Scanner(System.in);
		public static Records records = new Records();
		public static int jerseynumber,ODImatches,TESTmatches,T20matches,manOfMatchAwards;
		public static String name;
		private static String nationality;

		//static Block		
		static{

			jerseynumber = 0;
			ODImatches = 0;
			TESTmatches = 0;
			T20matches = 0;
			manOfMatchAwards = 0;
			nationality = "Indian";
			System.out.println("______________________________");
			System.out.println("Implementation of STATIC BLOCK:-");
			System.out.println("______________________________");
			System.out.println("Default Cricketer Feilds:-");
			System.out.printf("Jersey number             \t:-    %d\n",jerseynumber );
			System.out.printf("Man of Match Awards\t:-    %d\n",manOfMatchAwards);
			System.out.printf("Nationality                   \t:-    %s\n",nationality);
			System.out.printf("______________________________");		
		}

		public static void documentation(){
			System.out.println("_______________________________________");
			System.out.println("         JAVA Programming Lab          ");
			System.out.println("_______________________________________");
			System.out.println("Lab Programe-05 | Lab Cycle-02 | 08-07-19");
			System.out.println("----Static - Class, Method, Block, Variable----    ");
			System.out.println("_______________________________________"); 
			System.out.println("Name            :-    Kunal Jain");
			System.out.println("Class           :-    3-BCA-A");
			System.out.println("Register no.    :-    1841028");
			System.out.println("Domain          :-    Cricketers Records");
			System.out.println("_______________________________________");
			System.out.println("      Annual BCCI Contract 2018        ");
			System.out.println("_______________________________________");
		}

		public static void list() {
				System.out.println("Choose:-");
				System.out.println("1-New");
				System.out.println("2-Terminate Contract");
				System.out.println("3-Contract Details");
				System.out.println("4-Salary Paid");	
				System.out.println("5-Write to file using ' FileWriter '");
				System.out.println("6-Read from file using FileReader");
				System.out.println("7-FileInputStream");
				System.out.println("8-FileOutputStream");
				System.out.println("_______________________________________");
		}

		public static void list1(){

				System.out.println();
				System.out.println("1-Play ODIs");
				System.out.println("2-Play ODIs & TESTs");
				System.out.println("3-Play ODIs & TESTs & T20s");
				System.out.println("4-Exit");
		}


		//function overloading
		public static int IntegerInput(){
			int temp = 0;
			do{
				while(!scanner.hasNextInt()){
				
					scanner.next();
					System.out.println("Please enter an integer");
				}
			
				//if(temp<=0)
				//System.out.println("Enter a positive number");

				temp = scanner.nextInt();
				scanner.nextLine();				

			}while(temp<0);

			return temp;
		}
		
		public static int IntegerInput(int limit){
			int temp = 0;
			do{
				while(!scanner.hasNextInt()){
				
					scanner.next();
					System.out.println("Please enter an integer");
				}
			
				//if(temp<0)
				//System.out.println("Enter a positive number");


				temp = scanner.nextInt();
				scanner.nextLine();

			}while(temp<=0 || temp>limit);

			return temp;
		}


		public static void remove(){
		
			System.out.println("Enter the jersey number :-");
			jerseynumber = IntegerInput();
			records.removeContract(jerseynumber);


		}

		
		public static void showContractDetails(){

			System.out.println("Enter the jersey number :-");
			jerseynumber = IntegerInput();
			records.showContract(jerseynumber);
		}

		public static void showSalaryPaid(){

			System.out.println("Enter the jersey number :-");
			jerseynumber = IntegerInput();
			records.showSalary(jerseynumber);						
		}

		public static void ODIs(){
			
			System.out.println("Enter details:- ");
			System.out.println("Name:-");
			name = scanner.nextLine();
			System.out.println("ODIs played:-");
			ODImatches = IntegerInput();
			System.out.println("Jersey number :-");
			jerseynumber = IntegerInput();
			System.out.println("Man of match Awards:-");
			manOfMatchAwards = IntegerInput();
			Cricketer cricketer = Cricketer.newCricketer(ODImatches,manOfMatchAwards,jerseynumber,name);
			records.addContract(cricketer,jerseynumber);
			
		}

		public static void ODIsTESTs(){

			System.out.println("Enter details:- ");
			System.out.println("Name:-");
			name = scanner.nextLine();
			System.out.println("ODIs played:-");
			ODImatches = IntegerInput();
			System.out.println("TESTs played:-");
			TESTmatches = IntegerInput();
			System.out.println("Jersey number :-");
			jerseynumber = IntegerInput();
			System.out.println("Man of match Awards:-");
			manOfMatchAwards = IntegerInput();
			Cricketer cricketer = Cricketer.newCricketer(ODImatches,TESTmatches,manOfMatchAwards,jerseynumber,name);
			records.addContract(cricketer,jerseynumber);

		}

		public static void ODIsTESTsT20s(){

			System.out.println("Enter details:- ");
			System.out.println("Name:-");
			name = scanner.nextLine();
			System.out.println("ODIs played:-");
			ODImatches = IntegerInput();
			System.out.println("TESTs played:-");
			TESTmatches = IntegerInput();
			System.out.println("T20s played:-");
			T20matches = IntegerInput();
			System.out.println("Jersey number :-");
			jerseynumber = IntegerInput();
			System.out.println("Man of match Awards:-");
			manOfMatchAwards = IntegerInput();
			Cricketer cricketer = Cricketer.newCricketer(ODImatches,TESTmatches,T20matches,manOfMatchAwards,jerseynumber,name);
			records.addContract(cricketer,jerseynumber);

		}
		//start of main()
		public static void main(String[] args){

			documentation();
			int flag = 1,choice = 0,choice1 = 0,flag1 = 1;
			while(flag!=0){
				list();
				choice = IntegerInput(8);
				switch(choice){

					case 1:
					while(flag1!=0){
						list1();
						choice1 = IntegerInput(4);
						switch(choice1){
							case 1:
								ODIs();
							break;
							case 2:
								ODIsTESTs();
							break;
							case 3:
								ODIsTESTsT20s();
							break;
							case 4:
								flag1--;
							break;
						
						}
					}
					flag1=1;
					break;
					case 2:
						remove();
					break;
					case 3:
						showContractDetails();
					break;
					case 4:
						showSalaryPaid();
					break;
					case 5:
						 records.writeToFile();
					break;	
					case 6:
					break;
					case 7:
						records.displayObjects();
					break;
					case 8:
						records.storeObject();
					break;	

				}//end of switch
			
			}//end of while

		}//end of main

}//end of class LAB4


class Records {

	private ArrayList<Cricketer> cricketersList = new ArrayList<Cricketer>();
	public void showSalary(int jerseynumber){ 

		int pos = findContract(jerseynumber);
		if(pos>=0){
			double ODIrevenue,TESTrevenue,T20revenue,Totalrevenue;
			Cricketer cricketer = cricketersList.get(pos);
			ODIrevenue = cricketer.getTotalODIrevenue();
			TESTrevenue = cricketer.getTotalTESTrevenue();
			T20revenue = cricketer.getTotalT20revenue();
			Totalrevenue = ODIrevenue + TESTrevenue + T20revenue;
			System.out.println("Revenues Through :-");
			System.out.printf("ODIs :- %.2f\n",ODIrevenue);
			System.out.printf("TESTs:- %.2f\n",TESTrevenue);
			System.out.printf("T20s :- %.2f\n",T20revenue);
			System.out.printf("_________________________________________\n");
			System.out.printf("Total:- %.2f\n",Totalrevenue);


			
		}
		else 
		System.out.println("No player with given jerseynumber exists.");

	 }


	 public void displayObjects(){
         
      		  try {
      			      ObjectInputStream is = new ObjectInputStream(new FileInputStream("cricketer.txt"));
			for(int i=0;i<cricketersList.size();++i){
				Cricketer x = (Cricketer) is.readObject();
				System.out.println(x.getName() + x.getODImatches() + x.getjerseynumber());
			}
      		  } catch (FileNotFoundException e) {
      		      e.printStackTrace();
      		  } catch (IOException e) {
      		      e.printStackTrace();
      		  } catch (ClassNotFoundException e) {
      		      e.printStackTrace();
      		  } 
         
    	}


	public void storeObject(){
         
      		
      		  try {
      			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("cricketer.txt"));
			for(int i=0;i<cricketersList.size();++i){

				os.writeObject(cricketersList.get(i));
			}
			os.close();
        		} catch (FileNotFoundException e) {
        		    e.printStackTrace();
       		 } catch (IOException e) {
      		      e.printStackTrace();
     		   } 
    }


	public void writeToFile(){

		FileWriter locFile = null;
		try{

			locFile = new FileWriter("cricketers2.txt", true    );
			for(int i=0;i<cricketersList.size();++i){
				Cricketer c = cricketersList.get(i);
				locFile.write(c.convertToString());
			}
			locFile.close();

		}catch(IOException e){ e.printStackTrace(); }

	}


	public void showContract(int jerseynumber){ 
	
		int pos = findContract(jerseynumber);
		if(pos>=0){
			//double ODIrevenue,TESTrevenue,T20revenue,Totalrevenue;
			Cricketer cricketer = cricketersList.get(pos);
			//System.out.println("_________________________________________________________________________");
			System.out.printf("Name     :-  %s\n",cricketer.getName());
			if(cricketer.getODImatches() != 0 )
			System.out.printf("ODIs     :-  %d\n",cricketer.getODImatches());
			else
			System.out.println("No ODI contract with " + cricketer.getName());
			if(cricketer.getTESTmatches() != 0 )
			System.out.printf("TESTs    :-  %d\n",cricketer.getTESTmatches());
			else
			System.out.println("No TEST contract with " + cricketer.getName());
			if(cricketer.getT20matches() != 0 )
			System.out.printf("T20s     :-  %d\n",cricketer.getT20matches());
			else
			System.out.println("No T20 contract with " + cricketer.getName());
			//System.out.println("_________________________________________________________________________");
		}
		else 
		System.out.println("No player with given jerseynumber exists.");
	}
	
	public void removeContract(int jerseynumber){

		int pos = findContract(jerseynumber);
		if(pos>=0){
			Cricketer cricketer = cricketersList.get(pos);
			this.cricketersList.remove(cricketer);
			System.out.println("Contract removed Successfully !!");
		}
		else{
			System.out.println("Contract of player with given jersey number doesn't exists. ");
		}

	}

	public void addContract(Cricketer cricketer,int jerseynumber){
		
		int pos = findContract(jerseynumber);
		if(pos<0){
			this.cricketersList.add(cricketer);
			System.out.println("New contract added Successfully !!");
		}
		else{
			System.out.println("Contract of player with given jersey number already exists. ");
		}
	}
		
	public int findContract(int jerseyNumber){
	
		for(int i=0;i<this.cricketersList.size();++i){

			int x = this.cricketersList.get(i).getjerseynumber();
				if(x == jerseyNumber){
					return i;
				}
		}
		return -1;
	}

}

class Cricketer implements Serializable{

	private String name;
	private int jerseynumber;
	private int manOfMatchAward;
	private int ODImatches;
	private int TESTmatches;
	private int T20matches;
	private static double ODImatchFee = 200000;
	private static double TESTmatchFee = 400000;
	private static double T20matchFee = 100000;  
	private static double manOfMatchAwardCashPrize = 51000.00;	

	//CONSTRUCOTOR OVERLOADING

	//constructor for players who play only ODI matches
	public Cricketer(int ODImatches,int manOfMatchAward,int jerseynumber,String name){

		this.ODImatches = ODImatches;
		this.name = name;
		this.jerseynumber = jerseynumber;
		this.TESTmatches = 0;
		this.T20matches = 0;		
		this.manOfMatchAward = manOfMatchAward; 
	}

	//constructor for players who play only 20-over and 50-over cricket
	public Cricketer(int ODImatches,int T20matches,int manOfMatchAward,int jerseynumber,String name){

		this.ODImatches = ODImatches;
		this.name = name;
		this.jerseynumber = jerseynumber;
		this.T20matches = T20matches;
		this.TESTmatches = 0;
		this.manOfMatchAward = manOfMatchAward;
	}

	//constructor for players who play all three formats of the game
	public Cricketer(int ODImatches,int TESTmatches,int T20matches,int manOfMatchAward,int jerseynumber,String name){

		this.name = name;
		this.jerseynumber = jerseynumber;
		this.ODImatches = ODImatches;
		this.T20matches = T20matches;
		this.TESTmatches = TESTmatches;		
		this.manOfMatchAward = manOfMatchAward;
	}

	//FUNCTION OVERLOADING


	//creating instance for player who only play 50-over cricket
	public static Cricketer newCricketer(int ODImatches,int manOfMatchAward,int jerseynumber,String name){
	
		return new Cricketer(ODImatches,manOfMatchAward,jerseynumber,name);
	}

	public String convertToString(){
	
		return this.name + " has played " + this.getODImatches() + " ODI matches " + this.getTESTmatches() + " test matches " + this.getT20matches() + " t20 matches" + " , ";
	}


	public double getTotalODIrevenue(){ 
		double temp;
		temp = this.ODImatches*this.ODImatchFee; 
		return temp;
	}

	
	public double getTotalTESTrevenue(){ 
		
		Double temp;
		temp = this.TESTmatches*this.TESTmatchFee; 
		return temp;
	}

	
	public double getTotalT20revenue(){ 
		double temp;
		temp = this.T20matches*this.T20matchFee; 
		return temp;
	}

	//creating instance for player who play 50-over and 20-over cricket
	public static Cricketer newCricketer(int ODImatches,int TESTmatches,int manOfMatchAward,int jerseynumber,String name){

		return new Cricketer(ODImatches,TESTmatches,manOfMatchAward,jerseynumber,name);
	}


	//creating instance for player who play all 3 formats of the game
	public static Cricketer newCricketer(int ODImatches,int TESTmatches,int T20matches,int manOfMatchAward,int jerseynumber,String name){

		return new Cricketer(ODImatches,TESTmatches,T20matches,manOfMatchAward,jerseynumber,name);
	}

	//creating getter functions
	public String getName(){ return this.name; }

	public int getjerseynumber(){ return this.jerseynumber; }

	public int getODImatches() { return this.ODImatches; }

	public int getTESTmatches() { return this.TESTmatches; }

	public int getT20matches() { return this.T20matches; }


}