package pattern_coding.FLetter;

public class f {
    public static void main(String[] args) {
        InOut inputOutput=new InOut();
        FLogic fLogic=new FLogic();
        try{
            inputOutput.outputNextLine("printing letter f");
            fLogic.LogicOfF(7, 5, inputOutput);
        }catch(Exception e){
            inputOutput.outputNextLine("something went wrong");
        }
    }
    
}
class InOut{
    public void outputSameLine(String data){
        System.out.print(data);
    }
    public void outputNextLine(String data){
        System.out.println(data);
    }
}
class FLogic{
    public void LogicOfF(int eRows,int eColums,InOut inputOutput){
        for(int rows=0;rows<eRows;rows++){
            for(int colums=0;colums<eColums;colums++ ){
                if(rows==0||rows==3){
                    inputOutput.outputSameLine("*");
                }
                else if(colums==0){
                    inputOutput.outputSameLine("*");
                }
            }
            inputOutput.outputNextLine("");
        }
    }
}

