package java_basic_class.polymorphism;

public class dmd {
    public static void main(String args[]){
       A obj=new A();
       obj.add(10, 3);
       obj=new B();//here variable of type A and object is type B which is a child class of A
       obj.add(10, 2);
       obj=new C();
       obj.add(20, 10);
    }
}
class A{
    public void add(int a,int b){
        System.out.println(a+b);
    }

}
class B extends A{
    public void add(int a,int b){
        System.out.println(a*b);
    }

}
class C extends A{
    public void add(int a,int b){
        System.out.println(a-b);
    }
}
