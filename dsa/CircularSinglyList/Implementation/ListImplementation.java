class CircularLinkedList{
    private node last;
    private int length;
    private static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
        }
    }
    public CircularLinkedList(){
        this.last=null;
        this.length=0;
    }
    public static void main(String args[]){
        CircularLinkedList cl=new CircularLinkedList();
        node one=new node(30);
        node two=new node(40);
        node three=new node(60);

        one.next=two;
        two.next=three;
        three.next=one;
        cl.last=three;
    }

}