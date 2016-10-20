package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r= new BufferedReader(new InputStreamReader(System.in));
        int cnt=0;
        for (int i = 0; i < 3; i++)
        {
            int n=Integer.parseInt(r.readLine());
            if (n>0) cnt+=1;
        }
        System.out.println(cnt);
    }
}
