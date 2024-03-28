import java.util.Scanner;
class SinglyLinkedList{
    private node header;
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void showList(){
        node current=header;
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
    }
    public boolean searchList(int data){
        node current=header;
        while(current!=null){
          if(current.data==data)
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("creating singly linked list");
        SinglyLinkedList sl=new SinglyLinkedList();
        sl.header=new node(10);
        node two =new node (30);
        node four=new node (60);

        //linking the node
        sl.header.next=two;
        two.next=four;
        sl.showList();
        //trying to search particular element
        int searchData;
        System.out.println("Enter the data you want to search ");
        searchData=sc.nextInt();
        System.out.println(sl.searchList(10));//output will be true
    }
}