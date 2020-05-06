public class DebugExample {
    public static void main(String[] args) {
        double firstNumber = 11.5;
        int secondNumber = 20;

        System.out.println(firstNumber);
        System.out.println(secondNumber);

        if (firstNumber > secondNumber) {
            subtractAndDisplay(firstNumber, secondNumber);
        } else {
            sumAndDisplay(firstNumber, secondNumber);
        }
    }

    private static void sumAndDisplay(double a, int b) {
        double result = a + b;

        System.out.println(result);
    }

    private static void subtractAndDisplay(double a, int b) {
        double result = a - b;

        System.out.println(result);
    }
}