package org.example;

import java.util.EmptyStackException;

public class StackQueue {
    private Stack stack;
    private Stack stack2;


    public StackQueue() {
        stack = new Stack();
        stack2 = new Stack();

    }
    public void enqueue(int value) {
        stack.push(value);
    }
    public int dequeue() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        for (int i = stack.size() - 1; i >= 0; i--) {
            stack2.push(stack.pop());
        }
        var value = stack2.pop();
        for (int i = stack2.size() - 1; i >= 0; i--) {
            stack.push(stack2.pop());
        }
        return (int) value;
    }
    public int peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        for (int i = stack.size() - 1; i >= 0; i--) {
            stack2.push(stack.pop());
        }
        var value = stack2.peek();
        for (int i = stack2.size() - 1; i >= 0; i--) {
            stack.push(stack2.pop());
        }
        return (int) value;
    }
}
