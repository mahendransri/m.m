package org.demo;

public class sample {
	private static int a;

	private void add() {
		a = 20;
		System.out.println(a);
	}

	private void print() {
		a = 30;
		System.out.println(a);
	}

	public static void main(String[] args) {
		sample s = new sample();
		System.out.println(s.a);
		s.add();
		System.out.println(s.a);
		s.print();
		System.out.println(s.a);
		sample s1 = new sample();
		System.out.println(s1.a);
	}
}
