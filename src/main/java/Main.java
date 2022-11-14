import java.util.Arrays;
import java.util.Scanner;
/*
Калькулятор
 - В методе main сложение двух чисел
 - Вывод - форматирование
 - Складываем дабл
 - Округление до 4 знаков после запятой
 */

/**
 * @author Иванов Денис
 * @see Operations#add(double, double) Сложение
 * @see Operations#subtract(double, double) Вычитание
 * @see Operations#multiply(double, double) Умножение
 * @see Operations#divide(double, double) Деление
 * @see ArraysMethods#maxLength() Поиск самого длинного слово в вводимом в рамках метода массиве
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Укажите номер задания к исполнению:\n1 - Калькулятор\n2 - Поиск максимального слова в массиве");
        int k = sc.nextInt();
        switch (k){
            case 1:
                Calculator.calculator();
                break;
            case 2:
                ArraysMethods.maxLength();
                break;
            default:
                System.err.println("Введено некорректное значение");
                break;
        }

    }
}