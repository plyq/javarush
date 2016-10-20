package com.javarush.test.level22.lesson13.task02;

import java.io.*;
import java.nio.charset.Charset;

/* Смена кодировки
В метод main первым параметром приходит имя файла, тело которого в кодировке Windows-1251.
В метод main вторым параметром приходит имя файла, в который необходимо записать содержимое первого файла в кодировке UTF-8.
*/
public class Solution {
    static String win1251TestString = "РќР°СЂСѓС€РµРЅРёРµ РєРѕРґРёСЂРѕРІРєРё РєРѕРЅСЃРѕР»Рё?"; //only for your testing

    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream(args[0]);
        OutputStream os = new FileOutputStream(args[1]);
        Charset utf8 = Charset.forName("UTF-8");
        Charset windows1251 = Charset.forName("Windows-1251");

        while (is.available()>0)
        {
            byte[] buffer = new byte[is.available()];
            is.read(buffer);
            String s = new String(buffer);
            buffer = s.getBytes(windows1251);
            os.write(buffer);
        }

        os.close();
        is.close();
    }

}
