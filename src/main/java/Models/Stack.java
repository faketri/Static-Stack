package Models;


import java.util.Arrays;
import java.util.stream.IntStream;

public class Stack {
    private Object[] Items;
    private int length = - 1;
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
     *   Check
     *
     **/
    public boolean IsFull(){
        return length == (capacity - 1);
    }

    /*
     *   Getting the reversed array
     *   Param - None
     *   Return - reversed array
     */
    public Object[] GetStack() {
        return Arrays.copyOf(Reverse(), Items.length);
    }

    /*
     *   Reverse stack array
     *   Param - None
     *   Return - None
     */
    public Object[] Reverse() {
        return IntStream.range(0,Items.length)
                .mapToObj(i -> Items[Items.length-i-1])
                .toArray();
    }

    public int GetSize() {
        return new Integer(Items.length);
    }

    public Object Top() {
        return Items[length];
    }

    public Stack GetClone(){
        return new Stack(this);
    }

    public void Clear() {
        length = -1;

        Items = new Object[capacity];

    }
}
