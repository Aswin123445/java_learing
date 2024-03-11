import java.util.Scanner;
class InOut{
    public void outPutSameLine(String data){
        System.out.print(data);
    }
    public void outPutNextLine(String data){
        System.out.println(data);
    }
    public int inPutInt(Scanner sc){
        return  sc.nextInt();
    }
    public String inPutString(Scanner sc){
        return  sc.nextLine();
    }
}
class LetterA{
    public  void LoginA(InOut io){
       for(int rows=0;rows<=6;rows++){
         for(int colums=0;colums<=4;colums++){
            switch(rows){
                case 0 :
                    {
                        if(colums==0||colums==4){

                          io.outPutSameLine(" ");
                          break;
                       }

                        io.outPutSameLine("* ");
                        break;
                    }
                case 1 :
                    {
                        if(colums==0||colums==4)
                          io.outPutSameLine("* ");
                        io.outPutSameLine(" ");
                        break;
                    }
                case 2 :
                    {
                        if(colums==0||colums==4)
                          io.outPutSameLine("* ");
                        io.outPutSameLine(" ");    
                        break;                  
                    }
                case 3 :
                    {
                        if(colums==4)
                          break;
                        io.outPutSameLine("* ");
                        break;
                    }
                case 4 :
                    {
                        if(colums==0||colums==4)
                          io.outPutSameLine("* ");
                        io.outPutSameLine(" ");    
                        break;                  
                    }
                case 5 :
                    {
                        if(colums==0||colums==4)
                          io.outPutSameLine("* ");
                        io.outPutSameLine(" ");    
                        break;                  
                    }
                case 6 :
                    {
                        if(colums==0||colums==4)
                          io.outPutSameLine("* ");
                        io.outPutSameLine(" ");    
                        break;                  
                    }
                default :
                  break;
            }
         }
         io.outPutNextLine("");
       }
    }
}
class MainA{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      InOut io=new InOut();
      LetterA la=new LetterA();
      try{
        io.outPutNextLine("code to print A");
        la.LoginA(io);

      }catch(Exception e){

      }finally{
        sc.close();
      }
   }
}