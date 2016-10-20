package com.javarush.test.level22.lesson09.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Обращенные слова
В методе main с консоли считать имя файла, который содержит слова, разделенные пробелами.
Найти в тексте все пары слов, которые являются обращением друг друга. Добавить их в result.
Порядок слов first/second не влияет на тестирование.
Использовать StringBuilder.
Пример содержимого файла
рот тор торт о
о тот тот тот
Вывод:
рот тор
о о
тот тот
*/
public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) throws IOException
    {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(r.readLine())));
        List<String> allWords = new ArrayList<String>();
        List<String> allWordsCopy = new ArrayList<String>();
        String temp;
        while ((temp=fr.readLine())!=null){
            String words[] = temp.split(" ");
            for (String word: words){
                allWords.add(word);
                allWordsCopy.add(word);

            }
        }
        for (String word: allWords){
            StringBuilder wordSB = new StringBuilder(word);
            for (String wordToCompare: allWordsCopy){
                if (wordSB.reverse().toString().equals(wordToCompare) && !word.equals(wordToCompare)){
                    Pair pair = new Pair();
                    pair.first = word;
                    pair.second = wordToCompare;
                    boolean exist = false;
                    for (Pair pairL :result){
                        if (pairL.first.equals(pair.second) || pairL.first.equals(pair.first) || pairL.second.equals(pair.second) || pairL.second.equals(pair.first)) exist = true;
                    }
                    if (!exist) result.add(pair);
                }
            }
        }
        for (Pair pair: result){
            System.out.println(pair);
        }
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public String toString() {
            return  first == null && second == null ? "" :
                    first == null && second != null ? second :
                    second == null && first != null ? first :
                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
