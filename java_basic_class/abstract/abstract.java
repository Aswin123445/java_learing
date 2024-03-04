class Demo{
    public static void main(String args[]){
        //B b=new B();
       // b.name();
       C c=new C();
       c.fly();
       c.name();

    }
}
abstract class A{
    public void show(){
        System.out.println("hi");
    }
    abstract public void name();
    abstract public void fly();
}
abstract class B extends A{
    public void name(){
        System.out.println("hi");
    }
}
//the class A is an abstract class so we cannot make a object of it
//the class A constains an class called name which is an abstract in so the implementattion of this
//class cannot be found in the class
//class B extends class A and this class implentents the method name
class C extends B{
   public void fly(){
    System.out.println("object can fly");
   }
}
//if extended class cannot implement the abstract method then the class become and abstract class too

