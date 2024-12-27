package password;

import java.util.Scanner;

public class TextBasedInterface implements UserInterface{
    private Scanner scanner;
	
    public TextBasedInterface() {
    	this.scanner=new Scanner(System.in);
    }
	@Override
	public int getPasswordLength() {
		// TODO Auto-generated method stub
		System.out.println("Please enter the password length: ");
		return scanner.nextInt();
	}

	@Override
	public boolean useLowerCase() {
		// TODO Auto-generated method stub
		System.out.println("Would you like the password to have lowercase characters? (y/n): ");
		return scanner.next().equalsIgnoreCase("y");
	}

	@Override
	public boolean useUppercase() {
		// TODO Auto-generated method stub
		System.out.println("Would you like the password to have uppercase characters? (y/n): ");
		return scanner.next().equalsIgnoreCase("y");
	}

	@Override
	public boolean useNumbers() {
		// TODO Auto-generated method stub
		System.out.println("Would you like the password to have numerical characters? (y/n): ");
		return scanner.next().equalsIgnoreCase("y");
	}

	@Override
	public boolean useSymbols() {
		// TODO Auto-generated method stub
		System.out.println("Would you like the password to have symbol characters? (y/n): ");
		return scanner.next().equalsIgnoreCase("y");
	}

	@Override
	public void displayPassword(String password) {
		// TODO Auto-generated method stub
		System.out.println("Here is the password: " + password);
	}

}
