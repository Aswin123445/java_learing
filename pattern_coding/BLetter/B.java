import java.util.Scanner;
class InOut{
    public void outputSameLine(String data){
        System.out.print(data);
    }
    public void outputNextLine(String data){
        System.out.println(data);
    }
}
class BLogic{
  public void logic(InOut io){
    //loop for rows
    for(int rows=0;rows<7;rows++){
        //loop for clolums
        for(int columsStar=0;columsStar<5;columsStar++){
            switch(rows){
                case 0,6,3:
                    {
                        if(columsStar!=4){

                        
                          io.outputSameLine("*");
                          try {
                Thread.sleep(100); // Adjust the delay time (in milliseconds) as needed
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
                          break;
                        }
                    }
                case 1,2,4,5:
                    {
                        if(columsStar==0||columsStar==4){
                          io.outputSameLine("* ");
                          break;
                        }
                        else
                          io.outputSameLine(" ");
                        break; 
                    }
                default :
                    {
                          break;
                    }
            }
        }
        io.outputNextLine("");
    }
  }
}
class MainF{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        InOut io=new InOut();
        BLogic bl=new BLogic();
        try{
            io.outputNextLine("printing letter b");
            bl.logic(io);
        }catch(Exception e){

        }finally{
            sc.close();
        }
    }
}