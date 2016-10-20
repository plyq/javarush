package com.javarush.test.level19.lesson08.task03;

/* Выводим только цифры
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить только цифры
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток
Вывести модифицированную строку в консоль.

Пример вывода:
12345678
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleWriter = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        testString.printSomething();
        String readed = outputStream.toString();
        String words[] = readed.split(" ");
        String result = "";
        result = result + words[0] + " " + words[1] + " " + words[2] + " " + words[3] + " ";

        if (words[1].equals("+")) {
            result += (Integer.parseInt(words[0]) + Integer.parseInt(words[2]));
        }
        if (words[1].equals("-")) {
            result += (Integer.parseInt(words[0]) - Integer.parseInt(words[2]));
        }
        if (words[1].equals("*")) {
            result += (Integer.parseInt(words[0]) * Integer.parseInt(words[2]));
        }
        System.setOut(consoleWriter);
        System.out.println(result);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
}
