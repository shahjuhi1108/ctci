import java.util.Arrays;
import java.util.Scanner;

class Stack{
        private int[] arr;
        private int top = -1;
        private int size = 0;
        private int cap;
        private String name;

    Stack(int cap, String name){
        this.cap = cap;
        this.arr = new int[cap];
        this.name = name;
    }


    @Override
    public String toString() {
        return "Stack{" +
                "arr=" + Arrays.toString(arr) +
                " name=" + name +
                '}';
    }

    public void push(int value){
        if(top == arr.length - 1){
            System.out.println("Stack is full");
        }

        else{
            arr[++top] = value;
            size++;
        }
    }

    public int pop(){
        if(size == 0){
            System.out.println("Stack is empty.");
            return size;
        }

        else{
            int remove = arr[top];
            arr[top] = 0;
            top--;
            size--;
            return remove;
        }
    }

    public int peek(){
        if(size == 0){
            System.out.printf("Stack is empty.");
            return size;
        }

        else{
            int value = arr[top];
            return value;
        }
    }

    public boolean isEmpty(){
        return (size == 0);
    }
}


class MinStack extends Stack{
        Stack s2;
        public MinStack(int capacity){
            super(capacity,"this");
            s2 = new Stack(capacity, "s2");
        }

        public void push(int value){
            if(value <= min()){
                s2.push(value);
            }
            super.push(value);
        }

        public int pop(){
            int value = super.pop();
            if (value == min()) {
                s2.pop();
            }
            return value;
        }

        public int min(){
            if(s2.isEmpty()){
                return 1000;
            }
            else
                return s2.peek();
        }

    @Override
    public String toString() {
        return "MinStack{" +
                "s2=" + s2 +
                " this=" + super.toString() +
                '}';
    }
}


public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int capacity = s.nextInt();
        MinStack stack = new MinStack(capacity);
        int ops = s.nextInt();
        while(ops-- > 0){
            int value = s.nextInt();
            if(value != -1){
                stack.push(value);
            }

            else
                stack.pop();

            System.out.println("The stack status is: " + stack);
        }
    }
}


-------------------------------------------------------------------

// 5
//
// 6
//
// 1
// 4
// 5
// -1
// -1
// 3
