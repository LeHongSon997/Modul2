package BT3.Bai10.BT1;

import BT3.Bai10.BT1.MyStack;

public class Stack {
    public static void main(String[] args) throws Exception {
        MyStack<Integer> stack = new MyStack<>(5);

        stack.isEmpty();
        stack.add(5);
        stack.add(4);
        stack.add(3);
        stack.add(2);
        stack.add(1);

        System.out.println("1.1 Size of stack after add: " + stack.size());

        stack.pop();
        stack.get();

        System.out.println("1.1 Size of stack after pop: " + stack.size());
    }
}
