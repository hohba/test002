package test002;

import java.util.Scanner;

public class Test0002 {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Input Number >");
		int n = Integer.parseInt(scan.next());//intŒ^‚É•ÏŠ·‚µ‚Ä‚¢‚é
		System.out.println("Number = "+n);
		
		System.out.println("Input Number >");
		double m = Double.parseDouble(scan.next());
		System.out.println("Number = "+m);
	}

}
