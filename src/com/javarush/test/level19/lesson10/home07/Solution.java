package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader r = new BufferedReader(new FileReader(args[0]));
        BufferedWriter w = new BufferedWriter(new FileWriter(args[1]));
        String result = "";
        while (r.ready()) {

            String readed = r.readLine();
            String[] temp = readed.split(" ");
            for (int i=0 ; i < temp.length ; i++)
            {
                if (temp[i].length() > 6) result = result + "," + temp[i];
            }

        }
        w.write(result.substring(1));
        r.close();
        w.close();
    }
}
