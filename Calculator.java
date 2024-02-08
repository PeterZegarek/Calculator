import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        // step 1 - updated to include step 4
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input 2 whole or floating point numbers. Type the first number, hit enter, type the second number, hit enter.");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        // step 2 - updated to include step 3 and 4
        boolean looping = true;
        while (looping) {
            System.out.println("Would you like to perform addition, subtraction, multiplication, or division with those numbers? 'A' for addition, 'S' for subtraction, 'M' for multiplication, 'D' for division.");
            String next = sc.next();
            if (next.equals("A") || next.equals("a")) {
                System.out.println(a + b);
                looping = false;
            } 
            else if (next.equals("S") || next.equals("s")) {
                System.out.println(a - b);
                looping = false;
            }
            else if (next.equals("M") || next.equals("m")) {
                System.out.println(a * b);
                looping = false;
            }
            else if (next.equals("D") || next.equals("d")) {
                System.out.println(a / b);
                looping = false;
            }
        }

        sc.close();
    }
}