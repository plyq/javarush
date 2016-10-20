package com.javarush.test.level04.lesson16.home04;

import java.io.*;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        String[] s=new String[4];
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 4; i++)
        {
            s[i]=r.readLine();
        }
        System.out.println("Меня зовут "+s[0]+"\nЯ родился "+s[3]+"."+s[2]+"."+s[1]);
    }
}
