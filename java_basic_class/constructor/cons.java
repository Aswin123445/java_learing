class Cons{
   private int num;
   //default contructor
   Cons (){
    num=23;
   }
   //parmeterized constructor
   Cons(int num)  {
    this.num=num;
   }
   public int getNum(){
    return num;
   }
}
class Demo{
    public static void main(String args[]){
        Cons data=new Cons();
        System.out.println(data.getNum());//the out put is 23 as default constructor initialize the variable
        Cons data1=new Cons(30);
        System.out.println(data1.getNum());
    }
}