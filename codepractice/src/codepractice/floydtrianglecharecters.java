package codepractice;

import java.util.Scanner;

public class floydtrianglecharecters {
public static void main(String[] a){
	int line;
	char ch ='A';
	
	Scanner s = new Scanner(System.in);
	System.out.println("enter number of lines");
	
	
	line =s.nextInt();
	
	
	for(int i=0;i<line;i++)
	{
		for(int j=0;j<i;j++)
		{
			System.out.print(ch);
		}
	System.out.println(ch++);
	
	}
}
}
