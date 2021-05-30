package com.ivy.test;

public class Test {

	public static void main(String[] args) {

		int a[] = { 1, 0, 1, 1, 0, 0, 0, 1 };

		int index = 0;
		for (int i : a) {

			if (i == 0) {
				a[index++] = 0;
			}
		}

		for (int i = index; i < a.length; i++) {
			a[index++] = 1;
		}

		for (int i : a) {
			System.out.print(i + " ");
		}

	}

}
