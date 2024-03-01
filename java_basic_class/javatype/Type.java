package java_basic_class.javatype;

 public class Type {
    public static void main(String[] args) {
    //upcasting
      A a=new B();
      a.show();
    //downcasting
     B o=(B)a;
     o.show();
        
    }
    
}
class A{
    public void show(){
        System.out.println("in a");
    }
}
class B extends A{
    public void show1(){
        System.out.println("in b");
    }
}
