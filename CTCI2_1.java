import java.util.LinkedList;
import java.util.Scanner;

//Unsorted linked list, remove duplicate.
//#1- Using while loop.

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



    public void removeDup(){
        if(this.head == null){
            return;
        }
        else{
            Node i = this.head;
            while(i.getNext() != null){
                Node j = i;
                while(j.getNext() != null){
                    if(i.getValue() == j.getNext().getValue()){
                        Node del = j.getNext();
                        j.setNext(j.getNext().getNext());
                        del.setNext(null);
                    }
                    else
                        j = j.getNext();
                }
                i = i.getNext();
            }
        }
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
        l.removeDup();
        System.out.println(l);
    }
}
-----------------------------------------------------------------------

import java.util.LinkedList;
import java.util.Scanner;

//#2 Using for loop

class Node{
    private Node next;
    private int value;

    Node(int k){
        this.value = k;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {import java.util.LinkedList;
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



    public void removeDup(){
        if(this.head == null){
            return;
        }
        else{
            for(Node i = this.head; i.getNext() != null; i = i.getNext()){
                for(Node j = i; j.getNext() != null;){
                    if(i.getValue() == j.getNext().getValue()){
                        Node del = j.getNext();
                        j.setNext(j.getNext().getNext());
                        del.setNext(null);
                    }
                    else
                        j = j.getNext();
                }
            }
        }
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
        l.removeDup();
        System.out.println(l);
    }
}

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



    public void removeDup(){
        if(this.head == null){
            return;
        }
        else{
            for(Node i = this.head; i.getNext() != null; i = i.getNext()){
                for(Node j = i; j.getNext() != null;){
                    if(i.getValue() == j.getNext().getValue()){
                        Node del = j.getNext();
                        j.setNext(j.getNext().getNext());
                        del.setNext(null);
                    }
                    else
                        j = j.getNext();
                }
            }
        }
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
        l.removeDup();
        System.out.println(l);
    }
}
