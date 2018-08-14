package exam;

public class Main2 {
	
	public static void main (String[] args){
		
		String str = "Naucz się programować od podstaw";
		
		System.out.println(shorten(str, 2));
		
		
		
	}
	
	
	
	static String shorten(String str, int length){
		
		return str.substring(0, length);
		
		
	}
	
}
