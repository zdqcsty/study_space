package com.study.study_space.shujujiegou.list;

//单向链表的实现
public class SimpleList {

    public Node head = null;

    public static void main(String[] args) {

        SimpleList list=new SimpleList();
        list.addNode("aaa");

    }

    class Node {
        Node next = null;
        String data;

        public Node(String data) {
            this.data = data;
        }
    }


    public void addNode(String data) {

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


}


