//lampda funtion can be only used in funtional interface
interface A{
    void show(String name);
}//this is an example of funtional interface which has only one method 
class B implements A{
     public void show(String a){
        System.out.println("hi");
    }
}
class Demo{
    public static void main(String args[]){
       B b=new B();
       b.show("hi");//output hi
       //anonymous inner class
       B bb=new B(){
         public void show(String a){
            System.out.println("inside anonymous inner class");
         }
       };
       bb.show("name");
    //    bb.show();
    //    //lamda funtions
    //    B bbb=()->System.out.println("lamda");
    //here we get error because b is not a funtional interface
    A aaa=(String a)->System.out.println("lamda "+a);
    aaa.show("hi");//output lampda hi hi is an argument to lampda funtion
    }
}