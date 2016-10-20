package com.javarush.test.level15.lesson12.home03;

/**
 * Created by Mashkovsky on 08.08.2016.
 */
public class Sun
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
