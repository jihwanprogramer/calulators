package calculate;

import operations.Addition;
import operations.Subtraction;
import operations.Multiplication;
import operations.Division;

public class Calculate {
    private final Addition addition;
    private final Subtraction subtraction;
    private final Multiplication multiplication;
    private final Division division;

    //게산 결과를 저장할 ArrayList
    //생성자
    public Calculate() {
        addition = new Addition();
        subtraction = new Subtraction();
        multiplication = new Multiplication();
        division = new Division();
    }

    //덧셈 메서드
    public int Add(int num1, int num2) {
        addition.setAddition(num1, num2);
        return addition.getAddition();
    }

    //나눗셈 메서드
    public int Div(int num1, int num2) {
        division.setDivision(num1, num2);
        return division.getDivision();
    }

    //뺄셈 메서드
    public int Sub(int num1, int num2) {
        subtraction.setMSubtraction(num1, num2);
        return subtraction.getSubtraction();
    }

    //곱셈 메서드
    public int Mul(int num1, int num2) {
        multiplication.setMultiplication(num1, num2);
        return multiplication.getMultiplication();
    }


}
