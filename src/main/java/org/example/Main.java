package org.example;

import Models.Queue;
import Models.Stack;


public class Main {
    public static void main(String[] args) {

        Stack Stack = new Stack(10);

        Stack.Push("first");
        Stack.Push("Second");

        for (Object item:
             Stack.GetStack()) {
            System.out.println(item);
        }

        System.out.println("Popping the last element from the stack - " + Stack.Pop());


        for (Object item:
                Stack.GetStack()) {
            System.out.println(item);
        }
    }
}