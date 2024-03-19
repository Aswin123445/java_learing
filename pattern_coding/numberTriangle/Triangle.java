import java.util.Scanner;
class InputOutput{
    public void outputSameLine(String stringData){
        System.out.print(stringData);
    }
    public void outputNextLine(String stringData){
        System.out.println(stringData);
    }
    public int inputInt(Scanner sc){
        return sc.nextInt();
    }
}
class TriangleLogic{
    public void logicOfTriangle(InputOutput inputOutput,int startNumber){
        int counter=startNumber;
        for(int trianleRow=0;trianleRow<=startNumber;trianleRow++){
            for(int triangleColum=0;triangleColum<=trianleRow;triangleColum++){
                inputOutput.outputSameLine(""+counter+" ");
                
                counter++;
            }
            inputOutput.outputNextLine("");
        }
    }
}
class MainFuntion{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        InputOutput inputOutput=new InputOutput();
        TriangleLogic triangleLogic=new TriangleLogic();
        int startingNumber;
        try{
            inputOutput.outputNextLine("enter the number want to start with");
            startingNumber=inputOutput.inputInt(sc);
            inputOutput.outputNextLine("the right trianle are :");
            triangleLogic.logicOfTriangle(inputOutput,startingNumber);
        }catch(Exception e){
            inputOutput.outputNextLine("some error has occured "+e);
        }finally{
            sc.close();
        }
    }
}