package exam;

public class Main6 {
	
	public static void main(String[] args){
	
		String str = "Ala ma kota a kot ma przekichane";
		System.out.println(replaceStr(str, "kot", "bot"));
		
		
	}
	
	static String replaceStr(String str, String forReplace, String replacement){
	
		return str.replaceAll(forReplace, replacement);
		
	}
}
