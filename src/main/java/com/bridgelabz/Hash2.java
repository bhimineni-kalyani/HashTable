package com.bridgelabz;

import java.util.LinkedList;

public class Hash2<A extends Comparable,B extends Comparable> {
    LinkedList<A> linkedList;

    public Hash2() {
        this.linkedList = new LinkedList<>();
    }

    public B get(A data) {
        Node<A,B> Node = this.linkedList.searchNode(data);
        if(Node == null) {
            return null;
        }
        else {
            return Node.getValue();
        }
    }

    public void add(A data,B value) {
        Node<A,B> Node = (Node<A,B>) this.linkedList.searchNode(data);
        if(Node == null) {
            Node=new Node(data,value);
            this.linkedList.insertatBack(Node);
        }
        else {
            Node.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "Hash2 {" + linkedList + '}';
    }
}