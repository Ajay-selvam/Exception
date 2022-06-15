package practice;

import java.util.Scanner;

class Username extends Exception {
	 
	 public Username(String text) {
	  super(text);
	 }
}

class Password extends Exception {
	 
	 public Password(String text) {
	  super(text);
	 }
}


public class Login {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  String username, password;
		  
		  System.out.print("Enter username :: ");
		  username = sc.nextLine();
		  
		  System.out.print("Enter password :: ");
		  password = sc.nextLine();
		  
		  int length = username.length();
		  
		  try {
		   if(length < 5) {
		    throw new Username("Username must be greater than 5 characters ?");
		   }
		   else if(!password.equals("execute")) {
		    throw new Password("Incorrect password\nType correct password ?");
		   }
		   else {
		    System.out.println("Login Successful !");
		   }
		  }
		  catch (Username u) {
		   u.printStackTrace();
		  }
		  catch (Password p) {
		   p.printStackTrace();
		  }
		  finally {
		   System.out.println("The finally statement is executed");
		  }
		 }
		

	}


