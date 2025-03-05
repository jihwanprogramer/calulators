package calculate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//연산자의 종류를 정의하는 열거형 클레스
public enum OperatorType {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String symbol; //입력받을 연산자 기호
    private final Calculate calculate = new Calculate();
    int result;

    //생성자:연산자 기호 설정
    OperatorType(String symbol) {
        this.symbol = symbol;
    }

    //연산자의 기호를 반환하는 게터
    public String getSymbol() {
        return symbol;
    }

    //입력받은 기호와 동일한 연산자 타입을 찾는 메서드
    public static OperatorType matchOperatorType(char symbol) {
        for (OperatorType operatorType : OperatorType.values()) { //모든 Enum 순환
            if (operatorType.getSymbol().charAt(0) == symbol) {   //일치하는지 확인
                return operatorType;
            }
        }
        throw new IllegalArgumentException(); //호출한 쪽에서 예외 처리
    }

    //첫번째 숫자와 두번쨰숫자의 연산을 수행하는 메서드
    public int operate(int firstNumber, int secondNumber) {
        if (ADD.getSymbol().equals(symbol)) {
            result = calculate.Add(firstNumber, secondNumber);
            return result;
        }
        if (SUBTRACT.getSymbol().equals(symbol)) {
            result = calculate.Sub(firstNumber, secondNumber);
            return result;
        }
        if (MULTIPLY.getSymbol().equals(symbol)) {
            result = calculate.Mul(firstNumber, secondNumber);
            return result;
        }
        if (DIVIDE.getSymbol().equals(symbol)) {
            result = calculate.Div(firstNumber, secondNumber);
            return result;
        }
        throw new IllegalArgumentException();

    }

    //결과 리스트 생성
    private static final List<Integer> arrayList = new ArrayList<>();

    //결과 리스트 추가(세터)
    public void setResult(int result) {
        arrayList.add(result);
    }

    //결과 불러오기
    public int getResult() {
        return result;
    }

    //결과 리스트 첫번째 데이터값 제거
    public void removeResult(int index) {
        arrayList.remove(index);
    }

    //람다식과 스트림을 활용하여 입력한 값보다 높은 결과값 출력
    public void UpResult(int FirstNum, int SecondNum) {
        List<Integer> filteredArr = arrayList.stream()
                .filter(num -> FirstNum < num)
                .filter(num -> SecondNum < num)
                .collect(Collectors.toList());

        System.out.println(filteredArr);
    }

    //결과 값 모두 출력
    public void ViewAllResult() {
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.print(i + "번째 : " + arrayList.get(i)+"\n");
        }
    }
}
