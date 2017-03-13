package codepractice;

import java.util.Scanner;

public class primenumbers { 
	    public static void main(String a[]){
	    	
	    	int temp,num;
	    	boolean isprime=true;
	    	
	    	Scanner s =new Scanner(System.in);
	    	System.out.println("enter d numb");
	    	 num=s.nextInt();
	    	for(int i=2;i<num;i++){
	    		temp=num%i;
	    	if(temp==0){
	    		isprime=false;
	    		break;
}}
	    if(isprime)
	    	System.out.println("prime");
	    	else
	    	System.out.println("not prime");
	    		
}}

