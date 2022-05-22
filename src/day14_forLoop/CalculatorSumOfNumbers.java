package day14_forLoop;

import java.util.Scanner;

public class CalculatorSumOfNumbers {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int lastNumber = input.nextInt();
        int result = 0;

        for(int i = 0; i<=lastNumber; i++){
            result +=i;
        }
        System.out.println("result = " + result);

    }
}
/*Write a program that can calculate the sum of all numbers between 1 to any given number.
            ex:
                    input: 100
                    output: 5050

                    input: 50
                    output: 1275

 */