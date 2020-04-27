import java.util.Scanner;
public class Palindrom{
    public static void main (String[] args) {
        String inputString, reversedString = "";
        Scanner scannerQ = new Scanner(System.in);
        int stringLength;
        System.out.println("Enter a number or string");
        inputString = scannerQ.nextLine();
        stringLength = inputString.length();
        for (int x = stringLength -1; x>=0; x--) {
            reversedString = reversedString + inputString.charAt(x);
        }
        System.out.println("reversed value: " + reversedString);
        if(inputString.equals(reversedString))
            System.out.println("The entered value is a palindrome");
        else
            System.out.println("The entered value isn't a palindrome");
    }
}