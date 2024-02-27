package LAB7_P;

public class MainZad_1 {
    public static void main(String[] args) {

        CalculatorZad_1 k1 = new CalculatorZad_1(3);
        CalculatorZad_1 k2 = new CalculatorZad_1(3,4,6,7);
        CalculatorZad_1 k3 = new CalculatorZad_1(3, 6, 7, 8, 23, 4, 5);

        System.out.println(k1.operation());
        System.out.println(k2.operation());
        System.out.println(k3.operation());
        }
    }