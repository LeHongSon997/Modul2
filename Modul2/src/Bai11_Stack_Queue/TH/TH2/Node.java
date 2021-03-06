package Bai11_Stack_Queue.TH.TH2;

public class Node {
    public int key;
    private Node next;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }

    public static class MyLinkedListQueue {
        private Node head;
        private Node tail;

        public MyLinkedListQueue() {
            this.head = null;
            this.tail = null;
        }

        public void enQueue(int key) {
            Node temp = new Node(key);
            if (this.tail == null) {
                this.head = this.tail = temp;
                return;
            }
            this.tail.next = temp;
            this.tail = temp;
        }

        public Node deQueue() {
            if (this.head == null)
                return null;
                Node temp = this.head;
                this.head = this.head.next;
            if (this.head == null)
                this.tail = null;
            return temp;
        }
    }
}
