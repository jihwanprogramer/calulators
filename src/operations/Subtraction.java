package operations;

public class Subtraction {
    private double firstNum;
    private double secondNum;

    //세터
    public void setMSubtraction(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    //게터
    public double getSubtraction() {
        return firstNum / secondNum;
    }
}
