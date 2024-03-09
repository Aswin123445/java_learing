//exception in java
import java.io.BufferedReader;
class Exp{
    public static void main (String args[]){
        //arithmatic exception
        int i=0;
        int j=3;
        //critical code that have chaneces of getting error
        try{
            int ans=j/i;
            
             throw new myexp("not executed");
         }//catch(ArithmeticException e){
        //     System.out.println(e+" please try again");
        // }//catch block cathes the exception as object e
         catch(myexp e){
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("handles all exception ");
        }//this is a parent class for all the exception so handle all type of excetion
       
        

    }
}
//creating my own exception
class myexp extends Exception{
    //always remeper that a contrucntor always don't have a return type
      public myexp(String s){
         super(s);
      }
}