package exam;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main8 {

	public static void main(String[] args){
		create(100);
	}

	static void create(int max){
		Scanner scan = new Scanner(System.in);
		int n = getInt("Input number of partcipants: ");
		try {
			FileWriter fileW = new FileWriter("exam.txt", false);
			for (int i = 1; i <= n; i++){
				fileW.append(getLogin("Podaj login: ")).append(" ");
				fileW.append(String.valueOf(getInt("Podaj ilość punktów: "))).append("\n");				
			}
				
			fileW.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		File file = new File("exam.txt");
		try {
			Scanner scanF = new Scanner(file);
			FileWriter file2 = new FileWriter("exam_passed.txt", false);
			while (scanF.hasNextLine()) {
				String[] elements = scanF.nextLine().split(" ");
				if (Integer.parseInt(elements[1]) >= max * 0.60){
					
					file2.append(elements[0]).append(" ").append(elements[1]).append("\n");
					
				}
			}
			scanF.close();
			file2.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

    static int getInt(String title) {
    	Scanner scan = new Scanner(System.in);
    	int param;
    	
    	System.out.print(title);
    	while (!scan.hasNextInt()) {
    		System.out.println("waiting for a number");
    		scan.next();
    		
    	}
    	param = scan.nextInt();

    	return param;
    }
    
    static String getLogin(String title) {
    	Scanner scan = new Scanner(System.in);
    	System.out.print(title);
    	return scan.next();
    }
}
