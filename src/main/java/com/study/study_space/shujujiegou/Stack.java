package shujujiegou;

public class Stack {

    Node head;
    Node current;

    public int push(int data){
        Node node=new Node(data);
        if(head==null) {
            current = node;
            head = node;
        }else{
            node.pre=current;
            current=node;
        }
        return node.data;
    }

    public int pop(){
        if (current==null){
           return 000;
        }else {
            int data=current.data;
            current=current.pre;
            return data;
        }
    }

    class Node {
        int data;
        Node pre;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Stack stack=new Stack();

        stack.push(1);
        stack.push(2);

        int pop = stack.pop();
        int pop1 = stack.pop();
        int pop2 = stack.pop();
        System.out.println(pop2);
    }
}

