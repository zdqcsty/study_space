package shujujiegou;

public class LianBiaoShiXian implements  Cloneable{

    Node head=null;
    class Node{
        Node next;
        int data;
        public Node(int data){
            this.data=data;
        }
    }

    public boolean add(int shuzi){
        Node node=new Node(shuzi);
        if (head==null){
            head=node;
            return true;
        }
        Node nextNode = head.next;
        while(nextNode!=null){
            nextNode= nextNode.next;
        }
        nextNode=node;
        return true;
    }


    public boolean remove(int index) {

        if (index < 0) {
            return false;
        }
        if (index == 1) {
            head = head.next;
            return true;
        }

        int i = 1;
        while (i < index) {
        }

return true;
    }
}
