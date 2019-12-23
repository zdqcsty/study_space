package com.study.study_space.shujujiegou.tree;

import java.util.List;

public class Node {
    private String value;
    private List<Node> children;

    public List<Node> getChildren() {
        return children;
    }

    public void setChildren(List<Node> children) {
        this.children = children;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}