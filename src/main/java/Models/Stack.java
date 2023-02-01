package Models;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stack {
    private Object[] Items;
    // Pointer to the last element of the array
    private int length = - 1;
    // Max size array
    private final int capacity;

    // Constructor
    public Stack(Stack stack) {

        Items = stack.Items;
        length = stack.length;
        capacity = stack.capacity;
    }

    public Stack(int size) {

        capacity = size;
        Items = new Object[capacity];
    }

    /*
     * Adding an element to the stack
     * Param - Object item
     * return none
     */
    public void Push(Object item) {

        if(!IsFull()) {
            Items[++length] = item;
        }
    }

    /*
     *  Removing an element from the stack
     *  Param - None;
     *  Return - None
     */
    public Object Pop() {

        Object topItem = Items[length];

        if (IsEmpty())
            throw new NullPointerException();
        else Items[length--] = null;

        return topItem;
    }

    /*
     *  Checking the stack for empty
     *  Param - None;
     *  Return - true if stack empty or false if not empty
     */
    public boolean IsEmpty() {
        return length == -1;
    }

    /*
     *   Checking the stack for fullness
     *   Param - None
     *   Return - if there is no empty space in the array then true will be returned
     **/
    public boolean IsFull(){
        return length == (capacity - 1);
    }

    /*
     *   Getting the reversed array
     *   Param - None
     *   Return - reversed array
     */
    public Object[] GetStack() { return Arrays.copyOf(Reverse(), capacity); }

    /*
     *   Reverse stack array
     *   Param - None
     *   Return - None
     */
    public Object[] Reverse() {

        return IntStream.range(0, capacity)
                .mapToObj(i -> Items[capacity - i - 1])
                .toArray();
    }

    /*
    *  Getting the length of an array
    *  Param - None
    *  Return - Length of array
    * */
    public int GetLength() { return new Integer(capacity); }

    /*
     *  Getting the last element of an array
     *  Param - None
     *  Return - Last element of an array
     * */
    public Object Top() { return Items[length]; }

    /*
     *  Getting a new class instance based on the current class
     *  Param - None
     *  Return - new class instance
     * */
    public Stack GetClone(){ return new Stack(this); }

    /*
     *  Clearing the array and changing the position of the pointer
     *  Param - None
     *  Return - None
     * */
    public void Clear() {

        length = -1;
        Items = new Object[capacity];

    }
}
