import java.util.Arrays;
import java.util.Scanner;

/*
�����������
� ������ main �������� ���� �����
����� - ��������������
���������� ����
���������� �� 4 ������ ����� �������
 */
public class Main {
    public static void main(String[] args) {
        //���������� ����������
        Scanner sc = new Scanner(System.in);
        double result;
        System.out.println("������� ����� 'A'");
        double a = sc.nextDouble();
        System.out.println("������� ���� �� ������: +, -, *, /");
        String operation = sc.next();
        System.out.println("������� ����� 'B'");
        double b = sc.nextDouble();
        //��������� �������� �� ���������� ���������
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
                System.err.printf("������ ������������ ��������. ���������: \u001B[1m+ -  * /\033[0m; �������: \u001B[1m%s", operation);
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
