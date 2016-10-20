package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;


/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static void main (String[] args)
    {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> pair : map.entrySet())
        {
            System.out.println(pair.getKey()+" - "+pair.getValue());
        }
    }

    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map0 = new HashMap<String, Date>();
        map0.put("Stallone1", new Date("JUNE 1 1980"));
        map0.put("Stallone2", new Date("FEBRUARY 1 1980"));
        map0.put("Stallone3", new Date("JANUARY 1 1980"));
        map0.put("Stallone4", new Date("JULY 1 1980"));
        map0.put("Stallone5", new Date("AUGUST 1 1980"));
        map0.put("Stallone6", new Date("JUNE 1 1980"));
        map0.put("Stallone7", new Date("JUNE 1 1980"));
        map0.put("Stallone8", new Date("JUNE 1 1980"));
        map0.put("Stallone9", new Date("JUNE 1 1980"));
        map0.put("Stallone10", new Date("JUNE 1 1980"));

        return map0;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        HashSet<String> set = new HashSet<String>();
        for (Map.Entry<String,Date> pair : map.entrySet()){
            if (pair.getValue().getMonth()<=7 && pair.getValue().getMonth()>=5){
                set.add(pair.getKey());
            }
        }
        for (String s : set){
            map.remove(s);
        }

    }
}
