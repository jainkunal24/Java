import java.io.*;
import java.util.*;
import java.lang.*;

class CircularMerging{

	public static void main(String[] args){

		try{
			BufferedReader ip = new BufferedReader(new InputStreamReader(System.in)); 
			int t,n,minPenalty=0;
		    	t = Integer.parseInt(ip.readLine());
            			for(int i=0;i<t;++i){
				minPenalty = 0;
               				 ArrayList<Integer> a = new ArrayList<Integer>();
                			n = Integer.parseInt(ip.readLine());
                			for(int j=0;j<n;++j){
                    				int x = Integer.parseInt(ip.readLine());
					a.add(x);
                			}
               
               				 for(int k=0;k<n-1;++k){
                   				 int P1=a.size()-1,P2=0;
                				 int min = a.get(P1) + a.get(P2);
                    				//first find the 2 elements with smallest sum 
                    				for(int t1=0;t1<a.size()-1;++t1){
                        					int temp = a.get(t1) + a.get(t1+1);
                       					 if(temp<min){
                           						 min = temp;
                            						P1=t1;
                            						P2=t1+1;
                        					}
					}                

					minPenalty+=min;    
			                    //remove those 2 elements and add its sum to array
                  			                if(P1 == a.size()-1){
						a.add(a.size()-1,min);
						a.remove(a.size()-1);
						a.remove(0);
					}
					else{
						a.add(P1,min);
						a.remove(P1+1);
						a.remove(P1+1);
					}

               				 }
                		
              				  System.out.println(minPenalty);
            			}		    
		}catch(Exception e){}
	}
}