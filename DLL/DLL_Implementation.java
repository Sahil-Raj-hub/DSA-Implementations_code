public class DLL_Implementation {
    Node head;
    int count=0;

    public void addFirst(Object data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }

        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }
}
