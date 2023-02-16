package org.example;

import Models.Queue;
import Models.Stack;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Queue<Integer> queue = new Queue<>(10);

        final int length = queue.getLength();

        for(int i = 0; i < length; i++)
            queue.append(i >>> (int)Math.pow(i,3) ^ i);

        System.out.println(queue);

        System.out.println("Input number");

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt(); scanner.close();

        Queue<Integer> queue1 = new Queue<>(length);

        while (!queue.isEmpty() && !queue1.isFull()){

            int temp = queue.remove();
            queue1.append(temp);

            if( temp == num ) {queue1.append(0);;}
        }

        System.out.println(queue1);

        //

        Queue<Integer> numbers = new Queue<>(10);

        while (!queue1.isEmpty() && !numbers.isFull()){

            int temp = queue1.remove();
            if (temp % 2 == 0) numbers.append(temp);
        }
        System.out.println(numbers);
    }
}