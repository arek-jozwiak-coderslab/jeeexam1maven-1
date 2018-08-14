package exam;

import java.util.Scanner;

public class Main5 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		System.out.println(" Volume of the ball is : " + ball());
		scan.close();
	}

	public static double ball(){
		double r = getDouble("Input a value for radius: ");
		return  (4 / 3.0) * Math.PI * Math.pow(r, 3);
	}

    /**
     *
     * @param title
     * @return
     */
    static double getDouble(String title) {
//		Scanner scan = new Scanner(System.in);
    	double param;
    	System.out.print(title);
    	while (!scan.hasNextDouble()) {
    		System.out.println("waiting for a value");
    		scan.next();
    	}
    	param = scan.nextDouble();
    	return param;
    }

}
