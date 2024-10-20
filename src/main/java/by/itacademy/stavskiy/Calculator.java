package by.itacademy.stavskiy;

public class Calculator {

    public int sum(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int divide(int a, int b){
        try {
            if ( b == 0 ){
                System.out.println("Делить на 0 нельзя");
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на 0");
            throw new RuntimeException(e);
        }

        return a / b;
    }

    public int multiply(int a, int b){
        return a * b;
    }
}
