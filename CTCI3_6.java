package com.company;

import java.util.Scanner;
import java.util.Stack;

class Sorting {

    private Stack<Integer> stack;

    Sorting() {
        stack = new Stack<>();
        stack.push(Integer.MIN_VALUE);
    }

    public Stack sort(Stack<Integer> input) {
        if(input.isEmpty()){
            return input;
        }
        else{
            while(!input.isEmpty()){
                Integer key = input.pop();
                if(key >= stack.peek()){
                    stack.push(key);
                }
                else{
                    while(key < stack.peek()){
                        Integer value = stack.pop();
                        input.push(value);
                    }
                    stack.push(key);
                }
            }
            while(!stack.isEmpty()){
                input.push(stack.pop());
            }
            input.pop();
            return input;
        }
    }
}

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        int data = s.nextInt();
        Sorting st = new Sorting();
        while(data-- > 0){
            int in = s.nextInt();
            stk.push(in);
        }
        System.out.println("The sorted stack is: " + st.sort(stk));
    }
}

-------------------------------------------------------------------

10
6 7 3 5 2 5 9 1 8 0
