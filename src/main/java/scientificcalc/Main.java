package scientificcalc;

public class Main {
    public static void main(String[] args) {
        Calculator scientificCalculator = new Calculator(0);
        System.out.println(scientificCalculator.factorial(5));
        System.out.println(scientificCalculator.clearDisplay());
    }
}
