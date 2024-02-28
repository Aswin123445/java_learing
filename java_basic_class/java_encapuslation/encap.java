class Encap{
    private int age;
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;//here we used to this keyword to refer to the current object
        //as the method always give preference to local variable
        //we use this keyword to solve ambiguilty
        //the method is used here is also know as setter and getter
        
    }
}
class Demo{
    public static void  main(String args[]){
        Encap cap=new Encap(); 
        cap.setAge(20);
        System.out.println(cap.getAge());
        //here the datas of encap class is bounded with the methods 
        // and it is private so only through those methods we can work on that data
    }
}