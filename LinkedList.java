package com.javahead.dsa;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node next;
        public Node(int value) {
            this.value=value;
        }
    }

    public LinkedList(int value){
        Node newNode=new Node(value);
        head=newNode;
        tail=newNode;
        length=1;
    }

    public int head(){
        return head.value;
    }
    public int tail(){
        return tail.value;
    }
}
