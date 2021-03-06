package com.study.study_space.shujujiegou.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

public class ErXTree {

    public static void main(String[] args) {

        Node node = initDate();
//        depthPriority(node);
        widthPriority(node);

    }


    public static Node initDate() {

        Node resultNode;

        Node aNode = new Node();
        aNode.setValue("A");
        aNode.setChildren(new ArrayList<>());

        Node bNode = new Node();
        bNode.setValue("B");
        bNode.setChildren(new ArrayList<>());

        Node cNode = new Node();
        cNode.setValue("C");
        cNode.setChildren(new ArrayList<>());

        Node dNode = new Node();
        dNode.setValue("D");
        dNode.setChildren(new ArrayList<>());

        Node eNode = new Node();
        eNode.setValue("E");
        eNode.setChildren(new ArrayList<>());

        Node fNode = new Node();
        fNode.setValue("F");
        fNode.setChildren(new ArrayList<>());

        Node gNode = new Node();
        gNode.setValue("G");
        gNode.setChildren(new ArrayList<>());

        aNode.getChildren().add(bNode);
        aNode.getChildren().add(cNode);

        bNode.getChildren().add(dNode);
        bNode.getChildren().add(eNode);

        cNode.getChildren().add(fNode);
        cNode.getChildren().add(gNode);

        resultNode = aNode;

        return resultNode;
    }

    //利用栈先进后出的特性  进行深度遍历
    public static void depthPriority(Node node) {
        Stack<Node> stack = new Stack();
        stack.push(node);
        while (!stack.isEmpty()) {
            Node top = stack.pop();
            System.out.println(top.getValue());
            List<Node> children = top.getChildren();
            if (!children.isEmpty() && children != null) {
                for (int i = children.size() - 1; i >= 0; i--) {
                    stack.push(children.get(i));
                }
            }
        }
    }

    //利用队列先进先出的特性  进行深度遍历
    public static void widthPriority(Node node) {
        Queue<Node> queue = new LinkedBlockingQueue<Node>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node first = queue.poll();
            System.out.println(first.getValue());
            List<Node> children = first.getChildren();
            if (children != null && children.size() > 0) {
                for (int i = 0; i < children.size(); i++) {
                    queue.add(children.get(i));
                }
            }
        }
    }
}

