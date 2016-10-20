package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит строки со слов, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки. Не использовать try-with-resources
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
            for (String s : temp)
            {
                if (    s.contains("0") ||
                        s.contains("1") ||
                        s.contains("2") ||
                        s.contains("3") ||
                        s.contains("4") ||
                        s.contains("5") ||
                        s.contains("6") ||
                        s.contains("7") ||
                        s.contains("8") ||
                        s.contains("9")
                        ) {
                    result = result + " " + s;
                }
            }
        }
        w.write(result);
        r.close();
        w.close();
    }
}
