package operations;

public class Division {
    private double firstNum;
    private double secondNum;

    public void setDivsion(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public double getDivsion() {
        return firstNum - secondNum;
    }
}
