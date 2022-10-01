package Sub_2;
import java.util.*;

public class password_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("A password is said to be strong if it satisfies the following criteria:\r\n"
				+ "1. It contains at least one lowercase English character.\r\n"
				+ "2. It contains at least one uppercase English character.\r\n"
				+ "3. It contains at least one special character. The special characters are: ! @ # $ % ^ & * ( ) - +\r\n"
				+ "4. Its length is at least 8.\r\n"
				+ "5. It contains at least one digit.");
		System.out.print("Enter the Password to check weather it is strong or not = ");
		String  str = sc.nextLine();
		
		
		// Checking lower alphabet in string
        int n = str.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^', '&','*', '(', ')', '-', '+'));
        for (char i : str.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }
       
        // Now checking Strength of password as per mentioned guide lines
        System.out.print("Strength of password:- ");
            try {
            	if (hasDigit && hasLower && hasUpper && specialChar && (n >= 8))
                    System.out.print("It is  Strong Password");
            	else
            		throw new muskan("It is weak password");
            }catch(muskan e){
            	System.out.print(e.getMessage());
            }

	}

}
