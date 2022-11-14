//«адача
//        2. ѕоиск максимального элемента в массиве:
//        - задаем массив слов
//        - размерность массива произвольна, задаетс€ в консоли
//        - после чего в консоли ввод€тс€ слова в количестве равном заданной длине массива
//        - в полученном массиве необходимо найти самое длинное слово
//        - результат вывести на консоль

import java.util.Scanner;

public class ArraysMethods {
    public static void maxLength() {
        Scanner sc = new Scanner(System.in);
        String wordMax = "";//ѕотенциальное самое крупное слов
        System.out.println("¬ведите размер массива:");
        int lengthArray = sc.nextInt();//«адаем длину массива
        String wordArray[] = new String[lengthArray];//ќпредел€ем массив заданной длины
        //Ќаполн€ем массив и высчитываем самое длинное слово
        for (int i = 0; i < lengthArray; i++) {
            System.out.println("¬ведите слово в €чейку массива под номером " + i + ":");
            wordArray[i] = sc.next();//¬водим слово
            //ѕровер€ем длиннее ли новое слово чем прошлое ссамое динное, при необходимости замен€ем
            if (wordArray[i].length() > wordMax.length()) wordMax = wordArray[i];
        }
        System.out.println(wordMax);
    }

    ;
}
