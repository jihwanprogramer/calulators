package operations;

public class Multiplication {
    private double firstNum;
    private double secondNum;

    //세터
    public void setMultiplication(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    //게터
    public double getMultiplication() {
        return firstNum * secondNum;
    }
}
