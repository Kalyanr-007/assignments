
import java.util.Scanner;

public class ForRevNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        int reversedNumber = 0;

        for (int temp = number; temp != 0; temp /= 10) {
            int digit = temp % 10;
            reversedNumber = reversedNumber * 10 + digit;
        }

        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }
}
