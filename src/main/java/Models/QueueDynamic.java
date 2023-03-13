package Models;

public class QueueDynamic<T> {

    private final Element<T> first;
    private Element<T> last;
    private Element<T> temp;

    public QueueDynamic() {
        first = new Element<T>();
        last = first;
    }

    public void append(T value){
        last.setAddress( new Element<T>(value) );
        last = last.getAddress();
    }

    public T remove(){

        if (IsEmpty())
            throw new RuntimeException("БРАТ ТУТ ПУСТО");

        temp = first.getAddress();
        first.setAddress(
                ( first.getAddress() ).getAddress()
        );

        return temp.getData();
    }

    public boolean IsEmpty() {
        return first.getAddress() == null;
    }

    @Override
    public String toString(){

        if (IsEmpty())
            return "Queue is empty";

        StringBuilder result = new StringBuilder();
        temp = first.getAddress();

        do{
            result.append(temp.getData())
                  .append(" ");
        } while ((temp = temp.getAddress()) != null);

        return result.toString();
    }
}
