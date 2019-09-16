package com.company;

import java.util.Scanner;
import java.util.Stack;

class MyQueue {

    private Stack<Integer> estack;
    private Stack<Integer> dstack;

    MyQueue() {
        estack = new Stack<>();
        dstack = new Stack<>();
    }

    public void enqueue(int value) {

        if (dstack.isEmpty()) {
            estack.push(value);
        }

        else {
            while (!dstack.isEmpty()) {
                estack.push(dstack.pop());
            }
            estack.push(value);
        }
    }

    public Integer dequeue() {

        if (dstack.isEmpty() && estack.isEmpty()) {
            return null;
        }

        if (dstack.isEmpty()) {
            while (!estack.isEmpty()) {
                dstack.push(estack.pop());
            }
            return dstack.pop();
        }

        else {
            return dstack.pop();
        }
    }


    @Override
    public String toString() {
        return "MyQueue{" +
                "estack=" + estack +
                ", dstack=" + dstack +
                '}';
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        //int input = s.nextInt();
        MyQueue queue = new MyQueue();
        System.out.println(queue.dequeue());
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println("Queue is: " + queue);
        queue.dequeue();
        System.out.println("Queue is: " + queue);
        queue.enqueue(5);
        System.out.println("Queue is: " + queue);
    }
}

