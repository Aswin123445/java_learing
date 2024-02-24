class typecast{
    public static void main(String args[]){
        //type casting in java
        byte a=3;
        int c=4;
        System.out.println(a+c);//imlicit type casting
         a=(byte)c;
        System.out.println(a);//out put is 4 and it's type is 

        float x=4.455f;
        int da=(int)x;
        System.out.println(da);//output is 4 decimal points are removed due to type casting

        int big=230;
        byte red=4;
        red=(byte)big;
        System.out.println(red);// outpus is -26 because of overflow

        int big1=14;
        byte red2=4;
        big1=(int)red2;
        System.out.println(big1);//out pus will be 4

        //concept of type promotion

        byte num1=44;
        byte num2=55;
        int num3=num1*num2;
        System.out.println(num3);//the out put is 2420 which is in int type the compiler automatically promote the type 
        
        
    }
}