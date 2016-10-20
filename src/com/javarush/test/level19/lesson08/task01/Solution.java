package com.javarush.test.level19.lesson08.task01;

/* Ридер обертка
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна преобразовывать весь текст в заглавные буквы
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток.
Вывести модифицированную строку в консоль.
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
        String readed = outputStream.toString().toUpperCase();
        System.setOut(consoleWriter);
        System.out.println(readed);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
