package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r=new BufferedReader(new InputStreamReader(System.in));
        int i=Integer.parseInt(r.readLine());
        if (i>0) {
            i*=2;
        }
        if (i<0) {
            i+=1;
        }
        System.out.println(i);
    }

}