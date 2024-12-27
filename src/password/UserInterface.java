package password;

public interface UserInterface {
       public int getPasswordLength();
       public boolean useLowerCase();
       public boolean useUppercase();
       public boolean useNumbers();
       public boolean useSymbols();
       public void displayPassword(String password);
}
