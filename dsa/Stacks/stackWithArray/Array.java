class ArrayStack{
    private int length;
    private int top;
     int array[];
    public ArrayStack(int length){
       this.length=length;
       array=new int[this.length];
       this.top=-1;
    }
    public void showData(){
        if(top==-1){
            System.out.println("no data found");
        }else{
            for(int i=0;i<=top;i++){
                 System.out.println(array[i]);
            }
        }
    }
    public void push(int data){
       if(top+1<length){
        array[top+1]=data;
        top++;
       }else{
        System.out.println("maxSize reached");
       }
    }
    public void pop(){
        if(top!=-1){
            System.out.println(array[top]+"is removed");
            top--;
        }
    }
    public static void main(String args[]){
        ArrayStack aS=new ArrayStack(5);
       // aS.showData();
        aS.push(30);
        aS.showData();
        aS.push(4);
        aS.push(40);
        aS.push(55);
        aS.push(60);
        aS.push(55);
        aS.pop();
        aS.showData();
    }
}