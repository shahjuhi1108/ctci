package com.company;

import java.util.Scanner;

class Node {

    private Node left;
    private Node right;
    private int value;

    Node(int k){
        this.value = k;
    }
    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}

class Tree {
    private Node root;

    private void insertion(Node value, Node currentRoot) {
        if (currentRoot.getValue() < value.getValue()) {
            if (currentRoot.getRight() == null) {
                currentRoot.setRight(value);
            } else {
                insertion(value, currentRoot.getRight());
            }
        } else {
            if (currentRoot.getLeft() == null) {
                currentRoot.setLeft(value);
            } else {
                insertion(value, currentRoot.getLeft());
            }
        }
    }


    public void insert(Node value) {
        if (this.root == null) {
            this.root = value;
        } else {
            insertion(value, this.root);
        }
    }

    public Node commonAncestor(Node a, Node b){
        return ancestor(this.root, a, b);
    }

    private Node ancestor(Node croot, Node a, Node b){
        if(covers(croot.getLeft(), a) && covers(croot.getLeft(), b)){
            return ancestor(croot.getLeft(), a, b);
        }

        if(covers(croot.getRight(), a) && covers(croot.getRight(), b)){
            return ancestor(croot.getRight(), a, b);
        }
        return croot;
    }

    private boolean covers(Node croot, Node p){
        if(croot == null){
            return false;
        }

        if(croot.getValue() == p.getValue()){
            return true;
        }

        return covers(croot.getLeft(), p) || covers(croot.getRight(), p);
    }
}



public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Tree t = new Tree();
        int n = s.nextInt();
        while (n-- > 0) {
            int x = s.nextInt();
            t.insert(new Node(x));
        }
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println(t.commonAncestor(new Node(a), new Node(b)));
    }
}


