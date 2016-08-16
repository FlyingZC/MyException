package com.zc.exception;

public class Test02Unsupported {
	public static void main(String[] args) {
		testThrow();
		throw new UnsupportedOperationException();
	}
	
	public static void testThrow(){
		throw new UnsupportedOperationException("方法尚未实现");
	}
}
