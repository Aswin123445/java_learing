class Stack{
    private node top;
    private int length;
    private static class node{
        int data;
        node next;
        public node(int data){
          this.data=data;
          this.next=null;
        }
    }
    public void showData(){
        if(top==null){
            System.out.println("no data found");
        }else{
            node temp=top;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
        public void push(int data){
        node newNode=new node(data);
        newNode.next=top;
        top=newNode;
        length++;
    }
    public int pop(){
        if(top==null){
            return -1;
        }else{
            node temp=top;
            top=temp.next;
            return temp.data;
        }
    }
    public static void main(String args[]){
         Stack stack=new Stack();
         stack.push(5);
         stack.push(30);
         stack.push(50);
         stack.showData();
         stack.pop();
         stack.showData();//when we do pop operation 50 will be removed from statck
         stack.pop();
         stack.pop();
         stack.pop();
         stack.showData();//no data found will be displayed
    }
}