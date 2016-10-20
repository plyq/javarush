package com.javarush.test.level22.lesson13.task01;

import java.util.StringTokenizer;

/* StringTokenizer
Используя StringTokenizer разделить query на части по разделителю delimiter.
Пример,
getTokens("level22.lesson13.task01", ".") == {"level22", "lesson13", "task01"}
*/
public class Solution {
    public static void main(String[] args){
        String[] result = getTokens("level22.lesson13.task01..1", ".");
        for (String s: result){
            System.out.println(s);
        }
    }
    public static String [] getTokens(String query, String delimiter) {
        String words[];
        StringTokenizer tokenizer = new StringTokenizer(query,delimiter);
        words = new String[tokenizer.countTokens()];
        int i = 0;
        while (tokenizer.hasMoreTokens()){
            words[i] = tokenizer.nextToken();
            i += 1;
        }
        return words;
    }
}
