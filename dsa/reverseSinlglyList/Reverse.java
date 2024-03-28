class SinglyLinkedList{
    node header;
    private static class node{
        int  data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void showNode(){
        if(header==null){
            System.out.println("no values");
        }
        else{
            node current=header;
            while(current!=null){
                System.out.println(current.data);
                current=current.next;
            }
        }
    }
    public node reverseList(){
        if(header==null){
            System.out.println("nothing to reverse");
            return header;
        }
        else{
            node current=header;
            node next=null;
            node previous=null;
            while(current!=null){
                next=current.next;
                current.next=previous;
                previous=current;
                current=next;
            }
            return previous;
        }
    }
    public int nodeCount(){
        int count=0;
        if(header==null){
            System.out.println("nothing to print");
        }else{
            node current=header;
            while(current!=null){
                count++;
                current=current.next;
            }
        }
        return count;
    }
    //funtion to print node data from last
    public int positonFromLast(int position){
        if(position==1){
            return header.data;
        }else{
            int count=1;
            node current= header;
            while(count<=position){
                current=current.next;
                count++;
            }
            return current.data;
        }
    }
    public static void main(String args[]){
        SinglyLinkedList sl=new SinglyLinkedList();
        sl.header=new node(10);
        node two =new node(30);
        node three=new node(50);
        node four=new node(80);
        int count;
        int data;
        //linkged the nodes
        sl.header.next=two;
        two.next=three;
        three.next=four;
        sl.showNode();
        //want to reverse the Singly Linked list
        node head2=sl.reverseList();
        System.out.println("");
        sl.header=head2;
        sl.showNode();
        count=sl.nodeCount();
        System.out.println(count);
        System.out.println(sl.positonFromLast(count-4));
    }
}