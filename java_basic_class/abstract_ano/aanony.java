abstract class A{
    abstract public void show();
    public void show2(){
        System.out.println("in Class A");
    }
}
 class Demo {
    public static void main(String args[]){
        A obj=new A(){
            public void show(){
                System.out.println("okay done");
            }
        };
        obj.show();//output will be okay done
       
    }
}