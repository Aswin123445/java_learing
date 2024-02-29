package java_learing.java_basic_class.access_modi;

public class access {//here public key word is used it indicate that the class can be used outside the package
    private String name;//here private keyword is used to decalre the name varible is only accessed inside the class

    access(){
        name="arun";
    }
    void getter(String na)
    {
        this.name=na;
    }
    public static void main(String args[]){
        access a=new access();
        a.getter("name");
        System.out.println(a.name);//output =name
      
    }//static keyword is used declare that to call the main method we don't need to create an object
    
}
//protected varible is used when we need to use varible in sub class or parent class
