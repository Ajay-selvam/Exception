package practice;

import java.util.Scanner;

public class NumException {

	public static void main(String[] args) {
		int num;
		 Scanner sc = new Scanner(System.in);
	        
	            System.out.println("Enter any valid Integer: ");
	            try {
	                num = Integer.parseInt(sc.next());
	                System.out.println("You entered: " + num);
	                
	            }
	            catch (NumberFormatException e) {
	                System.out.println("Number Format Exception occurred");
	            }
	        

	}

}
