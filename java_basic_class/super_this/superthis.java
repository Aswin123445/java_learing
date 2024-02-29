class A{
    public A(){
        super();
        System.out.println("class A constructor called");
    }
    public A(int i){
        System.out.println("call"+i);
    }


}
class B extends A{
   public B(){
    super(4);//super class is implicitly called 
    System.out.println("class B constructor called");
   }
    public B(int a){
    this();//this will call the constructor of it's on method then that construtor will call the super class
    System.out.println("class B constructor called"+a);
   }
}
class Demo{
    public static void main (String args[]){
        // B b=new B();//out pust will be class B constructor called
        // B a=new B(5);
        //now class a contructor is called first 
        //the main reason is java consturcor always called super(); inside construcor;
       

    }
}