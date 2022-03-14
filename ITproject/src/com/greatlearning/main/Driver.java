package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialServices;

public class Driver {

	
	public static void main(String[] args) {
		
		
		
		
		Employee employee  = new Employee ("Shilpi", "Das", null);
		
		CredentialServices cs= new CredentialServices();
		
		
		String generatedEmail; 
		
		char[]generatedPassword;
		
		System.out.println("Please enter deptt from the following");
		System.out.println(" 1. TECHNICAL");
		System.out.println(" 2. ADMIN");
		System.out.println(" 3. HUMAN RESOURCE");
		System.out.println("4. LEGAL ");
		
		
		Scanner sc = new Scanner(System.in);
		
		int option =sc .nextInt();
		
		switch (option) {
		
		case 1:
			
			generatedEmail= cs .genEmailAdd(employee .getFirstname().toLowerCase(),employee.getLastname().toLowerCase(),"tech");
			
			generatedPassword= cs.generatePassword();
			
			cs.showCredential(employee, generatedEmail, generatedPassword);
		
		
		case 2:
			
generatedEmail= cs .genEmailAdd(employee .getFirstname().toLowerCase(),employee.getLastname().toLowerCase()," admin");
			
			generatedPassword= cs.generatePassword();
			
			cs.showCredential(employee, generatedEmail, generatedPassword);
			
			
		case 3: 
			
generatedEmail= cs .genEmailAdd(employee .getFirstname().toLowerCase(),employee.getLastname().toLowerCase(),"HR");
			
			generatedPassword= cs.generatePassword();
			
			cs.showCredential(employee, generatedEmail, generatedPassword);
			
			
		case 4:
			
			
generatedEmail= cs .genEmailAdd(employee .getFirstname().toLowerCase(),employee.getLastname().toLowerCase(),"legal");
			
			generatedPassword= cs.generatePassword();
			
			cs.showCredential(employee, generatedEmail, generatedPassword);
			
			
		
			
		
		
		
		// TODO Auto-generated method stub

	}
		System.out.println("ENTER A VALID OPTION");
		
		sc.close();

	}
}
