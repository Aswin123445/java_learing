//inner anonymous class
class A{
    public void  show(){
        System.out.println("parent hi");
    }
}
class Demo{
    public static void main(String args[]){
        A a=new A();
        a.show();//out will be parent hi
        //create an anonymous inner class
        A aa=new A(){
            //now the aa object of type A will have implentation given below
             public void  show(){
        System.out.println("ano inner class");
    }
        };
        aa.show();//here the ano inner class will be printed and we created an
        //anonymous inner class file is created

    }
}
