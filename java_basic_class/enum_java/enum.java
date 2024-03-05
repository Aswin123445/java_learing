enum Update{
    Out,in,work,sucess;//these are the object of the enum Update
    //basically enum is a group of constants 
}
 class Demo{
    public static void main(String args[]){
        Update u=Update.Out;
        System.out.println(u);//output will be out
        //condition checking in enum
        if(u==Update.Out)
          System.out.println("He is out");
        else if(u==Update.in)
          System.out.println("he is inside");
        else if(u==Update.work)
          System.out.println("he is working");
        else 
          System.out.println("he is dead");

//here the output will be he is out

//anothter example for enum with construcntors setters and getters

       Eg e=Eg.Multiple;
       //output multiple :numbers
       Eg b=Eg.Addition;
       System.out.println(b+" :"+b.getter());//output :Addition :fraction
       



    }
}
enum Eg{
    Multiple("numbers"),Substract("decimal"),Addition("fraction"),Division("real numbers");
    private String Type;
    Eg(String Type){
      this.Type=Type;
    }
    //now inside each Eg object of Multiple ,Substract,etc we have assign value given
    //we need getter and setter for getting and setting variables
    public void setter(String type){
        this.Type=type;
    }
    public String getter(){
        return Type;
    }
}