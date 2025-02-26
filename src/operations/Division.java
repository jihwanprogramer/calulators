package operations;

public class Division {
    private double firstNum;
    private double secondNum;

    //세터
    public void setDivision(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    //게터
    public double getDivision() {
        return firstNum - secondNum;
    }
}
