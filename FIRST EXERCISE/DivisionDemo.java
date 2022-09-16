package codersclub;

import java.util.Scanner;

public class DivisionDemo {
	public static void main(String[] args) {
		float div,dvd,q;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the divisor and dividend");
		div=scanner.nextFloat();
		dvd=scanner.nextFloat();
		scanner.close();
		System.out.print(Division.divide(dvd, div));
		System.out.print(remainder.divide(dvd, div));
	}
}
