package calculatorApp;

import java.util.InputMismatchException;
import java.util.Scanner;

import calculate.OperatorType;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OperatorType operatorType;
        while (true) {
            try {
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
                OperatorType operatorType = OperatorType.matchOperatorType(operator);
                int result = operatorType.operate(firstNumber, secondNumber);

                //결과 Calculate 클래스에 있는 ArrayList 에추가
                operatorType.setResult(result);

                //값 출력
                System.out.println("값=" + operatorType.getResult());

                //계산기 재시작 유무
                System.out.println("1.계속하기(아무키나 입력) 2.연산결과 조회 및 삭제 3.종료(exit 입력) ");
                String input = sc.next();
                sc.nextLine();


                //2번 입력시 결과 리스트 메뉴 출력
                if (input.equals("2")) {
                    while (true) {
                        System.out.println("1.입력한 값보다 큰 결과 조회 2.첫번째 저장값 삭제 3.전체리스트 보기 4.메뉴로 돌아가기");
                        int UpResultInput = sc.nextInt();
                        if (UpResultInput == 1) {
                            //입력한 값보다 큰숫자의 결과만 출력
                            operatorType.UpResult(firstNumber, secondNumber);
                        } else if (UpResultInput == 2) {
                            //결과값 리스트 선택한 인덱스 삭제
                            operatorType.ViewAllResult();
                            System.out.println("삭제할 값의 번호를 입력해주세요");
                            int indexChoice = sc.nextInt();
                            operatorType.removeResult(indexChoice);
                            System.out.println("삭제되었습니다.");
                        } else if (UpResultInput == 3) {
                            operatorType.ViewAllResult();
                        } else if (UpResultInput == 4) {
                            break;
                        }
                    }
                }
                //exit 입력시 반복정지
                else if (input.equals("exit")) {
                    break;
                }

            } catch (InputMismatchException e) {       //타입이 다를경우 외 발생
                System.out.println("요구하는 타입으로 입력해주세요");
                sc.nextLine();
            } catch (ArithmeticException e) {          //0으로 나누는 등 비정상 계산 예외 발생
                System.out.println("0으로 나눌 수 없습니다.");
            } catch (IllegalArgumentException e) {     //계산 클래스에서 연산자 인자값 예외 발생
                System.out.println("연산자를 입력하세요");
            } catch (Exception e) {                    //기타 예외 발생
                System.out.println("기타 오류입니다");
            }
        }

    }
}