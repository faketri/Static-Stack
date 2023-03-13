package org.example;

import Models.Queue;
import Models.QueueDynamic;
import Models.Stack;
import Models.StackDynamic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        StackDynamic<Integer> stackDynamic = new StackDynamic<>();

        stackDynamic.push(321);
        stackDynamic.push(222);
        stackDynamic.push(421);

        System.out.println("remove item " + stackDynamic.pop());

        System.out.println(stackDynamic);
    }
}