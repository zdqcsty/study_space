package com.study.study_space.shujujiegou.list;

//单向链表的实现
public class SimpleList {

    public Node head = null;

    public static void main(String[] args) {
        SimpleList list = new SimpleList();
        list.addNode("aaa");
        list.addNode("bbb");
        System.out.println(list.length());
        list.printList();

        Node node = list.reverseListIterative(list.head);
        list.head=node;
        list.printList();


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

    public int length() {
        Node tmp = head;
        int i = 0;
        while (tmp != null) {
            i++;
            tmp = tmp.next;
        }
        return i;
    }

    public void printList() {
        Node tmp = head;
        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }


    public Node reverseListIterative(Node head) {
        Node prev = null; //前指针节点
        Node curr = head; //当前指针节点
        //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
        while (curr != null) {
            Node nextTemp = curr.next; //临时节点，暂存当前节点的下一节点，用于后移
            curr.next = prev; //将当前节点指向它前面的节点
            prev = curr; //前指针后移
            curr = nextTemp; //当前指针后移
        }
        return prev;
    }
}





