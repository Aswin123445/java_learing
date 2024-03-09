import java.util.Scanner;
class RightAnglePattern{
  
  
    public void starMaking(int length){
        for(int i=0;i<length;i++){
            for(int j=0;j<i+1;j++){
               System.out.print("*");
            }
            System.out.println();
        }
    }

}
class InputOutPut{
    Scanner sc=new Scanner(System.in);
    public void output(String data){
       System.out.println(data);
    }
    public String inputString(){
        String s=sc.nextLine();
        return s;
    }
    public int inputInt(){
        int i=sc.nextInt();
        return i;
    }

}
class mainFuntion{
    public static void main(String args[]){
        System.out.println("welcome");
        InputOutPut io=new InputOutPut();
        RightAnglePattern rp=new RightAnglePattern();
        io.output("Enter Height of Right angle triangle");
        int i;
        i=io.inputInt();
        rp.starMaking(i);
        
    }
}