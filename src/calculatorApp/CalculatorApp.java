package calculatorApp;

import java.util.Scanner;

import calculate.Calculate;

public class CalculatorApp {
    public static void main(String[] args) {

        //계산 메소드가 모여있는 Calculate 클래스 객체 생성
        Calculate calculator = new Calculate();
        Scanner sc = new Scanner(System.in);

        while (true) {
            double result = 0;

            //첫번째 숫자 입력
            System.out.println("첫번째 숫자를 입력하세요");
            int firstNumber = sc.nextInt();

            //두번째 숫자 입력
            System.out.println("두번째 숫자를 입력하세요");
            int secondNumber = sc.nextInt();

            //연산자 입력(+ , - , * , /)
            System.out.println("사칙연산자를 입력하세요(ex)+)");
            char operator = sc.next().charAt(0);
            sc.nextLine();

            //입력한 연산자에 따라 메서드 호출
            if (operator == '+') {
                result = calculator.add(firstNumber, secondNumber);
            } else if (operator == '-') {
                result = calculator.Sub(firstNumber, secondNumber);
            } else if (operator == '*') {
                result = calculator.Mul(firstNumber, secondNumber);
            } else if (operator == '/') {
                result = calculator.Div(firstNumber, secondNumber);
            }

            //결과 calculaote 클래스에 있는 ArrayList에 추가
            calculator.setresult(result);

            //값 출력
            System.out.println("값=" + calculator.getresult());

            //먼저 저장된 데이터 삭제
            calculator.removeResult();

            //계산기 재시작 유무
            System.out.println("1.계속하기(아무키나 입력) 2.종료(exit 입력)");
            String input = sc.next();

            //exit 입력시 반복정지
            if (input.equals("exit")) {
                break;
            }
        }
        sc.close();
    }
}