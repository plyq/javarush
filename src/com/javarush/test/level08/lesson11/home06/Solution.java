package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> temp = new ArrayList<Human>();
        ArrayList<Human> temp2 = new ArrayList<Human>();
        ArrayList<Human> temp3 = new ArrayList<Human>();
        Human ch1 = new Human("ch1",true,10);
        Human ch2 = new Human("ch2",true,10);
        Human ch3 = new Human("ch3",false,12);
        temp.add(ch1);
        temp.add(ch2);
        temp.add(ch3);
        Human m = new Human("m",false,40,temp);
        Human f = new Human("f",true,41,temp);
        temp2.add(m);
        Human gmm = new Human("gmm",false,81,temp2);
        Human gfm = new Human("gfm",true,81,temp2);
        temp3.add(f);
        Human gmf = new Human("gmf",false,81,temp3);
        Human gff = new Human("gff",true,81,temp3);
        System.out.println(gff);
        System.out.println(gfm);
        System.out.println(gmf);
        System.out.println(gmm);
        System.out.println(f);
        System.out.println(m);
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }

    public static class Human
    {
        String name = null;
        boolean sex = false;
        int age = 0;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public Human(String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
