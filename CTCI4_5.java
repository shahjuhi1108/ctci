package com.company;

import java.util.*;
import java.util.Queue;

class Node {
    private Node right;
    private Node left;
    private int value;
    private Node parent;

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    Node(int value) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return value == node.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
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
    //ArrayList<Node> array = new ArrayList<>();

    private void insertion(Node value, Node currentRoot) {
        if (currentRoot.getValue() <= value.getValue()) {
            if (currentRoot.getRight() == null) {
                currentRoot.setRight(value);
                value.setParent(currentRoot);
            } else {
                insertion(value, currentRoot.getRight());
            }
        } else {
            if (currentRoot.getLeft() == null) {
                currentRoot.setLeft(value);
                value.setParent(currentRoot);
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



   public Node inorder(Node value){

        if(this.root == null){
            return this.root;
        }

        else{
            Node croot = this.root;
            croot = treeBinarySearch(croot, value.getValue());
            if(croot.getRight() == null && croot.getLeft() == null){
                while(croot.getValue() > croot.getParent().getValue()){
                    croot = croot.getParent();
                }
                return croot.getParent();
            }
            if(croot.getRight() != null){
                return minTree(croot.getRight());
            }
            else
                return null;
        }
   }

    private Node treeBinarySearch(Node currentRoot, int value1) {
        while (currentRoot != null && currentRoot.getValue() != value1) {
            if (value1 < currentRoot.getValue()) {
                currentRoot = currentRoot.getLeft();
            } else if (value1 > currentRoot.getValue()) {
                currentRoot = currentRoot.getRight();
            }
        }
        return currentRoot;
    }



    private Node minTree(Node currentRoot){
        while(currentRoot.getLeft() != null){
            currentRoot = currentRoot.getLeft();
        }
        return currentRoot;
    }
}


public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        Tree tree = new Tree();
        int ops = s.nextInt();
        while (ops-- > 0) {
            int input = s.nextInt();
            tree.insert(new Node(input));
        }

        int findN = s.nextInt();
        System.out.println(tree.inorder(new Node(findN)));

    }
}

