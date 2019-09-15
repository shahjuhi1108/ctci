import java.util.Arrays;
import java.util.Scanner;

class Stack{
        private int stacksize = 5;
        private int[] buffer = new int[stacksize * 3];
        private int[] stackpointer = {0,0,0};

        private class StackDetails{
            public int stackStart;
            public int stackEnd;

            StackDetails(int stackStart, int stackEnd){
                this.stackStart = stackStart;
                this.stackEnd = stackEnd;
            }

        }

        private StackDetails getStackDetails(int stackNum){
            return new StackDetails(stackNum * stacksize, stacksize);
        }


        public void push(int stackNum, int value){
            int index = getStackDetails(stackNum).stackStart + stackpointer[stackNum];
            stackpointer[stackNum]++;
            buffer[index] = value;
        }

        public int pop(int stackNum){
            int index = getStackDetails(stackNum).stackStart + stackpointer[stackNum] - 1;
            stackpointer[stackNum]--;
            int value = buffer[index];
            buffer[index] = 0;
            return value;
        }

        public int peek(int stackNum){
            int index = getStackDetails(stackNum).stackStart + stackpointer[stackNum] - 1;
            return buffer[index];
        }

    @Override
    public String toString() {
        return "Stack{" +
                "buffer=" + Arrays.toString(buffer) +
                '}';
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Stack stack = new Stack();

        //System.out.println("Enter the number of operations: ");
        int ops = s.nextInt();

        while(ops-- > 0){
            //System.out.println("Enter the stack number: ");
            int stacknum = s.nextInt();
            //System.out.println("Enter the value: ");
            int value = s.nextInt();

            if(value != -1){
                stack.push(stacknum, value);
            }

            else
                stack.pop(stacknum);

            System.out.println("The stack status is: " + stack);
        }
    }
}

// -------------------------------------------------------------------------
//
//
// 10
// 0 3
// 1 4
// 2 5
// 1 6
// 2 7
// 0 8
// 2 -1
// 0 -1
// 1 -1
// 1 -1
