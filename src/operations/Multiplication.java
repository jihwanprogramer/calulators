package operations;

public class Multiplication {
    private double firstNum;
    private double secondNum;

    public void setMultiplication(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public double getMultiplication() {
        return firstNum * secondNum;
    }
}
