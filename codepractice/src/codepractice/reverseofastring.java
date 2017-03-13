package codepractice;

import java.util.Scanner;

public class reverseofastring {
public static void main(String... args){
	
/*	String original,reverse="";
	Scanner s =new Scanner(System.in);
	System.out.println("enter the string");
	original=s.nextLine();
	int length=original.length();
	
	for(int i=length-1;i>=0;i--)
		reverse=reverse+original.charAt(i); //charAt(i) returns the charecter of index "i"
	System.out.println("string is "+reverse);
	}
}*/
	
String original,reverse="";	
	Scanner s =new Scanner(System.in);
	System.out.println("enter the string");
	original=s.nextLine();

int length=original.length();
for(int i=length-1;i>=0;i--)
{
	reverse=reverse+original.charAt(i);
}
	
	System.out.println(reverse);     //reverse and palindrome together
	if (original.equals(reverse))
        System.out.println("Entered string is a palindrome.");
     else
        System.out.println("Entered string is not a palindrome.");
}
}
	
	