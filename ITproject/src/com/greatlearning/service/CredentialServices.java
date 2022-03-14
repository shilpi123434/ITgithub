package com.greatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialServices {
	
	public char [] generatePassword () {
		
		String capitalLetters= "ABCDEFGHIJKLMNOPQR";
		String smallLetters="abcdefghijklmnopqr";
		String numbers= "0123456789";
		String Specialcharacters="@#$%&*";
		String pass = capitalLetters + smallLetters + numbers + Specialcharacters;
		
		
		// Random method 
		
		Random rd = new Random ();
		
		char [] password = new  char[8];
		
		
		for (int i =0; i<8 ; i++) {
			
			
			password [i] = pass .charAt(rd.nextInt(pass.length()));
			
			
			
			
		}
		return password;
	}
	
	
	public String genEmailAdd( String firstname, String lastname,String department) {
		
		
		
		
		
		
		return firstname+ lastname +"@" +department + "Shilpi.com";
		
		
	}
	public void showCredential(Employee employee ,String email, char []generatedPassword) {
		
		System.out.println("Dear "+ employee.getFirstname()+ " your  generated credentials are as follows ");
		System.out.println("Email --> "+email);
		System.out.println("Password -- > 1 " + " ");
		System.out.println(generatedPassword);
		
		
}
}
	
	