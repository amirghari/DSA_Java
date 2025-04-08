package org.example;


import java.lang.reflect.Array;
import java.util.Objects;

public class Stack {
    Objects[] stack;
    int size = 10;

    public Stack() {
        Objects[] stack = new Objects[size];
    }
    public int size() {
        return stack.length;
    }
    public void push(Object item) {
        if (size == stack.length) {
            handleSize();
            stack[size] = (Objects) item;
            size = size * 2;
        }
        stack[size()] = (Objects) item;
    }
    public Object pop() {
        Objects[] secondStack = new Objects[size() - 1];
        for (int i = 0; i < size() - 1; i++) {
            secondStack[i] = stack[i];
        }
        Objects top = stack[size() - 1];
        stack = secondStack;
        return top;
    }

    public Object peek() {
        return stack[size()-1];
    }
    public boolean isEmpty() {
        return size() == 0;
    }

    public void handleSize() {
        Objects[] secondStack = new Objects[size()*2];
        for (int i = 0; i < size(); i++) {
            secondStack[i] = stack[i];
        }
        stack = secondStack;
    }
}
