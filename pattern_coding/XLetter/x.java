class InOut{
    public void outputSameLine(String data){
        System.out.print(data);
    }
    public void outputNextLine(String data){
        System.out.println(data);
    }
}
class XLogic{
    public void logicOfX(int rows,int colums,InOut inputOutput){
        int i=0,j=4;
        for(int xRows=0;xRows<rows;xRows++){
            for(int xColoums=0;xColoums<colums;xColoums++){
                
                 if(xRows==i&&xColoums==j)
                {
                    inputOutput.outputSameLine("* ");
                    i++;
                    j--;
                }
               else if(xRows==xColoums){
                    inputOutput.outputSameLine("* ");
                }
                
                else
                   inputOutput.outputSameLine("  ");
            }
            inputOutput.outputNextLine("");
        }
    }
}
class MainFuntion{
    public static void main(String args[]){
        InOut inputOutput=new InOut();
        XLogic xLogic=new XLogic();
        xLogic.logicOfX(5,5,inputOutput);
    }
}