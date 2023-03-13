package Models;

public class StackDynamic<T> {
    private Element<T> first;
    private Element<T> temp;

    public StackDynamic(){
        first = null;
    }

    public void push(T value) {

        temp = new Element<T>(value);

        temp.setAddress(first);
        first = temp;

    }

    public T pop(){

        if (isEmpty())
            throw new RuntimeException("ПУСТО БРАТ");

        temp = first;

        first = first.getAddress();

        return temp.getData();
    }

    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public String toString(){

        if (isEmpty())
            return "";

        StringBuilder result = new StringBuilder();
        temp = first;
        do{
            result.append(temp.getData())
                  .append(" ");

        } while ((temp = temp.getAddress()) != null);

        return result.toString();

    }
}
