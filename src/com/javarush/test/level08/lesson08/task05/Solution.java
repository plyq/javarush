package com.javarush.test.level08.lesson08.task05;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("a1","a");
        map.put("a2","a");
        map.put("a3","b");
        map.put("a4","c");
        map.put("a5","d");
        map.put("a6","e");
        map.put("a7","d");
        map.put("a8","b");
        map.put("a9","f");
        map.put("a0","a");

        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        Collection<String> names = map.values();
        HashMap<String,Integer> counts = new HashMap<>();
        for (String s : names) {
            int count = 0;
            for (Map.Entry<String, String> pair: map.entrySet()){
                if (pair.getValue().equals(s)) count+=1;
            }
            counts.put(s,count);
        }
        for (Map.Entry<String,Integer> pair: counts.entrySet()){
            if (pair.getValue()>1) removeItemFromMapByValue(map,pair.getKey());
        }


    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
