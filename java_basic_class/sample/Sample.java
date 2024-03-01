class Sample{
    public static void main(String args[]){
        A a=new A();
        System.out.println(a);//here toString method is called which is 
        //overriden by the Object class

    }
}
class A{
    int a=10;
    public void hi(){
        System.out.println("jai");
    }
    public String toString(){
        return "hai";
    }
}