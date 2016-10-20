package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        a=sort(a);
        String div=" ";
        for (int i = 0; i < 3; i++)
        {
            if (i==2) div="\n";
            System.out.print(a[i]+div);
        }

    }
    public static int[] sort(int[] a){
        int i = a.length;
        for (int j = 0; j < i-1; j++)
        {
            for (int k = 0; k < i-j-1; k++)
            {
                if (a[k]<a[k+1]){
                    int x=a[k];
                    a[k]=a[k+1];
                    a[k+1]=x;
                }
            }
        }
        return a;
    }
}
