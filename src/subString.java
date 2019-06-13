import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;
public class subString {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = scan.nextLine();
        System.out.println("Enter an index: ");
        int index = scan.nextInt();
        System.out.println("The length of your string is " + word.length());
        if(index < word.length()) {
            System.out.println("The substring from 0-INDEX of the word you entered is : " + word.substring(0, index));
        }
        else if (index > word.length()){
            System.out.println("Index is larger than length");
        }
    }

}