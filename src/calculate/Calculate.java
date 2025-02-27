package calculate;

import operations.Addition;
import operations.Subtraction;
import operations.Multiplication;
import operations.Division;

import java.util.ArrayList;

public class Calculate {
    private final Addition addition;
    private final Subtraction subtraction;
    private final Multiplication multiplication;
    private final Division division;

    double result = 0;

    //게산 결과를 저장할 ArrayList
    private ArrayList<Double> arrayList = new ArrayList<>();

    //생성자
    public Calculate() {
        addition = new Addition();
        subtraction = new Subtraction();
        multiplication = new Multiplication();
        division = new Division();
    }

    //덧셈 메서드
    public double add(double num1, double num2) {
        addition.setAddition(num1, num2);
        result = addition.getAddition();
        return result;
    }

    //나눗셈 메서드
    public double Div(double num1, double num2) {
        division.setDivision(num1, num2);
        result = division.getDivision();
        return result;
    }

    //뺄셈 메서드
    public double Sub(double num1, double num2) {
        subtraction.setMSubtraction(num1, num2);
        result = subtraction.getSubtraction();
        return result;
    }

    //곱셈 메서드
    public double Mul(double num1, double num2) {
        multiplication.setMultiplication(num1, num2);
        result = multiplication.getMultiplication();
        return result;
    }

    //결과 리스트 수정(세터)
    public void setresult(double result) {
        this.arrayList.add(result);
    }

    //결과 불러오기
    public double getresult() {
        return result;
    }

    //처음 값 제거
    public void removeResult() {
        arrayList.removeFirst();
    }


}
