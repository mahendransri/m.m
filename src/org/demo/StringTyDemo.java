package org.demo;

public class StringTyDemo {
public static void main(String[] args) {
//	String refname = "value";
	String s = "java";
	String s1 = "selenium";
	String s2 = "java";
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	System.out.println(System.identityHashCode(s2));
}
}
