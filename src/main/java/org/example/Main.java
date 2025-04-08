package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push("Hello");
        stack.push("World");
        stack.push("World");
        stack.push("World");
        stack.push("Amir");
        stack.push("World");
        stack.push("World");
        stack.push("World");
        stack.push("Ahhhhh");
        stack.push("GOt");
        stack.push("An");
        System.out.println(stack.pop());
        System.out.println(stack.peek());


        System.out.println(stack);
    }
}