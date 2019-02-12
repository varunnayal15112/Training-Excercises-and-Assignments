package ExceptionHandling;

import java.util.Scanner;

public class tryCatchClause {
    public static void main(String[] args) {
        int result, numerator, denominator;
        System.out.println("Enter Numerator and Denominator : ");
        Scanner sc = new Scanner(System.in);
        numerator = sc.nextInt();
        denominator = sc.nextInt();
        try {
            result = numerator/denominator;
            System.out.println("Result : " + result);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            sc.close();
        }
    }
}
