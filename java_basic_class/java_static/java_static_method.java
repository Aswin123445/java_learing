class Staticmethod{
    public static void main(String args[]){

    }
}
class demo{
    int age;
    public demo(){
        age=12;
    }
    static String name;
    //initializer
    static {
        name="Aswin";
       // age=40;this line gives error because age is a instance varible
    }
    public static void concat(){
        name=name+"Sandeep";//can use a static variable inside the static method
    }
}