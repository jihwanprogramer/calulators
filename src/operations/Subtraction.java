package operations;

public class Subtraction {
    private int firstNum;
    private int secondNum;

    //세터
    public void setMSubtraction(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    //게터
    public int getSubtraction() {
        return firstNum - secondNum;
    }
}
