package org.example;

public class ArrayQueue {
    public int[] array;
    public int front;
    public int rear;

    public ArrayQueue(int capacity) {
        array = new int[capacity];
        front = 0;
        rear = 0;
    }

    public void enqueue (int value) {
        array[rear++] = value;
    }
    public int dequeue () {
        if (front == rear) {
            throw new RuntimeException("queue is empty");
        }
        int value = array[front];
        array[front++] = 0;
        return value;
    }
    public int peek () {
        return array[front];
    }
    public boolean isEmpty () {
        return front == rear;
    }
    public boolean isFull () {
        return front != rear;
    }

}
