package com.javarush.test.level22.lesson09.task02;

import java.util.HashMap;
import java.util.Map;

/* Формируем Where
Сформируйте часть запроса WHERE используя StringBuilder.
Если значение null, то параметр не должен попадать в запрос.
Пример:
{"name", "Ivanov", "country", "Ukraine", "city", "Kiev", "age", null}
Результат:
"name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'"
*/
public class Solution {
    public static void main(String[] args){
        Map<String,String> map = new HashMap<>();
        map.put("asds","asdasdasdas");
        map.put("Nums","1234");
        map.put("city","Kiev");
        map.put("xxx", null);
        System.out.println(getCondition(map).toString());

    }

    public static StringBuilder getCondition(Map<String, String> params) {
        if (params == null) return null;
        StringBuilder result = new StringBuilder("");
        for (Map.Entry<String,String> pair : params.entrySet()){
            String space = " and ";
            if (result.toString().equals("")) space = "";
            if (pair.getKey() != null && pair.getValue()!=null) result = result.append(space + pair.getKey()+" = '"+pair.getValue()+"'");
        }

        return result;
    }
}
