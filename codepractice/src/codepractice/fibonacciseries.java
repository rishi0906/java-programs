package codepractice;

import java.util.Scanner;

public class fibonacciseries {
		public static void main(String args[])  
		{    
			int n1=0,n2=1,n3,i,count;
	Scanner s =new Scanner(System.in);
	System.out.println("enter the count");
	count=s.nextInt();
	
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		}}  

