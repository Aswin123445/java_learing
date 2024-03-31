//this code will demonstrate how to create a singly linked list
class SinglyList{
    private node head;
    private static class node{
        private int data;
        private node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("end");
    }
     public static void main(String args[]){
        SinglyList singlyList=new SinglyList();
        singlyList.head=new node(10);
        node second=new node(3);
        node third=new node(84);

        //linking the nodes
        singlyList.head.next=second;
        second.next=third;
        singlyList.display();
    }
}
