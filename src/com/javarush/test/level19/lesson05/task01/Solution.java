package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
Закрыть потоки ввода-вывода.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(r.readLine());
        FileWriter fileWriter = new FileWriter(r.readLine());
        while (fileReader.ready()){
            int symb = fileReader.read();
            if (fileReader.ready()) {
                symb = fileReader.read();
                fileWriter.write(symb);
            }
        }
        fileReader.close();
        fileWriter.close();
        r.close();
    }
}
