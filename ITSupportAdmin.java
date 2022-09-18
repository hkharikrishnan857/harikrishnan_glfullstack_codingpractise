package com.lab1.exercise;

import java.util.Random;
import java.util.Scanner;

public class ITSupportAdmin {

	
	
	
		
	public static void main(String[] args) {

		Employee employee = new Employee("HariKrishnan", "Subramanian", 987654321);
		CredentialService credentialService=new CredentialService(employee);
		Random r = new Random();
		int choice;

        Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Technical.\n"

+ "2. Admin.\n" + "3. Human Resource.\n"

+ "4. Legal.\n" + "--> Enter 0 to Exit.\n");

System.out.println();



choice = sc.nextInt();

switch (choice) {



case 0:

choice = 0;

break;
case 1: {
	System.out.println(credentialService.generateEmail("Technical.", "abc.com"));
credentialService.generatePassword();
credentialService.showcredentials();
}

break;

case 2: {
	System.out.println(credentialService.generateEmail("Admin.", "abc.com"));
	credentialService.showcredentials();

}

break;
case 3: {
	System.out.println(credentialService.generateEmail("HumanResources.", "abc.com"));
	credentialService.generatePassword();
	credentialService.showcredentials();
}

break;



case 4: {
	System.out.println(credentialService.generateEmail("Legal.", "abc.com"));
	credentialService.generatePassword();
	credentialService.showcredentials();
}

break;



default:

System.out.println("Invalid choice. Enter a valid no.\n");

}



} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();


	}
	
}
