import java.util.Scanner;
class InOut{
   public void outPut(String data){
    System.out.print(data);
   }
   public void OutPUt1(String data){
         System.out.println(data);

    }
   public int inPutInt(Scanner sc){
    return sc.nextInt(); 
   }
   public String inPutString(Scanner sc){
    return sc.nextLine();
   }
}
class ReversePyramid{
    public void Pyramid(InOut io,int length){
        
       for(int innerLayer=0;innerLayer<=length;innerLayer++){
        for(int space=0;space<innerLayer;space++){
            io.outPut(" ");
        }
        for(int star=length-innerLayer;star>0;star--){
           io.outPut("*");
           io.outPut(" ");
        }
        io.OutPUt1("");
       }
    }
}
class ReversePyramidMain{
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
         InOut io=new InOut();
         
        try{
            ReversePyramid rp=new ReversePyramid();
            int length;
          
            io.outPut("Enter length");
            length=io.inPutInt(sc);
            rp.Pyramid(io,length);
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            sc.close();
            
        }

    }
}