public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.multiply.apply(2, 3);
        int d = calc.divide.apply(a, b); // деление на ноль
        calc.println.accept(d);
    }
}
