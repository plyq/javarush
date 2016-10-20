package com.javarush.test.level12.lesson12.home10;

/**
 * Created by Mashkovsky on 08.08.2016.
 */


// copied from: http://www.slf4j.org/manual.html
public class HelloWorld implements Cat,Dog {

    public static void main(String[] args) {
        HelloWorld helloWorld = new HelloWorld();
        HelloWorld helloWorld1 = new HelloWorld();
        helloWorld.run(helloWorld1);
    }

    @Override
    public void run(Pet pet)
    {
        if (pet instanceof Cat){
            System.out.println("cat");
        }
        if (pet instanceof Dog){
            System.out.println("dog");
        }
        System.out.println(((Cat) pet).ASD);
    }
}

interface Cat extends Pet {
    String ASD = "asdpet";
    void run(Pet pet);
}
interface Dog extends Pet {
    String ASD = "asddog";
    void run(Pet pet);
}
interface Pet {
    String ASD ="";
    void run(Pet pet);
}
