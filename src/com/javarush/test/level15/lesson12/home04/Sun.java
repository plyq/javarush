package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Mashkovsky on 08.08.2016.
 */
public class Sun implements Planet
{
    private static Sun ourInstance = new Sun();

    public static Sun getInstance()
    {
        return ourInstance;
    }

    private Sun()
    {
    }
}
