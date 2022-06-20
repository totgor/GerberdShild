package com.gerberdshild.javalanguage.packagesandinterfaces.part_13;

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
