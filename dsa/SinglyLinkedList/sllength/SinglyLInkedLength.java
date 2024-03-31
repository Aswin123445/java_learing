class SinglyLinkedList{
    private node head;
    private static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }

    //adding new element to the begining

    public void addNodeBegin(int data){
        node newNode=new node(data);
        newNode.next=head;
        head=newNode;
    }
    public int count(){
        node current=head;
        int increamenter=0;
        while(current!=null){
            increamenter++;
            current=current.next;;
        }
        return increamenter;
    }
    public void showList(){
        node current=head;
        while(current!=null){
            System.out.println(current.data);
            current=current.next;
        }
    }
    public void addAtLast(int data){
       node newNode=new node(data);
       if(head==null)
         head=newNode;
       node current=head;
       while(current.next!=null)
         current=current.next;
       current.next=newNode;
    } 
    //add elemetents to the given postiion
    public void addElementPosition(int data,int postiion){
        node addNode=new node(data);
        if(postiion==1){
            addNode.next=head;
            head=addNode;
        }else{
            node previous=head;
            int count=1;
            while(count<postiion-1){
                previous=previous.next;
                count++;
            }
            node curre=previous.next;
            addNode.next=curre;
            previous.next=addNode;
        }
    }
    public void addElementLast(int data){
        node lastNode=new node(data);
        if(head==null){
            head=lastNode;
            return;
        }
        else{
            node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=lastNode;
        }
    }
    public static void main(String args[]){
        SinglyLinkedList sl=new SinglyLinkedList();
        sl.head=new node(20);
        node second=new node(50);
        node third=new node(89);
        int counter;

        //linking the nodes
        sl.head.next=second;
        second.next=third;
        counter=sl.count();
        System.out.println(counter+" number of data");//output will be 3
        sl.addNodeBegin(200);
        sl.showList();
        counter=sl.count();
        System.out.println(counter+" number of data");//output will be 4 because we added one element at the begining
        sl.addAtLast(45);
        sl.showList();
        int pos=2;
        sl.addElementPosition(10,2);
        System.out.println("object inserted");
        sl.showList();
        sl.addAtLast(100);
        sl.showList();
        sl.addElementPosition(50,8);
        sl.showList();
        
    }
}