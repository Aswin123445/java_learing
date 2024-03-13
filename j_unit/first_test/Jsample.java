class Operation{
    public int addition(int a,int b){
        return a+b;
    }
    public int substration(int a,int b){
        return a-b;
    }
    public int negation(int a){
        return -a;
    }
}
class MainF{
    public static void main(String args[]){
        Operation o=new Operation();
        //testing
        int result=o.addition(3,3);
        if(result==6)//correct output and test going to pass
          System.out.println("test passed");
        else
          System.out.println("test failed");
        //testing 2
        int result2=o.substration(3,3);
        if(result2==1)//wroing output and test is going to fail
          System.out.println("test passed");
        else
          System.out.println("test failed");
    }
}