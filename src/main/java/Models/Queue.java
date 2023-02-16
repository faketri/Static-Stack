package Models;

import java.util.Arrays;

@SuppressWarnings("unchecked")
public class Queue<T>  {

    private final T[] items;
    private int front = -1;
    private int rear = -1;
    private int length = 0;
    private final int capacity;

    public Queue(int capacity){

        this.capacity = capacity;
        this.items = (T[])new Object[capacity];
    }

    public void append(T element){

        if( isFull() )
            throw new RuntimeException("Queue is full");

        items[++rear % capacity] = element;
        ++length;
    }

    public T remove(){

        if(isEmpty())
            throw new RuntimeException("Queue is empty");

        int index = ++front % capacity;

        T removingItem = items[index];
        items[index] = null;
        --length;

        return removingItem;
    }

    public void reverse(){

        for(int i = 0; i < capacity / 2; i++){
            T temp = items[i];
            items[i] = items[capacity - i - 1];
            items[capacity - i - 1] = temp;
        }
    }

    public T getLast(){
        return items[rear];
    }

    public T getFirst(){
        return items[front] ;
    }

    public int getLength(){ return capacity;}

    public boolean isFull(){
        return length == capacity;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
