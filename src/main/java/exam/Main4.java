package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args){

		System.out.println(Arrays.toString(returnTab()));
		scan.close();
	}
	static int[] returnTab(){
		
		int size = getInt("Input size of array: ");
		int[] intArr = new int[size];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = i + 1;
		}
		return intArr;
		
		
	}
    static int getInt(String title) {
//		Scanner scan = new Scanner(System.in);
    	int param;
    	System.out.print(title);
    	while (!scan.hasNextInt()) {
    		System.out.println("waiting for a number");
    		scan.next();
    	}
    	param = scan.nextInt();
    	return param;
    }

}
