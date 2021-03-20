package com.bridgelabz;

public class Node <A,B extends Comparable> {
    A data;
    B value;
    Node next;

    public Node(A data , B value) {
        this.data=data;
        this.value=value;
        this.next=null;
    }

    public A getData() {
        return data;
    }

    public void setData(A data) {
        this.data = data;
    }

    public B getValue() {
        return value;
    }

    public void setValue(B value) {
        this.value = value;
    }

    public Node<A,B> getNext() {
        return next;
    }

    public static void setNext(Node<A, B> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder MapNodeString = new StringBuilder();
        MapNodeString.append("Map Node{" + "A=").append(data)
                .append("B=").append(value).append('}');
        if (next != null)
            MapNodeString.append("->").append(next);
        return MapNodeString.toString();
    }
}