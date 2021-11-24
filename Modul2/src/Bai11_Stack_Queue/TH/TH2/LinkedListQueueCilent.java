package Bai11_Stack_Queue.TH.TH2;

public class LinkedListQueueCilent {
    public static void main(String[] args) {
        Node.MyLinkedListQueue queue = new Node.MyLinkedListQueue();
        queue.enQueue(10);
        queue.enQueue(20);
        queue.deQueue();
//        queue.deQueue();
//        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        System.out.println("Dequeued item is " + queue.deQueue().key);
    }
}
