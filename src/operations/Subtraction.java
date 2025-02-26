package operations;

public class Subtraction {
    private double firstNum;
    private double secondNum;

    public void setMSubtraction(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public double getSubtraction() {
        return firstNum / secondNum;
    }
}
