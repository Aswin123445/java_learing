class SinglyLinkeddelete{
    node head;
    private static class node{
        int data;
        node next;
        public node(int data){
           this.data=data;
           this.next=null;
        }
    }
    public void showElement(){
        node show=head;
        while(show!=null){
            System.out.print(show.data+" ");
            show=show.next;
        }
        System.out.println("");
    }
    public int delete(){
        if(head==null)
          return 0;
        else{
            node temp=head;
            head=head.next;
            return temp.data;
        }
    }
    public int deleteLast(){
        //to do this we need to traverse to the second last element
        if(head==null||head.next==null){
           head=null;
           return -1;
        }
        node previous=null;
        node current=head;
        while(current.next!=null){
            previous=current;
            current=current.next;
        }
        previous.next=null;
        return 1;
    }
    public int deleteAtPosition(int position){
        if(position== 1)
          head=head.next;
        else{
            node previous=head;
           
            int count=1;
            while(count<position-1){
                count++;
                previous=previous.next;
            }
            node current=previous.next;
            previous.next=current.next;
            return current.data;
        }
        return 1;
        
    }
    public static void main(String args[]){
        SinglyLinkeddelete sd=new SinglyLinkeddelete();
        sd.head=new node(5);
        node second=new node(20);
        node third=new node(100);
        //linking
        sd.head.next=second;
        second.next=third;

        sd.showElement();
       // sd.delete();
        sd.showElement();
        node four=new node(200);
        third.next=four;
        sd.showElement();
        sd.deleteLast();
        sd.showElement();
        sd.deleteAtPosition(1);
        sd.showElement();
    }
}