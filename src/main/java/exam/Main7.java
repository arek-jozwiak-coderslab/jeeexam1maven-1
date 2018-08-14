package exam;

public class Main7 {
	
	public static void main(String[] args){
		
		String str = "Wynik dodawania 1 i 2 to 3";
		
		System.out.println(countNumbers(str));
		
		
	}
	
	static int countNumbers(String str){
		
		char[] charArr = str.toCharArray();
		int sum = 0;
		for (int i = 0; i < charArr.length; i++){
			
				try {
					sum +=  Integer.parseInt(String.valueOf(charArr[i]));
				} catch (NumberFormatException e) {
					
				}
		}
		
		return sum;
	}
}
