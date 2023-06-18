import java.util.Scanner;

class NumberToWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a single-digit number (0-9): ");
        int number = scanner.nextInt();

        String word;

        if (number == 0) {
            word = "Zero";
        } else if (number == 1) {
            word = "One";
        } else if (number == 2) {
            word = "Two";
        } else if (number == 3) {
            word = "Three";
        } else if (number == 4) {
            word = "Four";
        } else if (number == 5) {
            word = "Five";
        } else if (number == 6) {
            word = "Six";
        } else if (number == 7) {
            word = "Seven";
        } else if (number == 8) {
            word = "Eight";
        } else if (number == 9) {
            word = "Nine";
        } else {
            word = "Invalid number";
        }

        System.out.println("Number in words: " + word);

        scanner.close();
    }
}
