package org.example;

import Models.Queue;
import Models.Stack;


public class Main {
    public static void main(String[] args) {

        Queue queue = new Queue(10);

        queue.append(new String[] {"1", "2", "3"});
        queue.append(4);
        queue.append("sds");
        queue.append(1);
        queue.append("213123sds");
        queue.append(2);
        queue.append("fdsfsdfsds");
        queue.append(3);
        queue.append("432rdsfsdsds");
        queue.append("fdsfsdfsds");
        queue.append(3);
        queue.append("432rdsfsdsds");

        queue.remove();

        for (Object item:
             queue.getQueue()) {
            System.out.println(item);
        }
    }
}