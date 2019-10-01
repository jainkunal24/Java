import java.io.*;
import java.util.*;

class EXCEPTIONS{

		public static Scanner scanner = new Scanner(System.in);
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
		


	public static void main(String[] args) throws Exception{

		int n;
		String s;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Enter number of inputs:-");
		s = scanner.next();
		try{

			n = Integer.parseInt(s);
		}catch(Exception e){

			System.out.println(e);
			n = IntegerInput();
		}
		for(int i=0;i<n;++i){
			
			int temp;
			boolean isPrime;
			temp = IntegerInput();
			isPrime = CheckPrime(temp);
			if(isPrime){
				throw new Exception("The entered number is a prime number*** From the new Exception created  ***");
			}

		}

	}


	public static boolean CheckPrime(int temp) throws Exception{

		int c = 0;
		for(int j=2;j<=temp/2;++j){
			
			if(temp%j == 0)
			c++;
		}
		 if(c != 0){

			System.out.println("The entered number is not prime!!");
			return false;
		}

		
			return true;

		

	}
	/*public static throwPrimeException(boolean isPrime) throws Exception{
		
		throw new Exception("The entered number is a prime number*** From the new Exception created  ***");
	}*/
}