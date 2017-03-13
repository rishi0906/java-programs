package codepractice;

import java.util.Scanner;

public class AgeCaluculate {

	int month[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    String id;
    int d, m, y;

    public AgeCaluculate() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your day=");
        d = input.nextInt();
        System.out.println("Enter your month=");
        m = input.nextInt();
        System.out.println("Enter your year=");
        y = input.nextInt();
    }

    public void CalculateAge() {
        int date = 0, mon = 0, year = 0;

        if (1 < d && 1 < m) {
            date = ((month[m - 1] + 01) - d);
            mon = (12 - m);
            year = (2017 - y);
        } else if (1 < d && 1 >= m) {
            date = ((month[m - 1] + 01) - d);
            mon = (12 - m);
            year = (2017 - y);
        } else if (d == 1 && 1 < m) {
            date = 1 - d;
            mon = (13 - m);
            year = (2017 - y);
        } else if (d == 1 && m == 1) {
            date = 30 - d;
            mon = (13 - m);
            year = (2017 - y);
        }
        System.out.println(year + " years " + mon + " months " + date + " days");
    }

    public static void main(String args[]) {
        AgeCaluculate a = new AgeCaluculate();
        System.out.println("Your age calculated on 2012/01/01");
        a.CalculateAge();
    }
}

	
	
	

