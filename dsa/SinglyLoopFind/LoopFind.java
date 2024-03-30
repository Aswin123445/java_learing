class Singlylinkedlist{
    private node head;
    private static class node{
        int data;
        node next;
        public node(int data){
          this.data=data;
          this.next=null;
        }
    }
    public void printNodes(){
        node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public boolean checkLoop(){
        node slownode=head;
        node fastnode=head;
        while(fastnode!=null&&fastnode.next!=null){
            fastnode=fastnode.next.next;
            slownode=slownode.next;
            if(fastnode==slownode)
              return true;
        }
        return false;
    }
    //loop starting node
    public node startingLoop(){
        node slownode=head;
        node fastnode=head;
        while(fastnode!=null&&fastnode.next!=null){
            fastnode=fastnode.next.next;
            slownode=slownode.next;
            if(fastnode==slownode)
              return getstartNode(slownode);
        }
        return null;
    }
    public node getstartNode(node slownode){
        node temp=head;
        while(temp!=slownode){
            temp=temp.next;
            slownode=slownode.next;
        }
        return temp;
    }

    public static void main(String args[]){
          Singlylinkedlist sl=new Singlylinkedlist();
        //adding new node element;
        sl.head=new node(10);
        node second=new node(20);
        node third=new node(30);
        node four=new node(40);
        sl.head.next=second;
        second.next=third;
        third.next=four;
        four.next=second;
        boolean checker;
        checker=sl.checkLoop();
        if(checker==true){
            System.out.println("given list is a loop ");
        }
        else{
            System.out.println("given list is not a loop");
        }
        node startLoop=sl.startingLoop();
        System.out.println(startLoop.data);//heret the output will be 20 as from second node 
        //it start the loop cycle and data stored in node 2 is 20
     }
}
//output will be given list is a loop as the singly linkedlist contains a loop