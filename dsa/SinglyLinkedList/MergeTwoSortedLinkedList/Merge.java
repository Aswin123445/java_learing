class SinglyLinkedList{
    private node header;
    private static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void showNode(){
        if(header!=null){
            node current=header;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;
            }
        }
        System.out.println("");
    }
    public static node mergeList(node sl1,node sl2){
        node dummy=new node(0);
        node tile=dummy;
        while(sl1!=null&&sl2!=null){
            if(sl1.data<=sl2.data){
                tile.next=sl1;
                sl1=sl1.next;
            }else{
                tile.next=sl2;
                sl2=sl2.next;
            }
            tile=tile.next;
        }
        if(sl1==null){
            tile.next=sl2;
        }else{
            tile.next=sl1;
        }
        return tile;
    }
    public static void main(String args[]){
        SinglyLinkedList sl=new SinglyLinkedList();
        SinglyLinkedList s2=new SinglyLinkedList();
        SinglyLinkedList s3=new SinglyLinkedList();
        sl.header=new node(10);
        node second=new node(20);
        node third=new node(30);
        node fourth=new node(40);
        sl.header.next=second;
        second.next=third;
        third.next=fourth;
        s2.header=new node(5);
        node ssecond=new node(15);
        node sthird=new node(25);
        s2.header.next=ssecond;
        ssecond.next=sthird;
        sl.showNode();
        s2.showNode();
        mergeList(sl.header,s2.header);
        sl.showNode();
    
    }
}