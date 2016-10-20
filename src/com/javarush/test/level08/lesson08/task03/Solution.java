package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{

    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("Машковский","Артем");
        map.put("Васечкин","Петр");
        map.put("Ильинов","Павел");
        map.put("Сахаров","Кирилл");
        map.put("Екимов","Александр");
        map.put("Худабердин","Руслан");
        map.put("Зарипов","Руслан");
        map.put("Чудинова","Дарина");
        map.put("Червоненко","Даша");
        map.put("Екимова","Даша");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String,String> pair : map.entrySet()){
            if (pair.getValue().equals(name)) count+=1;
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName)
    {
        int count = 0;
        for (Map.Entry<String,String> pair : map.entrySet()){
            if (pair.getKey().equals(lastName)) count+=1;
        }
        return count;

    }
}
