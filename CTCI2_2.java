import java.util.Scanner;

//nth element from the last

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



    public int nthElement(int n){
        if(this.head == null){
        }
        else {
            Node i = this.head;
            Node j = i;
            while (n-- > 1) {
                j = j.getNext();
            }
            while (j.getNext() != null) {
                i = i.getNext();
                j = j.getNext();
            }

            n = i.getValue();
        }
        return n;
    }
}


public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Linkedlist l = new Linkedlist();
        while(n-- > 0) {
            int x = s.nextInt();
            l.insert(new Node(x));
        }
        System.out.println(l);
        System.out.println("----------------------------------------------------------------");
        int z = s.nextInt();
        System.out.println(l.nthElement(z));
        //System.out.println(l);
    }
}
