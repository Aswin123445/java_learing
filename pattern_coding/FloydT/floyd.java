import java.util.Scanner;
class InOut{
    public void outPutNextLine(String stringData){
        System.out.println(stringData);
    }
    public void outPutSameLine(String stringData){
        System.out.print(stringData);
    }
    public int inputInt(Scanner sc){
        return sc.nextInt();
    }
}
class FloydLogic{
    public void logicOfFloyd(int floydRows,InOut inputOutput){
        int count=1;
        for(int fRows=0;fRows<floydRows;fRows++){
            for(int fColoums=0;fColoums<=fRows;fColoums++){
                try{
                inputOutput.outPutSameLine(Integer.toString(count)+" ");
                Thread.sleep(600);
                count++;
                }catch(InterruptedException e){
                    Thread.currentThread().interrupt();
                }
            }
            inputOutput.outPutNextLine("");
        }
    }
}
class MainFuntion{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        InOut inputOutput=new InOut();
        FloydLogic floydLogic=new FloydLogic();
        int length;
        try{
            inputOutput.outPutNextLine("Enter the size of Floyd's Triangle");
            length=inputOutput.inputInt(sc);
            inputOutput.outPutNextLine("showing below th floyd's Triagle");
            floydLogic.logicOfFloyd(length,inputOutput);

        }catch(Exception e){
            inputOutput.outPutNextLine("something happend");
        }finally{
            sc.close();
        }
    }
}