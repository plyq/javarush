package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Mashkovsky on 08.08.2016.
 */
public class Earth implements Planet
{
    private static Earth ourInstance = new Earth();

    public static Earth getInstance()
    {
        return ourInstance;
    }

    private Earth()
    {
    }
}
