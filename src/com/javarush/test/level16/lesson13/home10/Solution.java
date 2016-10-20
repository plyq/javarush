package com.javarush.test.level16.lesson13.home10;

import java.io.*;
import java.util.ArrayList;

/* Последовательный вывод файлов
1. Разберись, что делает программа.
2. В статическом блоке считай 2 имени файла firstFileName и secondFileName.
3. Внутри класса Solution создай нить public static ReadFileThread, которая реализует
интерфейс ReadFileInterface (Подумай, что больше подходит - Thread или Runnable).
3.1. Метод setFileName должен устанавливать имя файла, из которого будет читаться содержимое.
3.2. Метод getFileContent должен возвращать содержимое файла.
3.3. В методе run считай содержимое файла, закрой поток. Раздели пробелом строки файла.
4. Подумай, в каком месте нужно подождать окончания работы нити, чтобы обеспечить последовательный вывод файлов.
4.1. Для этого добавь вызов соответствующего метода.
Ожидаемый вывод:
[все тело первого файла]
[все тело второго файла]
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        try
        {
            firstFileName = r.readLine();
            secondFileName = r.readLine();
            r.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws InterruptedException {

        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface
    {
        private String fileName;
        private String output = "";

        @Override
        public void setFileName(String fullFileName)
        {
            this.fileName = fullFileName;
        }

        @Override
        public String getFileContent()
        {
            return output;
        }

        @Override
        public void run()
        {
            ArrayList<String> strings = new ArrayList<String>();
            String temp = "";
            try
            {
                BufferedReader r = new BufferedReader(new InputStreamReader(new FileInputStream(this.fileName)));
                while ((temp = r.readLine()) != null) {
                    strings.add(temp);
                }
                for (int i = 0; i < strings.size(); i++)
                {
                    if (i < (strings.size()-1)) output = output + strings.get(i) + " ";
                    else output = output + strings.get(i);
                }
                r.close();
            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());

    }

    public static interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }
}
