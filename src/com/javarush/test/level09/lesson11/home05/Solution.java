package com.javarush.test.level09.lesson11.home05;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String s = r.readLine();
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (isVowel(c)) s1 = s1 + c + " ";
            if (isWel(c)) s2 = s2 + c + " ";

        }
        System.out.println(s1);
        System.out.println(s2);

    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};
    public static char[] wels = new char[]{'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', '-'
            , 'ф', 'х', 'ц', 'ч', 'щ', 'ш', 'ь', 'ъ', '.', ',', ':', ';', '"', '?', '!'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
    public static boolean isWel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : wels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
