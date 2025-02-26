package calculatorApp;

import java.util.Scanner;

import calculate.Calculate;

public class Main {
    public static void main(String[] args) {

        Calculate calculator = new Calculate();
        Scanner sc = new Scanner(System.in);

        while (true) {
            double result = 0;
            System.out.println("숫자를 입력하세요(ex)5 4)");
            int firstNumber = sc.nextInt();
            int secondNumber = sc.nextInt();

            System.out.println("사칙연산자를 입력하세요(ex)+)");
            char operator = sc.next().charAt(0);
            sc.nextLine();

            if (operator == '+') {
                result = calculator.add(firstNumber, secondNumber);
            }
            else if (operator == '-') {
                result = calculator.Div(firstNumber, secondNumber);
            }
            else if (operator == '*') {
                result = calculator.Mul(firstNumber, secondNumber);
            }
            else if (operator == '/') {
                result = calculator.Sub(firstNumber, secondNumber);
            }

            System.out.println("값=" + result);
            System.out.println("1.계속하기(아무키나 입력) 2.종료(exit 입력)");
            String input = sc.next();

            if (input.equals("exit")) {
                break;
            }
        }
        sc.close();
    }
}