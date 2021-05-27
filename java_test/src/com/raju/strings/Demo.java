package com.raju.strings;

public class Demo {

	public static void main(String[] args) {

		String s[] = { "raju", "kumar", "hello", "world", "120" };
		
		for(String str:s) {
			System.out.println(str);
		}

		String name = "raju";
		String name1=new String("raju");
		System.out.println(name.hashCode());
		System.out.println(name1.hashCode());
		
		char ch[] = name.toCharArray();

		for (char c : ch) {
			System.out.println(c);
		}

	}

}
