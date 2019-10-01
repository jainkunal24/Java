import java.io.*;
import java.util.*;

class ParityAgain{



		public static void main(String[] args){
		
		try{
			Scanner scanner = new Scanner(System.in);
			int t,q;
			int E=0,O=0,temp;
			t = scanner.nextInt();
			ArrayList<Integer> S = new ArrayList<Integer>();
			//for q no. of test cases
			for(int i=0;i<t;++i){
				S.clear();
				q = scanner.nextInt();
				//for q no. of inputs in a test query
				for(int j=0;j<q;++j){
					E=0;O=0;
					temp = scanner.nextInt();
					S.add(temp);
					ArrayList<Integer> S1 = new ArrayList<Integer>();
					for(int k=0;k<S.size();++k){
						if(S.get(k) != temp){
							int tempx = S.get(k); 
							int w =  tempx ^ temp;
							S1.add(w);
						}							
					}
					for(int u=0;u<S1.size();++u){
						int z = S1.get(u);
						int flag=0;
						for(int o=0;o<S.size();++o){
		
							if(z == S.get(o))
							flag++;
						}
						if(flag==0){
							S.add(z);
						}
					}
					
					for(int f=0;f<S.size();++f){

						if(Integer.bitCount(S.get(f))%2==0)
						E++;
						else
						O++;
					}

					System.out.println(E + " " + O);
				}
				
					
			}//end of outer for()
			
		         }catch(Exception e){}
		}//end of main

}//end of class