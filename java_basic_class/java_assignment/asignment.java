class asignment{
    public static void main(String args[]){
        //adding operation
        int num1= 10;
        int num2=5;
        System.out.println(num1+num2);

        // substraction
        System.out.println(num1-num2);
        
        //incrementation
        System.out.println(++num1);//output 11 preincrement increament the valus then display
        System.out.println(num2++);//post increment display the value then increment it
        System.out.println(num2);//output will be 6 as the value is incremeted

        //relatonal operator
        if(num1<num2){
                    System.out.println("true");

        }
        else{
                    System.out.println("false");

        }//out put false less than operator

        if(num1==num2){
                    System.out.println("true");

        }else{
                    System.out.println("false");

        }//outpust false
        boolean bool =num1<=num2  ;
        System.out.println(bool);//output false

        //and operator &&
        boolean check=num1<num2&&num2<num1+1;
                System.out.println(check);//output false
        // or operator ||

        boolean check1=num2==num1||num1>num2;
                System.out.println(check1);//the output is false because one condition is true
                System.out.println(!check1);//givint the outpust opposite because !

    }
}