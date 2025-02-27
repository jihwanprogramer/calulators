package operations;

public class Multiplication {
    private int firstNum;
    private int secondNum;

    //세터
    public void setMultiplication(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    //게터
    public int getMultiplication() {
        return firstNum * secondNum;
    }
}
