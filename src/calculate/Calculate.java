package calculate;

import operations.Addition;
import operations.Subtraction;
import operations.Multiplication;
import operations.Division;

public class Calculate {
    private Addition addition;
    private Subtraction subtraction;
    private Multiplication multiplication;
    private Division division;


    public Calculate() {
        addition = new Addition();
        subtraction = new Subtraction();
        multiplication = new Multiplication();
        division = new Division();
    }

    public double add(double num1, double num2) {
        addition.setAddtion(num1, num2);
        return addition.getAddtion();
    }

    public double Div(double num1, double num2) {
        division.setDivsion(num1, num2);
        return division.getDivsion();
    }

    public double Sub(double num1, double num2) {
        subtraction.setMSubtraction(num1, num2);
        return subtraction.getSubtraction();
    }

    public double Mul(double num1, double num2) {
        multiplication.setMultiplication(num1, num2);
        return multiplication.getMultiplication();
    }


}
