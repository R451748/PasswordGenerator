package password;

import java.util.Random;

public class PasswordGenerator {
		private boolean hasOverlap(String s1, String s2) {
			for(char c :s1.toCharArray()) {
				if(s2.contains(String.valueOf(c))) {
					return true;
				}
			}
			
			return false;
		}
		
		String generatePassword(int length,boolean useLowercase,boolean useUppercase,boolean useNumbers,boolean useSpecialChars) {
		String lowerCase="abcdefghijklmnopqrstuvwxyz";
		String upperCase="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String digits="0123456789";
		String symbols="!@#$%^&*()?";
		
		StringBuilder charOptions=new StringBuilder(); 
		
		if(useLowercase) {
			charOptions.append(lowerCase);
		}
		
		if(useUppercase) {
			charOptions.append(upperCase);
		}
		
		if(useNumbers) {
			charOptions.append(digits);
		}
	
		if(useSpecialChars) {
		charOptions.append(symbols);
		}
		
		String allChars=charOptions.toString();
		boolean passwordIsValid=false;
		
		while(true) {
			StringBuilder password=new StringBuilder();
			Random rand=new Random();
			
			for(int i=0;i<length;i++) {
				char nextLetter=allChars.charAt(rand.nextInt(allChars.length()));
				password.append(nextLetter);
			}
			
			String pass= password.toString();	
			
			passwordIsValid=true;
			
			if(useLowercase && !hasOverlap(pass,lowerCase)) {
				passwordIsValid=false;
			}
			
			if(useUppercase && !hasOverlap(pass,upperCase)) {
				passwordIsValid=false;
			}
			
			if(useNumbers && !hasOverlap(pass,digits)) {
				passwordIsValid=false;
			}
			
			if(useSpecialChars && !hasOverlap(pass,symbols)) {
				passwordIsValid=false;
			}
			
			if(passwordIsValid) {
				return pass;
			}
			System.out.println("Pasword failed Please try again..." + pass);
		}
		
	  
	}
}