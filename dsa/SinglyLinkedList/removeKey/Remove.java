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
    public void removeKey(int data){
        node current=header;
        node previous=null;
        while(current!=null&current.data!=data){
            previous=current;
            current=current.next;
        }
        if(current==null)
          System.out.println("nothing to see");
        previous.next=current.next;
    }
    public void printNode(){
       node current=header;
       while(current!=null){
        System.out.print(current.data+" ");
        current=current.next;
       }
    }
    public static void main(String args[]){
          SinglyLinkedList sl=new SinglyLinkedList();
        //adding new node element;
          int key=30;
        sl.header=new node(10);
        node second=new node(20);
        node third=new node(30);
        node four=new node(40);
        sl.header.next=second;
        second.next=third;
        third.next=four;
        sl.printNode();
        sl.removeKey(key);
        sl.printNode();//30 will be removed from the code
    }
}