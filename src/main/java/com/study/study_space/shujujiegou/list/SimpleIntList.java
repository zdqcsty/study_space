package com.study.study_space.shujujiegou.list;

//单向链表的实现
public class SimpleIntList {

    public Node head = null;

    public static void main(String[] args) {
        SimpleIntList list1 = new SimpleIntList();
        list1.addNode(1);
        list1.addNode(3);
        list1.addNode(5);

        SimpleIntList list2 = new SimpleIntList();
        list2.addNode(2);
        list2.addNode(4);
        list2.addNode(6);

        Node node = mergeTwoList(list1.head, list2.head);

        printList(node);


    }

    class Node {
        Node next = null;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }


    public void addNode(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = newNode;
        }
    }

    public int length() {
        Node tmp = head;
        int i = 0;
        while (tmp != null) {
            i++;
            tmp = tmp.next;
        }
        return i;
    }

    public static void printList(Node node) {
        Node tmp = node;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    public static Node mergeTwoList(Node node1, Node node2) {

        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }

        if (node1.data < node2.data) {
            node1.next = mergeTwoList(node1.next, node2);
            return node1;
        } else {
            node2.next = mergeTwoList(node1, node2.next);
            return node2;
        }
    }


}
