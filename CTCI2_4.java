import java.util.Scanner;

class Node{
    private Node next;
    private int value;

    Node(int k){
        this.value = k;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
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

class Linkedlist{

    private Node head;

    @Override
    public String toString(){
        Node temp = this.head;
        StringBuilder sb = new StringBuilder();
        while(temp != null){
            sb.append(temp);
            sb.append(",");
            temp = temp.getNext();
        }
        return sb.toString();
    }




    public void insert(Node value){

        Node temp = this.head;

        if(this.head == null){
            this.head = value;
            return;
        }

        while(temp.getNext() != null){
            temp = temp.getNext();
        }

        temp.setNext(value);
    }



    public void sum(Linkedlist list2){
        Node temp1 = this.head;
        Node temp2 = list2.head;
        Linkedlist result = new Linkedlist();
        int addition = 0;
        int carry = 0;
        while(temp1 != null || temp2 != null){
            int v1 = (temp1 != null)  ? temp1.getValue() : 0;
            int v2 = (temp2 != null) ? temp2.getValue() : 0;
            addition = v1 + v2 + carry;
            carry = addition/10;
            addition = addition % 10;
            Node set = new Node(addition);
            result.insert(set);
            temp1 = (temp1 != null) ? temp1.getNext() : null;
            temp2 = (temp2 != null) ? temp2.getNext() : null;
        }
        System.out.println(result);
    }
}


public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int in = n;
        Linkedlist l1 = new Linkedlist();
        int[] A = new int[n];
        int i = 0;
        while(n-- > 0) {
            int x = s.nextInt();
            A[i] = x;
            i++;
        }
        for(int j = 0; j < in/2; j++){
            int k = in-1-j;
            int temp = A[j];
            A[j] = A[k];
            A[k] = temp;
        }
        for(int m = 0; m < A.length; m++){
            int q = A[m];
            l1.insert(new Node(q));
        }
        System.out.println(l1);
        System.out.println("----------------------------------------------------------------");

        Linkedlist l2 = new Linkedlist();
        int n1 = s.nextInt();
        int in1 = n1;
        int[] A1 = new int[n1];
        int i1 = 0;
        while(n1-- > 0) {
            int x1 = s.nextInt();
            A1[i1] = x1;
            i1++;
        }
        for(int j = 0; j < in1/2; j++){
            int k = in1-1-j;
            int temp = A1[j];
            A1[j] = A1[k];
            A1[k] = temp;
        }
        for(int m = 0; m < A1.length; m++){
            int q = A1[m];
            l2.insert(new Node(q));
        }
        System.out.println(l2);
        System.out.println("----------------------------------------------------------------");
        l1.sum(l2);
        //System.out.println();
    }
}
