/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
	public static void main (String[] args) throws java.lang.Exception
	{
	   try{
		int t;
		Scanner scanner = new Scanner(System.in);
		t = scanner.nextInt();
		for(int i=0;i<t;++i){

			int n = scanner.nextInt();
			int a[] = new int[n];
			double avg=0.0;
			for(int j=0;j<n;++j){

				int temp = scanner.nextInt();
				a[j] = temp;
				avg+=(double) temp;
			}
			avg/=(double)n;
			int x = (int)(avg);
			if(x == avg){
				int flag=0;
				for(int k=0;k<n;++k){

					if(a[k] == x && flag==0){
						System.out.println(k+1);
						flag++;
					}			
				}
				if(flag==0)
				System.out.println("Impossible");
				

			}
			else
			System.out.println("Impossible");

		}	    


	   } catch(Exception e){}
	}//end of main
}
/*1000000000*/