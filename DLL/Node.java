public class Node{
    Object data;
    Node prev;
    Node next;
    Node(Object ele){
        this.data=ele;
        this.prev=null;
        this.next=null;
    }
}