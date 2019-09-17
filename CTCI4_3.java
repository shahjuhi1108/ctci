package com.company;

import java.util.Arrays;
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


    public void minHeight(int arr[], int start, int end){
        if(start <= end){
            int mid = (start+end)/2;
            insert(new Node (arr[mid]));
            minHeight(arr, start, mid-1);
            minHeight(arr, mid+1, end);
        }
    }
}


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        Tree tree = new Tree();
        int ops = s.nextInt();
        int[] array = new int[ops];
        int i = 0;
        while(ops-- > 0){
            int input = s.nextInt();
            array[i] = input;
            i++;
        }

        Arrays.stream(array).forEach(x -> System.out.print(" " + x));
        int start = 0;
        int end = array.length-1;

        tree.minHeight(array, start, end);

        System.out.println("The tree is: " + tree);

    }
}

