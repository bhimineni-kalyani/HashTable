package com.bridgelabz;

public class LinkedList<A extends Comparable> {
    public Node head;
    public Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(Node newNode) {
        if (head == null) {
            head = newNode;
        }
        if (tail == null) {
            tail = newNode;
        }
        else {
            Node temp = this.head;
            this.head = newNode;
            this.head.setNext(temp);
        }
    }

    public void insertatBack(Node Mapnode) {
        if(tail==null) {
            head = Mapnode;
            tail = Mapnode;
        }
        else {
            this.tail.setNext(Mapnode);
            this.tail=Mapnode;
        }
    }

    public void insert(Node node, Node Mapnode) {
        Node temp = node.getNext();
        Node.setNext(Mapnode);
        Mapnode.setNext(temp);
    }

    public void Delete() {
        if(head == null) {
            System.out.println("List empty");
            return;
        }
        else {
            if (head != tail) {
                head = head.next;
            }
            else {
                head = tail = null;
            }
        }
    }

    public void DeleteAtLast() {
        if (head == null) {
            System.out.println("List Empty");
            return;
        }
        else {
            if (head != tail) {
                Node current = head;
                while(current.next != tail) {
                    current = current.next;
                }
                tail = current;
                tail.next = null;
            }
            else {
                head = tail = null;
            }
        }
    }

    public <A> Node searchNode(A data) {
        Node temp = this.head;
        while (temp != null ) {
            if (temp.getData().equals(data)) {
                return  temp;
            }
            temp = temp.getNext();
        }
        return null;
    }

    public <A> void insertAfterNode(Node previous, A data) {
        Node node = searchNode(data);
        if(node != null) {
            insert(node, previous);
        }
        else
            System.out.println("Element not found");
    }

    public <A> void deleteafter(A data) {
        Node temp=head;
        Node previous=null;

        if(temp != head && temp.data==data) {
            head=temp.next;
            return;
        }
        while(temp != null && temp.data != data) {
            previous=temp;
            temp=temp.next;
        }
        if(temp == null) {
            return;
        }
        previous.next=temp.next;
    }

    public void size() {
        Node temp= head;
        int count=0;
        while(temp != null) {
            count++;
            temp.getNext();
        }
        System.out.println(count);
    }

    @Override
    public String toString() {
        return "LinkedListNode{" + head + '}';
    }
}