package com.bridgelabz;

import java.util.LinkedList;

public class Hash3<A extends Comparable,B extends Comparable> {
    LinkedList<A> linkedList;

    public Hash3() {
        this.linkedList = new LinkedList<>();
    }

    public B get(A data) {
        Node<A,B> Node = this.searchNode(data);
        if(Node == null) {
            return null;
        }
        else {
            return Node.getValue();
        }
    }

    public void add(A data,B value) {
        Node<A,B> Node = (Node<A,B>) this.searchNode(data);
        if(Node == null) {
            Node = new Node(data,value);
            this.insertatBack(Node);
        }
        else {
            Node.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "Hash3 {" + linkedList + '}';
    }
}