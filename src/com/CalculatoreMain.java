package com;
import java.util.Scanner;
public class CalculatoreMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		Calculator cal = new CalculatoreImpl(); //rule 3
		cal.add(a, b);
		cal.mul(a, b);

	}

}
