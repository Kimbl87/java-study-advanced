//������
//        2. ����� ������������� �������� � �������:
//        - ������ ������ ����
//        - ����������� ������� �����������, �������� � �������
//        - ����� ���� � ������� �������� ����� � ���������� ������ �������� ����� �������
//        - � ���������� ������� ���������� ����� ����� ������� �����
//        - ��������� ������� �� �������

import java.util.Scanner;

public class ArraysMethods {
    /**
     * @see #maxLength() ����� ������ �������� ����� � �������� � ������ ������ �������
     */
    public static void maxLength() {
        Scanner sc = new Scanner(System.in);
        String wordMax = "";//������������� ����� ������� ����
        System.out.println("������� ������ �������:");
        int lengthArray = sc.nextInt();//������ ����� �������
        String[] wordArray = new String[lengthArray];//���������� ������ �������� �����
        //��������� ������ � ����������� ����� ������� �����
        for (int i = 0; i < lengthArray; i++) {
            System.out.println("������� ����� � ������ ������� ��� ������� " + i + ":");
            wordArray[i] = sc.next();//������ �����
            //��������� ������� �� ����� ����� ��� ������� ������ ������, ��� ������������� ��������
            if (wordArray[i].length() > wordMax.length()) wordMax = wordArray[i];
        }
        System.out.println(wordMax);
    }

    ;
}
