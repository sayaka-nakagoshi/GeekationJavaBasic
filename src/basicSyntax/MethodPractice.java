package basicSyntax;

public class MethodPractice {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        int addResult = add(a, b);
        int subtractResult = subtract(a, b);
        int multiplyResult = multiply(a, b);
        int divideResult = divide(a, b);

        printResult(addResult);
        printResult(subtractResult);
        printResult(multiplyResult);
        printResult(divideResult);
    }

    public static int add(int a, int b) {
        int sum = a + b;

        return sum;
    }

    public static int subtract(int a, int b) {
        int sum = a - b;

        return sum;
    }

    public static int multiply(int a, int b) {
        int sum = a * b;

        return sum;
    }

    public static int divide(int a, int b) {
        int sum = a / b;

        return sum;
    }

    public static void printResult(int result) {
        System.out.println("計算結果は " + result + " です。");

    }
}
