package org.example;

public class Node {
    private int value;
    private Node next;

    public Node(int value, String s){
        this.value = value;
    }
    public void setNext(Node next){
        this.next = next;
    }
}
