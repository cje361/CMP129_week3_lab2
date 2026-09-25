public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("4 + 7 = " + calculator.add(4,7));
        System.out.println("2.5 + 3.75 = " + calculator.add(2.5,3.75));
        System.out.println("1 + 2 + 3 = " + calculator.add(1,2,3));
        System.out.println(calculator.add("CMP129", "EH210"));
    }
}
