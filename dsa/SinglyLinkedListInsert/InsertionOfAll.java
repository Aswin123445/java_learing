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
    public void addElementAtBegin(int data){
        node nodeFirat=new node(data);
        if(head==null){ 
          head=nodeFirat;
          return;
        }
        else{
            nodeFirat.next=head;
            head=nodeFirat;
        }

    }
    public void addElementAtPosition(int position,int data){
       node newNode=new node(data);
       if(head==null){
          head=newNode;
          return;
       }else if(position==1){
          newNode.next=head;
          head=newNode;
       }
       else{
        int count=1;
        node previous=head;
        while(count<position-1){
            previous=previous.next;
            count++;
        }
        node current=previous.next;
        newNode.next=current;
        previous.next=newNode;
       }
    }
    public void addingElementEnd(int data){
        node newNode=new node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        else{
            node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
    }
    public void printNodes(){
        node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public static void main(String args[]){
        Singlylinkedlist sl=new Singlylinkedlist();
        sl.addElementAtBegin(10);
        sl.printNodes();
        sl.addElementAtBegin(20);
        sl.printNodes();
        System.out.println("");
        sl.addingElementEnd(100);
        sl.printNodes();
        sl.addElementAtPosition(3,50);
        System.out.println("");
        sl.printNodes();
    }
}