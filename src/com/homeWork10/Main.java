package com.homeWork10;

public class Main {

    public static void main(String[] args) {
        Human human1 = new Human("Alex", "Kalmus", 21);
        Human human2 = new Human("Alex", "Kalmus", 21);
        Human human3 = new Human("Vasiliy", "Kalmus", 21);
        System.out.println(human1.equals(human3));
        System.out.println(human1.equals(human2));
        System.out.println(human1.toString());
        System.out.println(human3.toString());
    }
}
