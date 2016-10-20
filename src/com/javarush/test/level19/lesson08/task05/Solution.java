package com.javarush.test.level19.lesson08.task05;

/* Дублируем текст
Считайте с консоли имя файла
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна дублировать вывод всего текста в файл, имя которого вы считали
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Закройте поток файла

Пример вывода на экран:
it's a text for testing

Пример тела файла:
it's a text for testing
*/

import java.io.IOException;


public class Solution extends A {
    static class X{
        static String x=Y.y;
    }
    static class Y{
        static String y=X.x;
    }
    int i = getInt();
    int k=20;
    public int getInt(){return k+1;}

    static int b = Solution.a;
    static  final int a=3;
    public static void main(int[] args) throws IOException, InterruptedException
    {
        System.out.println("1");
    }
    public static void main(String args) throws IOException, InterruptedException
    {
        System.out.println("1");
    }
    public static void main(String... args) throws IOException, InterruptedException
    {
        int a=7;
        int b=4;
        int x[]={1,2,3};
        System.out.println(x.length);
        System.out.println(a%-b);
        System.out.println((-a%b)==(a%-b));
    }

}
class A {
    public B b;
    public String getv(){
        return b.getv();
    }
}


class B{
    public String v;
    public String getv(){
        v = "her";
        return v;
    }
}
