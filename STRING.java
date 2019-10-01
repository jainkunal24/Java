import java.util.*;
import java.io.*;

class STRING {

	public static void main(String[] args){
	
		String a = "Hello";
		String b = "hello";
		 int[] a1 = new int[26];
        int[] b1 = new int[26];
        for(int i=0;i<26;++i){
            a1[i] = 0;
            b1[i] = 0; 
        }
        int i=0;
        int pos;
        while(i != a.length()){
	System.out.println(Character.toLowerCase(a.charAt(i)));
            pos = (int)(Character.toLowerCase(a.charAt(i))) - 97;
            a1[pos]+=1;
            ++i;
        }
	System.out.println();
        i = 0;
        while(i != b.length()){
            System.out.println(Character.toLowerCase(b.charAt(i)));
	pos = (int)(Character.toLowerCase(b.charAt(i))) - 97;
            b1[pos]+=1;
            ++i;
        }

}














}