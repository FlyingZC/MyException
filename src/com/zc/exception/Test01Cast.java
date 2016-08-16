package com.zc.exception;

public class Test01Cast {
	public static void main(String[] args) {
		Object o=new Integer(1);
		System.out.println(String.valueOf(o));
		/* java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String*/
		//System.out.println((String)o);
		
		Integer i=new Integer(1);
		//编译出错 Cannot cast from Integer to String
		//System.out.println((String)i);
	}
}
