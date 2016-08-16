package com.zc.exception;
/*
 * 先执行finally中的代码.在执行try中的return
 * */
public class T01TryReturn {
	public static void main(String[] args) {
		testTry();
	}
	
	public static int testTry(){
		try {
			return 1;
			
		}catch(ClassCastException ee){
			
		}
		catch (Exception e) {
			
		}finally{
			System.out.println("finally中的代码");
		}
		return 0;
	}
}
