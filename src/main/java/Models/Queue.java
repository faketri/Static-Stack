package Models;

import java.util.Arrays;

public class Queue {

    private Object[] items;
    private final int front = 0;
    private int rear;
    private int length = -1;
    private final int capacity;

    public Queue(int capacity){

        this.capacity = capacity;
        items = new Object[capacity];
    }

    public void append(Object element){

        if( ! isFull() )
            items[rear = ++length] = element;

    }

    public Object remove(){

        Object removingItem = items[front];

        if( ! isEmpty() ) {


            for (int i = 1; i < items.length; i++) {
                items[i - 1] = items[i];
            }
            items[length] = null;
            rear = length - 1;
        }

        return removingItem;
    }

    public Object[] getQueue(){
        return Arrays.copyOf(items, items.length);
    }

    public Object getLast(){
        return items[rear];
    }

    public Object getFirst(){
        return items[front] ;
    }

    public boolean isFull(){
        return length == (capacity - 1);
    }

    public boolean isEmpty(){
        return length == -1;
    }

}
