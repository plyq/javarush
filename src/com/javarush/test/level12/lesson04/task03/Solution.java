package com.javarush.test.level12.lesson04.task03;

/* Пять методов print с разными параметрами
Написать пять методов print с разными параметрами.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static void print(int i){
        System.out.println(i);
    }

    public static void print(Integer i){
        System.out.println(i);
    }

    public static void print(String s){
        System.out.println(s);
    }

    public static void print(boolean b){
        System.out.println(b);
    }

    public static void print(double d){
        System.out.println(d);
    }
}
