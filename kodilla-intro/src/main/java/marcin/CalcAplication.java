package marcin;

public class CalcAplication {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double area = calculator.circleArea(r:10);
        System.out.println("Area of the Circle with radius 10 equals: " + area);

        double p = Calculator.PI;
        System.out.println("The value of a pi constant is equal to " + p);
        Calculator calculator2 = new calculator();
        System.out.println(calculator2.counter);
    }
}
