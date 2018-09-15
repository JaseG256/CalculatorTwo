package sample;

public class Model {

    public double calculate(double number1, double number2, String operator) {
        switch (operator) {
            case "+":
                return number1 + number2;
            case "-":
                return number1 - number2;
            case "*":
                return number1 * number2;
            case "/":
                return (number2 == 0) ? 0 : number1 / number2;
        }
        System.out.println("Unkown Operator - " + operator);
        return 0;
    }
}
