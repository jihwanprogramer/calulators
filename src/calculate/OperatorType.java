package calculate;

public enum OperatorType {
    ADD("+"),
    SUBTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    private final String symbol;
    private final Calculate calculate = new Calculate();

    OperatorType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public static OperatorType matchOperatorType(char symbol) {
        for (OperatorType operatorType : OperatorType.values()) {
            if (operatorType.getSymbol().charAt(0) == symbol) {
                return operatorType;
            }
        }
        throw new IllegalArgumentException("유효하지 않은 연산자입니다: " + symbol);
    }

    public int operate(int firstNumber, int secondNumber) {
        if(ADD.getSymbol().equals(symbol)) {
            return calculate.Add(firstNumber,secondNumber);
        }
        if(SUBTRACT.getSymbol().equals(symbol)) {
            return calculate.Sub(firstNumber,secondNumber);
        }
        if(MULTIPLY.getSymbol().equals(symbol)) {
            return calculate.Mul(firstNumber,secondNumber);
        }
        if(DIVIDE.getSymbol().equals(symbol)) {
            return calculate.Div(firstNumber,secondNumber);
        }
        throw new IllegalArgumentException("유효하지 않은 연산자입니다: " + symbol);
    }



}
