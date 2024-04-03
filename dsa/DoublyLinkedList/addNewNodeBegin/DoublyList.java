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
    public void addNewNodeBegin(int data){
       node newNode=new node(data);
       if(head==null){
        tail=newNode;
       }else{
        head.previous=newNode;
        
       }
       newNode.next=head;
       head=newNode; 
       length++;
    }
    public node deleteNodeBegin(){
        if(head==null){
            throw new NoSuchElementException();
        }
        node temp=head;
        if(head==tail){
            tail=null;
        }else{
            head.next.previous=null;
        }
        head=head.next;
        temp.next=null;
        return temp;
    }
    public static void main(String args[]){
        
    }
}