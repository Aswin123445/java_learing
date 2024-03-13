//in this code we print write angle with odd lines of star
import java.util.Scanner;
class StarPattern{
    public static void main(String args[]){
        int length;
        InOut inout=new InOut();
        PatterCode patternCode=new PatterCode();
        inout.Output("         Hello User");
        inout.Output("Enter the length of the right angle");
        length=inout.inputInt();
        patternCode.AnglePattern(length,inout);
        inout.Output("right angle printed sucessfully");
    } 
}
class PatterCode{
    public void AnglePattern(int length,InOut o){
        for(int outerLoop=0;outerLoop<length;outerLoop++){
            for(int innerLoop=0;innerLoop<=(outerLoop*2);innerLoop++){
                 o.OutPUt1("*");
            }
            o.Output("");
        }

    }
}
class InOut{
    Scanner sc=new Scanner(System.in);

    public void Output(String data){
         System.out.println(data);
    }
    public void OutPUt1(String data){
         System.out.print(data);

    }
    public int inputInt(){
        return sc.nextInt();
    }
}