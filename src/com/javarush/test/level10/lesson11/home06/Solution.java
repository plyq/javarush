package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String lastName = null;
        String firstName = null;
        int age = 0;
        int weight = 0;
        int height = 0;
        String job = null;

        public Human(){
        }

        public Human(String lastName){
            this.lastName = lastName;
        }

        public Human(String lastName, String firstName){
            this.lastName = lastName;
            this.firstName = firstName;
        }

        public Human(String lastName, String firstName, int age){
            this.lastName = lastName;
            this.firstName = firstName;
            this.age = age;
        }

        public Human(String lastName, String firstName, int age, int weight){
            this.lastName = lastName;
            this.firstName = firstName;
            this.age = age;
            this.weight = weight;
        }

        public Human(String lastName, String firstName, int age, int weight, int height){
            this.lastName = lastName;
            this.firstName = firstName;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }

        public Human(String lastName, String firstName, int age, int weight, int height, String job){
            this.lastName = lastName;
            this.firstName = firstName;
            this.age = age;
            this.weight = weight;
            this.height = height;
            this.job = job;
        }

        public Human(String lastName, String firstName, String job){
            this.lastName = lastName;
            this.firstName = firstName;
            this.job = job;
        }

        public Human(String lastName, int height){
            this.lastName = lastName;
            this.height = height;
        }

        public Human(String firstName, int height, int weight){
            this.firstName = firstName;
            this.height = height;
            this.weight = weight;
        }
    }
}
