package com.javarush.test.level20.lesson10.bonus02;

/* Алгоритмы-прямоугольники
1. Дан двумерный массив N*N, который содержит несколько прямоугольников.
2. Различные прямоугольники не соприкасаются и не накладываются.
3. Внутри прямоугольник весь заполнен 1.
4. В массиве:
4.1) a[i, j] = 1, если элемент (i, j) принадлежит какому-либо прямоугольнику
4.2) a[i, j] = 0, в противном случае
5. getRectangleCount должен возвращать количество прямоугольников.
6. Метод main не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        byte[][] a = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        int count = getRectangleCount(a);
        System.out.println("count = " + count + ". Должно быть 2");
    }

    public static int getRectangleCount(byte[][] a) {
        int count = 0;
        int rows = a.length;
        int cols = a[0].length;
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols ; j++){
                if (a[i][j]==1){
                    count+=1;
                    a = clearRec(i,j,a);
                }
            }
        }
        return count;
    }

    private static byte[][] clearRec(int i0, int j0, byte[][] a){
        int rows = a.length;
        int cols = a[0].length;
        int i1 = i0;
        int j1 = j0;
        for (int i = i0; i < rows; i++){
            if (a[i][j0] == 1) i1 = i;
            else break;
        }
        for (int j = j0; j < cols; j++){
            if (a[i0][j] == 1) j1 = j;
            else break;
        }
        for (int i = i0; i <= i1; i++){
            for (int j = j0; j <= j1; j++){
                a[i][j] = 0;
            }
        }
        return a;
    }
}
