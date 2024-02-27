class Overload{
    public static void main(String args[]){
        Sub obj=new Sub();
        int a=5,b=20,c=30;
        int ans1;
        int ans2;
        ans1=obj.addTwoNumbers(a,b);
        ans2=obj.addTwoNumbers(a,b,c);
        System.out.println((ans1)+" and "+(ans2));
     //out put will be 25 and 55

    }
}
class Sub{
    //method 1
    int addTwoNumbers(int a,int b){
        return a+b;
    }
    int addTwoNumbers(int a,int b,int c){
        return a+b+c;
    }
    //both method has same name but differen parameters
}
//here we used same method name but both names when called acted differently