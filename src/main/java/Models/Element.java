package Models;

public class Element<T> {

    private Element<T> address;
    private T data;

    public Element() {
    }

    public Element(T data) {
        this.data = data;
    }

    public Element(Element<T> address, T data) {
        this.address = address;
        this.data = data;
    }

    public Element<T> getAddress() {
        return address;
    }

    public void setAddress(Element<T> address) {
        this.address = address;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
