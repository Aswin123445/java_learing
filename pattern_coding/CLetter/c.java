import java.util.Scanner;
class InOut{
    public void outputSameLine(String data){
        System.out.print(data);
    }
    public void outputNextLine(String data){
        System.out.println(data);
    }
}
class CLogic{
    public void logicOfC(InOut inputOutput){
        try{
        for(int cRows=0;cRows<8;cRows++){
            for(int cColums=0;cColums<6;cColums++){
                if(cRows==0||cRows==7){
                    if(cColums==0)
                      inputOutput.outputSameLine(" ");
                   inputOutput.outputSameLine("*");
                   Thread.sleep(200);
                }
                  
                if((cColums==0)&&((cRows!=0)&&cRows!=7)){
                  inputOutput.outputSameLine("*");
                  Thread.sleep(200);
                }
            }
            inputOutput.outputNextLine("");

        }
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
class MainClass{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        InOut inputOutput=new InOut();
        CLogic cLogic=new CLogic();
        try{
           inputOutput.outputNextLine("print letter c");
           cLogic.logicOfC(inputOutput);
        }catch(Exception e){
              inputOutput.outputNextLine("some error has occured");
        }finally{
            sc.close();
        }
    }
}