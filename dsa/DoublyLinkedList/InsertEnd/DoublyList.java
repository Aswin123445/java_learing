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
    public void addDatatEnd(int data){
        node newNode=new node(data);
        if(head==null){
            head=newNode;
        }else{
            tail.next=newNode;
            newNode.previous=tail;
        }
        tail=newNode;
    }
    public static void main(String args[]){
        DoublyLinkedList dl=new DoublyLinkedList();
        dl.addDatatEnd(30);
        dl.addDatatEnd(40);
        dl.printNode();//the output will be 30,40
    }
}