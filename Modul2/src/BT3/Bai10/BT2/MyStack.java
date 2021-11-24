package BT3.Bai10.BT2;

public class MyStack<E> {
        int size;
        Node<E> top;

        public MyStack() {
            Node<E> node = new Node(size);
        }

        public void add(E e) {
                Node<E> newNode = new Node<>(e);
                newNode.next = top;
                top = newNode;
                size++;
        }

        public E pop() {
                E element = top.data;
                top = top.next;
                return element;
        }

        public E get() {
                return top.data;
        }

        public boolean isEmpty() {
                if (size == 0) {
                        return true;
                }
                return false;
        }

        public void show() {
                Node<E> temp = top;
                for (int i = 0; i < size; i++) {
                        System.out.println(temp.data);
                        temp = temp.next;
                }
        }
}
