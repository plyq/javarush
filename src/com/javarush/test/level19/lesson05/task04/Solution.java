package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(consoleReader.readLine()));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(consoleReader.readLine()));

        while (fileReader.ready()){
            char c = (char) fileReader.read();
            if (c == '.') {
                fileWriter.write('!');
            } else {
                fileWriter.write(c);
            }
        }

        fileReader.close();
        consoleReader.close();
        fileWriter.close();
    }
}
