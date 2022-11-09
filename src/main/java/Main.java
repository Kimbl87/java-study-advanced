import java.util.Arrays;
import java.util.Scanner;

/*
Калькулятор
В методе main сложение двух чисел
Вывод - форматирование
Складываем дабл
Округление до 4 знаков после запятой
 */
public class Main {
    public static void main(String[] args) {
        //Определяем переменные
        Scanner sc = new Scanner(System.in);
        double result;
        System.out.println("Введите число 'A'");
        double a = sc.nextDouble();
        System.out.println("Введите один из знаков: +, -, *, /");
        String operation = sc.next();
        System.out.println("Введите число 'B'");
        double b = sc.nextDouble();
        //Выполняем действие по введенному оператору
        switch (operation) {
            case "+":
                System.out.printf("%.4f + %.4f = %.4f", a, b, add(a, b));
                break;
            case "-":
                System.out.printf("%.4f - %.4f = %.4f", a, b, subtract(a, b));
                break;
            case "*":
                System.out.printf("%.4f * %.4f = %.4f", a, b, multiply(a, b));
                break;
            case "/":
                System.out.printf("%.4f / %.4f = %.4f", a, b, divide(a, b));
                break;
            default:
                System.err.printf("Введен некорректный оператор. Ожидается: \u001B[1m+ -  * /\033[0m; введено: \u001B[1m%s", operation);
        }

        sc.close();


    }

    private static double add(double a, double b) {
        return (a + b);
    }

    private static double subtract(double a, double b) {
        return 0;
    }

    private static double multiply(double a, double b) {
        return 0;
    }

    private static double divide(double a, double b) {
        return 0;
    }

}
