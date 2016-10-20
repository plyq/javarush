package com.javarush.test.level19.lesson10.home02;

/* Самый богатый
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Вывести в консоль имена, у которых максимальная сумма
Имена разделять пробелом либо выводить с новой строки
Закрыть потоки. Не использовать try-with-resources

Пример входного файла:
Петров 0.501
Иванов 1.35
Петров 0.85

Пример вывода:
Петров
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException
    {
        TreeMap<String,Double> map = new TreeMap<String,Double>();
        BufferedReader r = new BufferedReader(new FileReader(args[0]));
        double maxValue = 0;
        while (r.ready()) {
            String[] temp = r.readLine().split(" ");
            String tempKey = temp[0];
            double tempValue = Double.parseDouble(temp[1]);
            if (map.containsKey(tempKey)){
                map.put(tempKey, map.get(tempKey) + tempValue);
            } else {
                map.put(tempKey, tempValue);
            }
            if (map.get(tempKey) > maxValue) maxValue = map.get(tempKey);
        }
        for (Map.Entry<String,Double> pair : map.entrySet()){
            if (pair.getValue() == maxValue)
            {
                System.out.println(pair.getKey());
            }
        }
        r.close();
    }
}
