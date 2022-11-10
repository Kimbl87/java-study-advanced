import java.util.Arrays;
import java.util.Scanner;
/*
�����������
 - � ������ main �������� ���� �����
 - ����� - ��������������
 - ���������� ����
 - ���������� �� 4 ������ ����� �������
 */

/**
 * @author ������ �����
 * @see Operations#add(double, double) ��������
 * @see Operations#subtract(double, double) ���������
 * @see Operations#multiply(double, double) ���������
 * @see Operations#divide(double, double) �������
 */


public class Main {
    public static void main(String[] args) {
        //���������� ����������
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ����� 'A'");
        double a = sc.nextDouble();
        System.out.println("������� ���� �� ������: +, -, *, /");
        String operation = sc.next();
        System.out.println("������� ����� 'B'");
        double b = sc.nextDouble();
        //��������� �������� �� ���������� ���������
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
                System.err.printf("������ ������������ ��������. ���������: \u001B[1m+ -  * /\033[0m; �������: \u001B[1m%s", operation);
        }

        sc.close();


    }
}

