package codepractice;

import java.util.Scanner;

public class evenorodd {
public static void main(String [] a){
	int i;
	Scanner s =new Scanner(System.in);
	System.out.println("babu enter number");
	i=s.nextInt();

	if(i%2==0)
		System.out.println("even");
	else
		System.out.println("odd");

}
}