class SinglyLinkedList{
    node header;
    private static class node {
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void showNode(){
        node current=header;
        if(current!=null){
            while(current!=null){
               System.out.print(current.data+" ");
               current=current.next;
            }
            System.out.println("");
        }
    }
    public void removeLoop(){
        node slow=header;
        node fast=header;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                remove(slow);
            }
        }
    }
    public void remove(node slow){
        node temp=header;
        while(slow.next!=temp.next){
            slow=slow.next;
            temp=temp.next;
        }
        slow.next=null;
    }
    public static void main(String args[]){
        SinglyLinkedList sl=new SinglyLinkedList();
        sl.header=new node(10);
        node second=new node(20);
        node third=new node(30);
        node four=new node(40);
        //linking the node
        sl.header.next=second;
        second.next=third;
        third.next=four;
        four.next=second;
        sl.removeLoop();
        sl.showNode();
    }
}