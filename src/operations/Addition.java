package operations;

public class Addition {
    private double firstNum;
    private double secondNum;

    //세터
    public void setAddition(double firstNum, double secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    //게터
    public double getAddition() {
        return firstNum + secondNum;
    }

}
