package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> str = new ArrayList<String>();
        for (int i = 0; i < 5; i++)
        {
            str.add(r.readLine());
        }
        int max=0;
        for (int i = 0; i < str.size(); i++)
        {
            if (str.get(i).length()>max) max = str.get(i).length();
        }
        for (int i = 0; i < 5; i++)
        {
            if (str.get(i).length()==max) System.out.println(str.get(i));;
        }
    }
}
