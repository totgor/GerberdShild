package com.gerberdshild.javalanguage.packages_and_interfaces.part_13;

public class Node {
    int value;
    Node previous;
    Node next;

    Node(int value) {
        this.value = value;
        previous = null;
        next = null;
    }
}
