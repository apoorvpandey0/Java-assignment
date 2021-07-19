import java.util.Scanner;

public class Q1 {
// Q1. Write a program that accepts two numbers from the user and print their sum using Scanner class
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int a = input.nextInt();
    System.out.print("Enter the second number: ");
    int b = input.nextInt();
    System.out.println("The sum is: " + (a+b));
    input.close();
}
}


