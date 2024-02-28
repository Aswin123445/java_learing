class Static {
  public static void main(String args[]){
    Mobile mobile=new Mobile();
    mobile.brand="samsung";
    mobile.price=200;
    Mobile.type="smartphone";
    
    Mobile mobile1=new Mobile();
    mobile1.brand="Apple";
    mobile1.price=500;
    Mobile.type="smartphone";//instead of using object we can use class itself here
    mobile.showData();
    mobile1.showData();
  } 
}

//static varible can be separetily initialized with the help of static method
//static method is only called once
class Mobile{
    //static varible is used to act as a common variable for all the objec 
    //we can call the static variable by class name

    //instance variable
    String brand;
    int price;
    static String type;
    public Mobile(){
        System.out.println("con");
      brand="xe";
      price=40;
    }
    //here helo is only printed once means it's called only once
    
    static{
        type="helo";
        System.out.println(type);
    }
    //as type is common for all the object we can use it as a staic varible
    //method to print
    public void showData(){
        System.out.println("Brand :"+brand +"\n"+"price :"+price+"\n"+"type:"+type);
    }
}