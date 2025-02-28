package operations;

public class Division {
    private int firstNum;
    private int secondNum;

    //세터
    public void setDivision(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    //게터
    public int getDivision() {
        return firstNum / secondNum;
    }
}
