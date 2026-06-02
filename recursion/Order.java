package com.recursion;

public class Order {

	public static void printDec(int n) {//Decreasing Order

		if (n == 1) {
			System.out.println(n);
			return;
		}
		System.out.print(n + " ");
		printDec(n - 1);

	}

	public static void printInc(int n) { //Increasing order

		if (n == 1) {
			System.out.print(n+" ");
			return;
		}
		printInc(n - 1);
		System.out.print(n + " ");
		

	}

	public static void main(String[] args) {
		int n = 10;
		printDec(n);
		printInc(n);
	}
}
