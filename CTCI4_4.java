package com.company;

import java.util.*;
import java.util.Queue;

class Node {
    private Node right;
    private Node left;
    private int value;

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
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }
}

class Tree {
    private Node root;

    private void insertion(Node value, Node currentRoot) {
        if (currentRoot.getValue() <= value.getValue()) {
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

   public ArrayList<LinkedList<Integer>> depth(){
       ArrayList<LinkedList<Integer>> array = new ArrayList<>(10);
       LinkedList<Integer> list = new LinkedList<>();
       array.add(list);

       Queue<Node> queue = new LinkedList();
       queue.add(this.root);
       queue.add(new Node(-1));

       while(!queue.isEmpty()){
           Node temp = queue.poll();
           if (temp.getValue() != -1){
                if(temp.getLeft() != null){
                    queue.add(temp.getLeft());
                }
                if(temp.getRight() != null){
                    queue.add(temp.getRight());
                }
                list.add(temp.getValue());
           }
           else{
               if(!queue.isEmpty()){
                   queue.add(temp);
                   list = new LinkedList<>();
                   array.add(list);
               }
           }
       }
       return array;
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

        System.out.println(tree.depth());
//        System.out.println("The tree is: " + tree);

    }
}

