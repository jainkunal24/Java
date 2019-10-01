import java.io.*;
import java.util.*;

class FilesLab{

    public static String filename = "cricketerDatabase.txt";
    public static String filename2 = "stringFile.txt";
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Cricketer> cricketersList = new ArrayList<Cricketer>();
     public static String name;
        public static int matches,runs,wickets,manOfMatchAwards,jerseyNumber;
   
    public static int IntegerInput(){
			int temp = 0;
			do{
				while(!scanner.hasNextInt()){
				
					scanner.next();
					System.out.println("Please enter an integer");
				}
			    temp = scanner.nextInt();
				scanner.nextLine();				
			}while(temp<0);

			return temp;
		}

    public static void userInputs(){

        System.out.println("Enter Details:-");
        System.out.println("Name:-");
        name = scanner.nextLine();
        System.out.println("Jersey Number");
        jerseyNumber = IntegerInput();
        System.out.println("Matches:-");
        matches = IntegerInput();
        System.out.println("Runs:-");
        runs = IntegerInput();
        System.out.println("Wickets:-");
        wickets = IntegerInput();
        System.out.println("Man Of Match Awards:-");
        manOfMatchAwards = IntegerInput();
        Cricketer c = new Cricketer(name,jerseyNumber,matches,runs,wickets,manOfMatchAwards);
        cricketersList.add(c);
    }

    public static int search(int jn){

        for(int i=0;i<cricketersList.size();++i){
            if(cricketersList.get(i).jerseyNumber == jn){
                return i;
            }
        }
        return -1;
    }

    public static int jerseyno(){
        int jn;
         System.out.println("Enter Jersey Number:-");
        jn = IntegerInput();
        return jn;
    }

    public static void display(int jn){
        int pos;
        pos = search(jn);
        if(pos != -1){
            Cricketer x = cricketersList.get(pos);
            System.out.println(x.name);
            System.out.println("Jersey number - " + x.jerseyNumber);
            System.out.println("Played  " + x.matches);
            System.out.println(x.runs + " runs ");
            System.out.println(x.wickets + " wickets " );
            System.out.println(x.manOfMatchAwards + " man of match awards" );
            System.out.println("_____________________________________________");

        }else{
            System.out.println("No PLayer with given jersey number exists!.");
        }
    
    }

    public static void remove(){
         int jn,pos;
        System.out.println("Enter Jersey Number:-");
        jn = IntegerInput();
        pos = search(jn);
        if(pos != -1){
            cricketersList.remove(pos);
            System.out.println("Player with jersey number " + jn + " is removed successfully!!");
        }else{
                System.out.println("No PLayer with given jersey number exists!.");
        }
    }

    public static void storeObjects(){
        try{
                       FileWriter f = new FileWriter("C:\\Users\\Kamala P Jain\\Desktop\\cricketerDatabase",false);
                        f.close();
        }catch(IOException e){ e.printStackTrace(); }

            try{
                    ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(filename));
                    for(int i=0;i<cricketersList.size();++i){
    				    os.writeObject(cricketersList.get(i));		
                    }
        			os.close();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            }catch(IOException e){
                e.printStackTrace();
            }
    }


    public static void displayObjects(){

        try{
                ObjectInputStream is = new ObjectInputStream(new FileInputStream(filename));
		    	for(int i=0;i<cricketersList.size();++i){
			    	Cricketer x = (Cricketer) is.readObject();
			    	display(x.jerseyNumber);
			    }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static void writeToFile(){
          try{
                       FileWriter f = new FileWriter("C:\\Users\\Kamala P Jain\\Desktop\\stringFile",false);
                        f.close();
        }catch(IOException e){ e.printStackTrace(); }
    try{
        FileWriter stringFile = null;
        stringFile = new FileWriter(filename2);
        for(int i=0;i<cricketersList.size();++i){
            Cricketer c = cricketersList.get(i);
            String buffer = c.name + " has played " + c.matches + " international matches and has scored " + c.runs + " runs and taken " +  c.wickets +  " wickets" + " | " ;
            stringFile.write(buffer);
        }
        stringFile.close();
    }catch(IOException e){ e.printStackTrace(); }
}

    public static void readFromFile(){

        Scanner sc = null;
        try{
            sc = new Scanner(new FileReader(filename2));
            sc.useDelimiter("|");
            while(sc.hasNextLine()){
                String content = sc.nextLine();
                sc.skip(sc.delimiter());
                System.out.println(content);
            } 
            sc.close();
        }catch(IOException e){ e.printStackTrace(); }
    }

    public static void average(){
        System.out.println("Name" + "   -->   " + "Batting Average");
        for(int i=0;i<cricketersList.size();++i){

            Cricketer c = cricketersList.get(i);
            int m = c.matches;
            int r = c.runs;
            int sr = (int)(r / m);
            System.out.println(c.name + "   -->  " + sr);
        }
    }

    public static void list(){
            System.out.println("_____________________________________________");
            System.out.println("Choose:-");
            System.out.println("1-Create Cricketer Objects");
            System.out.println("2-Display Cricketer Objects");
            System.out.println("3-Remove Cricketer Object");
            System.out.println("4-Write objects to file FileOutputStream ");
            System.out.println("5-Read Objects from file  FileInputStream");
            System.out.println("6-Write String to File [ FileWriter ] ");
            System.out.println("7-Read String from file [ FileReader ] ");
            System.out.println("8-Average");
            System.out.println("9-Exit");
            System.out.println("_____________________________________________");
    }

    public static void main(String[] args){
        
        int choice = 0,flag=1,jn;
        while(flag == 1){
            list();
            choice = IntegerInput();
            switch(choice){
                case 1:
                userInputs();
                break;
                case 2:
                jn = jerseyno();
                display(jn);
                break;
                case 3:
                remove();
                break;
                case 4:
                storeObjects();
                break;
                case 5:
                displayObjects();
                break;
                case 6:
                writeToFile();
                break;
                case 7:
                readFromFile();
                break;
                case 8:
                average();
                break;
                case 9:
                flag--;
            }
        }
    }
}

class Cricketer implements Serializable{

    public String name;
    public int jerseyNumber;
    public int matches;
    public int runs;
    public int wickets;
    public int manOfMatchAwards;

    public Cricketer(String name, int jerseyNumber,int matches, int runs, int wickets, int manOfMatchAwards){

        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.matches = matches;
        this.wickets = wickets;
        this.runs = runs;
        this.manOfMatchAwards = manOfMatchAwards;
    }
}