package com.javarush.test.level20.lesson10.bonus03;

import java.util.ArrayList;
import java.util.List;

/* Кроссворд
1. Дан двумерный массив, который содержит буквы английского алфавита в нижнем регистре.
2. Метод detectAllWords должен найти все слова из words в массиве crossword.
3. Элемент(startX, startY) должен соответствовать первой букве слова, элемент(endX, endY) - последней.
text - это само слово, располагается между начальным и конечным элементами
4. Все слова есть в массиве.
5. Слова могут быть расположены горизонтально, вертикально и по диагонали как в нормальном, так и в обратном порядке.
6. Метод main не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        for (Word word : detectAllWords(crossword, "home", "same", "shit", "jjeeop", "jhvok")){
            System.out.println(word);
        }
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> result = new ArrayList<Word>();
        for (String word : words){
            search:
            for (int i = 0; i < crossword.length; i++){
                for (int j = 0; j < crossword[0].length; j++)
                {
                    int[] startPos = {i, j};
                    int[] endPos = endPos(word, crossword, startPos);
                    if (endPos != null){
                        Word wordToAdd = new Word(word);
                        wordToAdd.setStartPoint(startPos[1],startPos[0]);
                        wordToAdd.setEndPoint(endPos[1],endPos[0]);
                        result.add(wordToAdd);
                        break search;
                    }
                }
            }
        }
        return result;
    }
    public static int[] endPos(String word, int[][] crossword, int[] startPos){
        int sI = startPos[0];
        int sJ = startPos[1];
        int mI = crossword.length;
        int mJ = crossword[0].length;
        int[] result = new int[2];
        boolean found = false;
        int wL = word.length();
        byte[] letters = word.getBytes();
        for (int i = 0; (i+sI < mI) && (i+sJ < mJ) && (i+sI >=0 ) && (i+sJ >= 0) && (i < wL) && (- i < wL); i++){
            if (letters[i] == crossword[i+sI][i+sJ]){
                if (i+1 == wL){
                    found = true;
                    result[0] = i+sI;
                    result[1] = i+sJ;
                    break;
                }
                continue;
            } else {
                break;
            }
        }
        for (int i = 0; (-i+sI < mI) && (-i+sJ < mJ) && (-i+sI >=0 ) && (-i+sJ >= 0) && (i < wL) && (- i < wL); i++){
            if (letters[i] == crossword[-i+sI][-i+sJ]){
                if (i+1 == wL){
                    found = true;
                    result[0] = -i+sI;
                    result[1] = -i+sJ;
                    break;
                }
                continue;
            } else {
                break;
            }
        }
        for (int i = 0; (i+sI < mI) && (-i+sJ < mJ) && (i+sI >=0 ) && (-i+sJ >= 0) && (i < wL) && (- i < wL); i++){
            if (letters[i] == crossword[i+sI][-i+sJ]){
                if (i+1 == wL){
                    found = true;
                    result[0] = i+sI;
                    result[1] = -i+sJ;
                    break;
                }
                continue;
            } else {
                break;
            }
        }
        for (int i = 0; (-i+sI < mI) && (i+sJ < mJ) && (-i+sI >=0 ) && (i+sJ >= 0) && (i < wL) && (- i < wL); i++){
            if (letters[i] == crossword[-i+sI][i+sJ]){
                if (i+1 == wL){
                    found = true;
                    result[0] = -i+sI;
                    result[1] = i+sJ;
                    break;
                }
                continue;
            } else {
                break;
            }
        }
        for (int i = 0; (sI < mI) && (i+sJ < mJ) && (sI >=0 ) && (i+sJ >= 0) && (i < wL) && (- i < wL); i++){
            if (letters[i] == crossword[sI][i+sJ]){
                if (i+1 == wL){
                    found = true;
                    result[0] = sI;
                    result[1] = i+sJ;
                    break;
                }
                continue;
            } else {
                break;
            }
        }
        for (int i = 0; (i+sI < mI) && (sJ < mJ) && (i+sI >=0 ) && (sJ >= 0) && (i < wL) && (- i < wL); i++){
            if (letters[i] == crossword[i+sI][sJ]){
                if (i+1 == wL){
                    found = true;
                    result[0] = i+sI;
                    result[1] = sJ;
                    break;
                }
                continue;
            } else {
                break;
            }
        }
        for (int i = 0; (sI < mI) && (-i+sJ < mJ) && (sI >=0 ) && (-i+sJ >= 0) && (i < wL) && (- i < wL); i++){
            if (letters[i] == crossword[sI][-i+sJ]){
                if (i+1 == wL){
                    found = true;
                    result[0] = sI;
                    result[1] = -i+sJ;
                    break;
                }
                continue;
            } else {
                break;
            }
        }
        for (int i = 0; (-i+sI < mI) && (sJ < mJ) && (-i+sI >=0 ) && (sJ >= 0) && (i < wL) && (- i < wL); i++){
            if (letters[i] == crossword[-i+sI][sJ]){
                if (i+1 == wL){
                    found = true;
                    result[0] = -i+sI;
                    result[1] = sJ;
                    break;
                }
                continue;
            } else {
                break;
            }
        }

        if (found) {
            return result;
        } else {
            return null;
        }
    }



    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
