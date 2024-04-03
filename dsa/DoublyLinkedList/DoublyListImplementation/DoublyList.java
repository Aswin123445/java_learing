class DoublyLinkedList{
    private node head;
    private node tail;
    private int length;
    private static class node{
        int data;
        node next;
        node previous;
        public node(int data){
            this.data=data;
        }
    }
    public DoublyLinkedList(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty(){
        return head==null;
    }
    public int listLength(){
        return length;
    }
    //printing data in forward
    public void printNode(){
        if(head==null){
            System.out.println("no data");
        }
        else{
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println("");
        }
    }
    public void printReverse(){
        if(tail==null){
            System.out.println("no data");
        }else{
            node temp=tail;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.previous;
            }
            System.out.println("");
        }
    }
    public static void main(String args[]){
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.head=new node(20);
        node second=new node(30);
        node third=new node(40);

        dl.head.previous=null;
        dl.head.next=second;
        second.previous=dl.head;
        second.next=third;
        dl.tail=third;
        dl.tail.previous=second;
        dl.printNode();
        dl.printReverse();
        System.out.println(dl.tail.previous);
    }
}
//the output of the above code will be
 //20 30 40
 //40 30 20