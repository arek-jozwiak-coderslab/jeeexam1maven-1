package exam;

import java.util.Arrays;
import java.util.Random;

public class Main3 {
	
	public static void main(String[] args){
		

		System.out.println(Arrays.toString(div(5,20)));
		
		
	}
	
	
	static int[] div(int size, int interval){
		
		Random r = new Random();
		int[] intArr = new int[size];
		
		for (int i = 0; i < intArr.length; i++){
			while (true) {
				int n = r.nextInt(interval - 1) + 1;
				if ((n % 2 == 0) && (n % 3 != 0)) {
					intArr[i] = n;
					break;
				}
				
			
			}
		}
		
		return intArr;
	}
	
}
