public class DLL_Implementation {
    Node head;
    int count=0;


    //Add element at first
    public void addFirst(Object data){
        Node newnode=new Node(data);
        count++;
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
    }


    //Add Element add last
    public void addLast(Object data){
        Node newnode=new Node(data);
        count++;
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
    }


    //get size 

    public int size(){
        return count;
    }

    //Display forward

    public void displayForward(){
        Node temp=head;
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        while(temp!=null){
            System.out.println(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
        System.out.println();
    }


    // Display Backward

    public void displayBackward(){
        Node temp=head;
        if(head==null){
            System.out.println("list in invalid");
            return;
        }

        while(temp.next!=null){
            temp=temp.next;
        }

        while(temp!=null){
            System.out.println(temp.data+"->");
            temp=temp.prev;
        }
        System.out.println("null");
    }

    //Add at specific position

    public void addAtIndex(Object ele,int index){
        Node newnode=new Node(ele);
        count++;
        if(index<0||index>count){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(index==0){
           if(head!=null){
            newnode.next=head;
            head.prev=newnode;
           }
           head=newnode;
           return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next.prev=newnode;
        newnode.prev=temp;

        newnode.next=temp.next;
        temp.next=newnode;
    }
}
