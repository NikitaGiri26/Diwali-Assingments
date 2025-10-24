package study;

public class Calculator {

	public static int calculate(int number1, int number2, String operator) throws WrongOperatorException {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                if (number2 == 0)
                    throw new ArithmeticException("Division by zero not allowed!");
                return number1 / number2;
            case "%":
                return number1 % number2;
            default:
                throw new WrongOperatorException("Invalid operator: " + operator);
        }
    }
}
