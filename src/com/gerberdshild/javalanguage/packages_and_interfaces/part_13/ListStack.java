package com.gerberdshild.javalanguage.packages_and_interfaces.part_13;

public class ListStack implements IntStack {
    Node first;
    Node last;

    ListStack() {
        first = null;
        last = null;
    }

    @Override
    public void push(int value) {
        if (first == null) {
            first = new Node(value);
            last = first;
        }
        else {
            Node temp = new Node(value);
            last.next = temp;
            temp.previous = last;
            last = temp;
        }
    }

    @Override
    public int pop() {
        if (first == null) {
            System.out.println("Стек пуст.");
            return 0;
        }
        int result = last.value;
        last = last.previous;
        last.next.previous = null;
        last.next = null;
        return result;
    }
}
