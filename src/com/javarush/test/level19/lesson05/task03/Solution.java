package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки. Не использовать try-with-resources

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(consoleReader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(consoleReader.readLine()));

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (fileReader.ready()){
            String words = fileReader.readLine().replaceAll("\\p{Punct}+"," ");
            while (words.contains("  ")) words = words.replace("  "," ");
            String[] items = words.split(" ");
            for (String word : items)
            {
                try {
                    int number = Integer.parseInt(word);
                    list.add(number);
                } catch (Exception e) {

                }
            }
        }

        String result = "";
        for (int i : list){
            result = result + " " + i;
        }
        if (result.length() > 0) result = result.substring(1);
        fileWriter.write(result);

        consoleReader.close();
        fileWriter.close();
        fileReader.close();
    }
}
