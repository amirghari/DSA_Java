package org.example;

public class LinkedList {

    private Node head;
    private Node tail;
    private Node formerTail;



    public void addFirst(int value) {
        head = new Node(value);
    }
    public void addLast(int value) {
        if (tail == null) {
            tail = new Node(value);
            head.setNext(tail);
        }
        else {
            formerTail = tail;
            tail = new Node(value);
            formerTail.setNext(tail);
        }
    }
}
