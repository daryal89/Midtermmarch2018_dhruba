package problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        String originalStr = "Madam";
        String reverseStr = "";   // Objects of String class

        int length = originalStr.length();
        for (int i = length - 1; i >= 0; i--)
            reverseStr = reverseStr + originalStr.charAt(i);

        if (originalStr.equalsIgnoreCase(reverseStr))
            System.out.println("This word is a palindrome :"+originalStr );
        else
            System.out.println("This word is not a palindrome :"+originalStr );
    }
}
