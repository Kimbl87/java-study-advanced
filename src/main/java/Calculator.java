import java.util.Scanner;

public class Calculator {
    public static void calculator(){
        //Определяем переменные
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число 'A'");
        double a = sc.nextDouble();
        System.out.println("Введите один из знаков: +, -, *, /");
        String operation = sc.next();
        System.out.println("Введите число 'B'");
        double b = sc.nextDouble();
        //Выполняем действие по введенному оператору
        switch (operation) {
            case "+":
                System.out.printf("%.4f + %.4f = %.4f", a, b, Operations.add(a, b));
                break;
            case "-":
                System.out.printf("%.4f - %.4f = %.4f", a, b, Operations.subtract(a, b));
                break;
            case "*":
                System.out.printf("%.4f * %.4f = %.4f", a, b, Operations.multiply(a, b));
                break;
            case "/":
                System.out.printf("%.4f / %.4f = %.4f", a, b, Operations.divide(a, b));
                break;
            default:
                System.err.printf("?????? ???????????? ????????. ?????????: \u001B[1m+ - * /\033[0m; ???????: \u001B[1m%s", operation);
        }

        sc.close();


    }
}
