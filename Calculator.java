import java.util.Scanner;

public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input 2 whole numbers. Type the first number, hit enter, type the second number, hit enter.");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a+b);
        

        sc.close();
    }
}