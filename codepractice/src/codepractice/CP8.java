package codepractice;

import java.util.Scanner;

public class CP8 {
public static void main(String[] args){

Scanner s =new Scanner(System.in);
System.out.println("enter mnth");
int month =s.nextInt();
	        String monthString;
	        switch (month) {
	            case 1:  monthString = "January";
	            break;
	            case 2:  monthString = "February";
	            break;
	            case 3:  monthString = "March";
	            break;
	            case 4:  monthString = "April";
	            break;
	            case 5:  monthString = "May";
	            case 6:  monthString = "June";
	            break;
	            case 7:  monthString = "July";
	            break;
	            case 8:  monthString = "August";
	            break;
	            
	           case 9:  monthString = "September";
	           break;
	           default: monthString = "Invalid month";
	           break;    
	            case 10: monthString = "October";
	                      case 11: monthString = "November";
	                 case 12: monthString = "December";
	                  }
	        System.out.println(monthString);
	    }
	}

