package BT3.Bai10.BT1;

public class MyStack<E> {
    private int size;
    E[] elements;
    private int topIndex;

    public MyStack(int size) {
        this.size = size;
        elements = (E[]) new Object[size];
    }

    public void add(E e) {
        if (size == elements.length){
            updateArr();
        }
        elements[topIndex] = e;
        topIndex++;
    }

    public void pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Element is null");
        }
        --topIndex;
    }

    public void get() {
        for (int i = 0; i < topIndex; i++) {
            System.out.println(elements[i]);
        }
    }

    public boolean isEmpty() {
        if (topIndex <= 0) {
            return  true;
        }
        return false;
    }

    public int size() {
        return topIndex;
    }

    public void updateArr(){
        E[] newElements = (E[]) new Object[elements.length*2];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }
}
