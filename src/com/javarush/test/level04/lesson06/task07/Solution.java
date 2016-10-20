package com.javarush.test.level04.lesson06.task07;

/* Три числа
Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой.
Вывести на экран порядковый номер числа, отличного от остальных.
Пример для чисел 4 6 6:
1
Пример для чисел 6 6 3:
3
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[3];
        for (int i = 0; i < 3; i++)
        {
            a[i] = Integer.parseInt(r.readLine());
        }
        if (a[0]==a[1]){
            System.out.println("3");
        }
        if (a[0]==a[2]){
            System.out.println("2");
        }
        if (a[2]==a[1]){
            System.out.println("1");
        }

    }
}
