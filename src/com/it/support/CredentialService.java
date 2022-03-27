package com.it.support;

import java.util.Random;

public class CredentialService {

	String emailId;

	public char[] generatePassword() {
		String capitalLetter = "ABCDEFGHIJKLMNOPQRSSTUVWXYZ";
		String smallLetter = "abcdefghijklmnopqrstuvwxyz";
		String specialcharacter = "!@#$%^&*";
		String numbers = "1234567890";
		String combined	= capitalLetter+smallLetter+specialcharacter+numbers;
		Random random = new Random();
		char[] password = new char [10];
		for (int i = 0; i<8;i++) {
			password[i] = combined.charAt(random.nextInt(combined.length()));
		}
		return password;
		
		}
	public String genrateEmailaddress(String firstName, String lastName, String department) {
		emailId = firstName + lastName + "@" + department +".gl.com";
		return emailId;
	}
	public void showCredntials(String generateEmail, char[] generatePassword) {
		System.out.println("Email :" + generateEmail);
		System.out.print("Password :");
		System.out.print(generatePassword);
	}
}
