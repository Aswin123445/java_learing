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
    public void logicOfNumber(InOut inputOutput,int rowsOfPattern){
       
        for(int numberRow=0;numberRow<rowsOfPattern;numberRow++){
             int incrementer=rowsOfPattern-1;
            int firstNumber=numberRow+1;
            for(int numberColum=0;numberColum<=numberRow;numberColum++){
                inputOutput.outputSameLine(""+firstNumber+" ");
                firstNumber=firstNumber+incrementer;
                incrementer--;
            }
           
            inputOutput.outputNextLine("");
        }
    }
}
class MainFuntion {
    public static void main(String args[]){
        InOut inputOutput=new InOut();
        NumberLogic numberLogic=new NumberLogic();
        Scanner sc=new Scanner(System.in);
        int rows;
        inputOutput.outputNextLine("enter number of rows you want to print the data");
        rows=inputOutput.inputInt(sc);
        numberLogic.logicOfNumber(inputOutput,rows);

    }
}