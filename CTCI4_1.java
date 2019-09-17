package com.company;

import java.util.Scanner;

class Node{
    private Node right;
    private Node left;
    private int value;

    Node(int value){
        this.value = value;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
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

class Tree{
    private Node root;
    private int min;
    private int max;

    Tree(){
        this.min = Integer.MAX_VALUE;
        this.max = Integer.MIN_VALUE;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "min=" + min +
                ", max=" + max +
                '}';
    }

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


    public void isBalanced(){
        int height = 0;
        if(this.root == null){
            System.out.println("Tree is null.");
        }
        else{
            find(root, height);
        }

        if((max - min) > 1)
            System.out.println("Tree is not balanced.");
        else
            System.out.println("Tree is balanced.");
    }


    private void find(Node croot, int height){
        if(croot.getRight() != null){
            find(croot.getRight(), height+1);
        }

        if(croot.getLeft() != null){
            find(croot.getLeft(), height+1);
        }

        if(croot.getLeft() == null && croot.getRight() == null){
            if(height <= min){
                min = height;
            }
            if(height >= max){
                max = height;
            }
        }

    }
}


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        Tree tree = new Tree();
        int ops = s.nextInt();
        while(ops-- > 0){
            int input = s.nextInt();
            tree.insert(new Node(input));
        }

        tree.isBalanced();

        System.out.println("The tree is: " + tree);

    }
}
------------------------------------------------------

14
6 7 3 5 2 5 9 1 8 0 10 11 12 13
