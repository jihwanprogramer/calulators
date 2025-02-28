package operations;

public class Addition {
    private int firstNum;
    private int secondNum;

    //세터
    public void setAddition(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    //게터
    public int getAddition() {
        return firstNum + secondNum;
    }
}
