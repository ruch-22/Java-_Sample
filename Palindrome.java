import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        String org;
        String rev="";
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        org= in.nextLine();
        int length = org.length();
        for(int i = length-1;i>=0;i--)
            rev = rev + org.charAt(i);
            if(org.equals(rev))
            System.out.println("The entered string is a palindrome");
            else
            System.out.println("The entered string is not a palindrome");
        
    }
    
}
