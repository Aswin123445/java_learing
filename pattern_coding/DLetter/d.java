import java.util.Scanner;
class InOut{
    public void outputSameLine(String data){
        System.out.print(data);
    }
    public void outputNextLine(String data){
        System.out.println(data);
    }
}
class DLogic{
    public void logicOfD(InOut inputOutput){
       for(int dRows=0;dRows<8;dRows++){
        for(int dColumns=0;dColumns<5;dColumns++){
            try{
            if((dRows==0||dRows==7)){
                if(dColumns!=4){

                
                inputOutput.outputSameLine("*");
                inputOutput.outputSameLine(" ");
                Thread.sleep(200);}
            }
            else{
                if(dColumns==0||dColumns==4){
                 inputOutput.outputSameLine("*");
                 inputOutput.outputSameLine(" ");

                 Thread.sleep(200);
                }
                else
                 inputOutput.outputSameLine("  ");
            }
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
       }
               inputOutput.outputNextLine("");

       }
    }
}
class MainF{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        InOut inputOutput=new InOut();
        DLogic dLogic=new DLogic();
        try{
            inputOutput.outputNextLine("going to print Letter D");
            dLogic.logicOfD(inputOutput);

        }catch(Exception e){
            inputOutput.outputNextLine("error");
        }finally{
            sc.close();
        }
    }
}