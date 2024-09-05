import java.util.Scanner;

public class Summa{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        scanner.close();

        // Special case for 1
        if (num == 1) {
            System.out.println("1 is neither prime nor composite");
            return;
        }

        boolean flag = false; // Assuming the number is prime

        // Check for factors from 2 to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = true; // Number has a divisor other than 1 and itself
                break;
            }
        }

        // If flag is still false, no divisors were found; the number is prime
        if (!flag) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
 
