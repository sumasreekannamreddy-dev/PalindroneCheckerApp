import java.util.LinkedList;
import java.util.Scanner;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Define the input string
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the LinkedList
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println("Is Palindrome? true");
        } else {
            System.out.println("Is Palindrome? false");
        }

        sc.close();
    }
}