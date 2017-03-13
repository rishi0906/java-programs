package codepractice;

import java.util.Scanner;

public class evenandodd {
	public static void main(String... a){
		int num;

		System.out.println("enter a number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		if(num%2==0){
			System.out.println("even");
			
		}
		else{
			System.out.println("not even");
		}
	}
}
