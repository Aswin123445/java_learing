import java.util.Scanner;
class InOut{
    public void outputSameLine(String data){
        System.out.print(data);
    }
    public void outputNextLine(String data){
        System.out.println(data);
    }
    public int inputInt(Scanner sc){
        return sc.nextInt();
    }
}
class NumberLogic{
   public void logicOfNumber(int maxNumber,InOut inputOutput ){
        for(int numberRow=0;numberRow<maxNumber;numberRow++){
            //printing spaces
            int leftNumverPrint=numberRow+1;
            int rightNumberPrint=2;
            for(int space=0;space<(maxNumber-numberRow-1);space++){
                inputOutput.outputSameLine(" ");
            }
            for(int leftNumber=0;leftNumber<=numberRow;leftNumber++){
                inputOutput.outputSameLine(""+leftNumverPrint);
                leftNumverPrint--;
            }
            for(int rightNumber=1;rightNumber<=numberRow;rightNumber++){
                inputOutput.outputSameLine(""+rightNumberPrint);
                rightNumberPrint++;
            }
            inputOutput.outputNextLine("");
        }
   }
}
class MainFuntion{
    public static void main(String args[]){
        InOut inputOutput=new InOut();
        Scanner sc=new Scanner(System.in);
        NumberLogic numberLogic=new NumberLogic();
        int maxNumber;
        try{
            inputOutput.outputNextLine("enter the maximum number ");
            maxNumber=inputOutput.inputInt(sc);
            numberLogic.logicOfNumber(maxNumber,inputOutput);
        }catch(Exception e){
            inputOutput.outputNextLine("some error occured"+e);
        }finally{
            sc.close();
        }
    }
}