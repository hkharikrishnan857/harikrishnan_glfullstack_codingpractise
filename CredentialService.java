package com.lab1.exercise;

import java.security.SecureRandom;
import java.util.Random;

public class CredentialService {
	
	Employee emp;
	
	private String generatePassword;
	
	public CredentialService(Employee emp) {
		this.emp=emp;
	}

	public String generateEmail(String dept,String domain) {
		
		String generateEmail = emp.getFirstName()+emp.getLastName()+"@"+dept+domain;
		return generateEmail;
	}
	
	public String generatePassword() {
		//String smallCase=emp.getLastName(). substring(0,1).toLowerCase();
		 //generatePassword=random+"@"+emp.getFirstName().substring(0,1)+smallCase;
		
		String upperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerCase="abcdefghijklmnopqrstuvwxyz";
		String number="0123456789";
		String specialChar="&*()!@$";
		
		final String chars = upperCase+lowerCase+number+specialChar;

		SecureRandom securerandom = new SecureRandom();
		StringBuilder sb = new StringBuilder();
		int passwordLength=10;

		for (int i = 0; i < passwordLength; i++)
		{
			int randomIndex = securerandom.nextInt(chars.length());
			sb.append(chars.charAt(randomIndex));
		}
		return sb.toString();
	}

	
	public void showcredentials() {
	System.out.println("showing the credential:"+generatePassword());
	}
}
