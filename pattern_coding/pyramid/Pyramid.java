import java.util.Scanner;
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
class PyramidPattern{
    public void Pyramid(int length,InOut inout){
        int space=length;
        for (int outerLoop = 0; outerLoop < length; outerLoop++) {
          for (int loop=space;loop>=0;loop--) {
            inout.OutPUt1(" ");
          }
          for (int innerLoop = 0; innerLoop<=outerLoop; innerLoop++) {
            inout.OutPUt1("*");
            inout.OutPUt1(" ");
          }
          // Move to the next line
          inout.Output("");
          space--;
        }
    }
}
class Pyramid{
    public static void main(String args[]){
        PyramidPattern pp=new PyramidPattern();
        InOut io=new InOut();
        int length;
        io.Output("enter the length");
        length=io.inputInt();
        pp.Pyramid(length,io);

   
    }
}