package codepractice;

import java.util.Scanner;

public class reverseofanumber {

	public int reverse(){
		int number;
		
Scanner s =new Scanner(System.in);
System.out.println("enter d number"); 
number =s.nextInt();
 
int reverse=0;
	while(number!=0){
		reverse=(reverse*10)+(number%10);
		number=number/10;
	
	}
	
	return reverse;
	}

	public static void main(String[] args) {

	reverseofanumber t = new reverseofanumber();
	System.out.println(t.reverse());
	}	}

	

		
		
		
		
		
		
		
		
		
		
		
	