class OuterClass{
    public void show(){
        System.out.println("outer class printed");
        
    }
    //inner class
    class InnerClass{
        public void show1(){
            System.out.println("inner class printed");
        }
    }

}
class Demo{
    public static void main(String args[]){
        OuterClass cl=new OuterClass();
        cl.show();//output will be outer class will be printed

        //now i want to print the inner class for that 
        //we need to create an object of outer class
        //we have c1 object of outerclass
        //datatype will be
        OuterClass.InnerClass c2=cl.new InnerClass();//the output will be inner class is called 
        c2.show1();
    }
}