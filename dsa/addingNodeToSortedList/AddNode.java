class SinglyLinkedList{
    node header;
    private static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void printNode(){
       node current=header;
       while(current!=null){
        System.out.print(current.data+" ");
        current=current.next;
       }
    }
    public void newData(int data){
        node newNode=new node(data);
        node current=header;
        node previous=null;
        while(current!=null&&current.data<newNode.data){
            previous=current;
            current=current.next;
        }
        newNode.next=current;
        previous.next=newNode;

    }
    public static void main (String args[]){
        SinglyLinkedList sl=new SinglyLinkedList();
        //adding new node element;
        int newdata=44;
        sl.header=new node(10);
        node second=new node(20);
        node third=new node(30);
        node four=new node(40);

        sl.header.next=second;
        second.next=third;
        third.next=four;
        sl.printNode();
        sl.newData(newdata);
        System.out.println("");
        sl.printNode();
    }
}