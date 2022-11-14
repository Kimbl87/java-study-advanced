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
 * @see ArraysMethods#maxLength() ����� ������ �������� ����� � �������� � ������ ������ �������
 */


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������� ����� ������� � ����������:\n1 - �����������\n2 - ����� ������������� ����� � �������");
        int k = sc.nextInt();
        switch (k){
            case 1:
                Calculator.calculator();
                break;
            case 2:
                ArraysMethods.maxLength();
                break;
            default:
                System.err.println("������� ������������ ��������");
                break;
        }

    }
}