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
    public void traverseData(){
        if(last==null){
            System.out.println("no such node");
        }else{
            node first=last.next;
            while(first!=last){
                System.out.print(first.data+" ");
                first=first.next;
            }
            System.out.println(first.data);
        }
    }
    public void addAtEnd(int data){
        node newnode=new node(data);
        if(last==null)
          last=newnode;
        else{
            newnode.next=last.next;
            last.next=newnode;
            last=newnode;
        }
        length++;
    }
    public static void main(String args[]){
        CircularLinkedList cl=new CircularLinkedList();
        node one=new node(4);
        node two=new node(45);
        node three=new node(79);
        node four=new node(50);

        //linking the data
        one.next=two;
        two.next=three;
        three.next=four;
        four.next=one;
        cl.last=four;
        cl.traverseData();
        cl.addAtEnd(400);
        cl.traverseData();//in the output at last there will be 400
    }
}