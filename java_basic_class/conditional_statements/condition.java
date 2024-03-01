class condition {
    public static void main (String args[]){
        //if statement
        // if(false){
        //     System.out.println("check1");//this will never execute because condition should be true
        // }
         if(true){
            System.out.println("true");//this will eceucuted and output will be true
        }
        System.out.println("no");


        //printing the greatest value from given list

        //here we used else if ladder to do the logic
        int a=20,b=30,c=40;
        if((a>b)&&(a>c)){
             
            System.out.println("a as greater value");
        }
        else if((b>a)&&(b>c)){
             
            System.out.println("b is greater value");
        }
        else  {
            System.out.println("c is greatest");
        }

        //adult checker
        int adult=20;
        if(adult>18){
            System.out.println("adult");
        }else{
            System.out.println("child");
        }
        //discount calculator
        float discount=20f;
        float amount = 1000f;
        if(discount==0){
            System.out.println("no discount allowed");
        }
        else {
            float diamount=amount*20/100;
            System.out.println(diamount);
        }
       //ternary operator
       int tern=10;
        int ans=tern>12?30:40;
        System.out.println(ans);//output 4


        //swith statements
        //based on value swithc satement executes particular statement from given set
        int sw=2;
        switch(sw){
            case 1:
                System.out.println(" tuesday");
                break;
            case 2:
                System.out.println("mondey");//mondey will be the out put
                break;
            case 3:
                System.out.println("sunday");//output will be mondey and sunday because because ones the condition become true
                break;
                //it exucute all the other statements without checking case
                //so we must use break statements 
        }
    }

}