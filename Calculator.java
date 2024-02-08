import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        // step 1
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input 2 whole numbers. Type the first number, hit enter, type the second number, hit enter.");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // step 2
        boolean looping = true;
        while (looping) {
            System.out.println("Would you like to perform addition or subtraction with those numbers? 'Y' for addition, 'N' for subtraction");
            String next = sc.next();
            if (next.equals("Y") || next.equals("y")) {
                System.out.println(a + b);
                looping = false;
            } 
            else if (next.equals("N") || next.equals("n")) {
                System.out.println(a - b);
                looping = false;
            }
        }

        sc.close();
    }
}