class SinglyLinkedList{
    private node header;
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void printNode(){
        if(header==null){
            System.out.println("nothing to print ");
        }else{
            node current=header;
            while(current!=null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
    //removing duplicate data
    public void removeData(){
        node current=header;
        while(current!=null&&current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
    }
    public static void main(String args[]){
        SinglyLinkedList sl=new SinglyLinkedList();
        sl.header=new node(10);
        node first=new node(20);
        node third=new node(30);
        node four=new node(30);
        //linking node
        sl.header.next=first;
        first.next=third;
        third.next=four;
        System.out.println("");
        sl.printNode();
        sl.removeData();//last 30 node will be removed from data
        sl.printNode();
    }
}