interface A{
   void show();
}
class B implements A{
    public void show(){
        System.out.println("hi");
    }
}
//this is an example of funtional interface 
//we can also do this with the help of anonymous inner class
class Demo {
    public static void main(String args[]){
       //  B b=new B();
        //  b.show();//output hi
        B b=new B(){
            public void show(){
                System.out.println("hi");
            }
        };
        b.show();
    }
}