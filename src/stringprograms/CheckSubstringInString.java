package stringprograms;
import java.util.Scanner;
public class CheckSubstringInString {
    public static void main(String[] args) {
        //1
        Scanner scanner = new Scanner(System.in);
        String inputString;
        String subString;
        //2
        System.out.println("Enter a string : ");
        inputString = scanner.nextLine();
        //3
        System.out.println("Enter a substring to find in the string : ");
        subString = scanner.next();
        //4
        int index = inputString.indexOf(subString);
        //5
        if (index != -1) {
        	System.out.println("Input sub string is found in string");
            System.out.println("Index of this word : " + index);
        } else {
            System.out.println("The input sub-string is not found in the string.");
        }
    }
}