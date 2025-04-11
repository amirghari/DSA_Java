package org.example;

public class Tree {

    private Node root;
    private Node current;

    private class Node {
        public int value;
        public Node leftChild;
        public Node rightChild;



        public Node(int value) {

            this.value = value;
        }
    }


    public Tree (int root) {
        this.root = this.current = new Node(root);
    }

    public void insert(int value) {
//        if (find(value)) {
//            throw new RuntimeException("Node already exists");
//        }
        while (true) {
            if (value < current.value) {
                if ( current.leftChild == null) {
                    current.leftChild = new Node(value);
                    break;
                }
                current = current.leftChild;
            }
            else if (value > current.value) {
                if (current.rightChild == null) {
                    current.rightChild = new Node(value);
                    break;
                }
                current = current.rightChild;
            }
        }
    }

    public Boolean find(int value) {
        if (root == null) {
            return false;
        }
        if (root.value == value) {
            return true;
        }
        if (value > root.value && root.rightChild != null) {
            return find(root.rightChild.value);
        }
        if (value < root.value && root.leftChild != null) {
            return find(root.leftChild.value);
        }
        return false;
    }

}
