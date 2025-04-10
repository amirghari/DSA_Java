package org.example;

import java.util.LinkedList;

public class HashTable {
    private static class Node {
        int key;
        String value;

        public Node(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node>[] table;

    @SuppressWarnings("unchecked")
    public HashTable(int size) {
        table = new LinkedList[size];
    }

    private int hash(int key) {
        return Math.abs(Integer.hashCode(key)) % table.length;
    }

    public void put(int key, String value) {
        int index = hash(key);

        if (table[index] == null)
            table[index] = new LinkedList<>();

        // Check if the key already exists, and update the value if so
        for (Node node : table[index]) {
            if (node.key == key) {
                node.value = value;
                return;
            }
        }

        table[index].add(new Node(key, value));
    }

    public String get(int key) {
        int index = hash(key);
        if (table[index] != null) {
            for (Node node : table[index]) {
                if (node.key == key)
                    return node.value;
            }
        }
        return null; // Key not found
    }

    public void remove(int key) {
        int index = hash(key);
        if (table[index] != null) {
            table[index].removeIf(node -> node.key == key);
        }
    }

    public void print() {
        for (int i = 0; i < table.length; i++) {
            System.out.print("Bucket " + i + ": ");
            if (table[i] != null) {
                for (Node node : table[i]) {
                    System.out.print("[" + node.key + " => " + node.value + "] ");
                }
            }
            System.out.println();
        }
    }
}