package java_learing.java_basic_class.method;
public class riding {
    public static void main(String args[]){
        sub s=new sub();
       System.out.println( s.add(2, 3));//here the output is 13 as it override the add method from parent class
       add a;
       a=new add();
       a.dd();
      
    }
    
}
 class mehtodo {
    public int add(int a,int b){
        int ans=a+b;
        return ans;
    }
}
 class sub  extends mehtodo{
    public int add(int a,int b){
       int ans=(a*a)+(b*b);
       return ans;
    }
    
}
