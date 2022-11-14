//Задача
//        2. Поиск максимального элемента в массиве:
//        - задаем массив слов
//        - размерность массива произвольна, задается в консоли
//        - после чего в консоли вводятся слова в количестве равном заданной длине массива
//        - в полученном массиве необходимо найти самое длинное слово
//        - результат вывести на консоль

import java.util.Scanner;

public class ArraysMethods {
    /**
     * @see #maxLength() Поиск самого длинного слово в вводимом в рамках метода массиве
     */
    public static void maxLength() {
        Scanner sc = new Scanner(System.in);
        String wordMax = "";//Потенциальное самое крупное слов
        System.out.println("Введите размер массива:");
        int lengthArray = sc.nextInt();//Задаем длину массива
        String[] wordArray = new String[lengthArray];//Определяем массив заданной длины
        //Наполняем массив и высчитываем самое длинное слово
        for (int i = 0; i < lengthArray; i++) {
            System.out.println("Введите слово в ячейку массива под номером " + i + ":");
            wordArray[i] = sc.next();//Вводим слово
            //Проверяем длиннее ли новое слово чем прошлое ссамое динное, при необходимости заменяем
            if (wordArray[i].length() > wordMax.length()) wordMax = wordArray[i];
        }
        System.out.println(wordMax);
    }

    ;
}
