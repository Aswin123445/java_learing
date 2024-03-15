class InOut{
    public void outputSameLine(String data){
        System.out.print(data);
    }
    public void outputNextLine(String data){
        System.out.println(data);
    }
}
class HLogic{
    public void logicOfH(int rows,int colums,InOut inputOutput){
        for(int hRows=0;hRows<rows;hRows++){
            for(int hColums=0;hColums<colums;hColums++){
                if(hRows!=3){
                    if(hColums==0||hColums==4){
                        inputOutput.outputSameLine("* ");
                    }
                    else{
                        inputOutput.outputSameLine("  ");
                    }
                }
                else{
                    inputOutput.outputSameLine("* ");
                }
            }
            inputOutput.outputNextLine("");
        }
    }
}
class MainFuntion{
    public static void main(String args[]){
InOut inputOutput=new InOut();
    HLogic hLogic=new HLogic();
    hLogic.logicOfH(7,5,inputOutput);
    }
    
}