class InOut{
    public void outputSameLine(String data){
        System.out.print(data);
    }
    public void outputNextLine(String data){
        System.out.println(data);
    }
}
class LoveLogic{
    public void logicOfLove(InOut inputOutput){
        int leftRows=3,leftColums=1,rightColums=5,rightRows=3;
        for(int loveRows=0;loveRows<6;loveRows++){
            for(int loveColums=0;loveColums<7;loveColums++){
                if((loveRows==0)&&(loveColums%3!=0)){
                    inputOutput.outputSameLine("*");

                }
                else if((loveRows==1)&&(loveColums%3==0)){
                    inputOutput.outputSameLine("*");
                }
                else if((loveRows==2)&&(loveColums%6==0)){
                    inputOutput.outputSameLine("*");
                }
                else if((loveRows==leftRows)&&(loveColums==leftColums)){
                    inputOutput.outputSameLine("*");
                    leftRows++;
                    leftColums++;
                }
                else if((loveRows==rightRows)&&(loveColums==rightColums)){
                    inputOutput.outputSameLine("*");
                    rightColums--;
                    rightRows++;
                }
                else{
                    inputOutput.outputSameLine(" ");
                }
            }
            inputOutput.outputNextLine("");
        }
    }
}
class MainFuntion{
    public static void main(String args[]){
InOut inputOutput=new InOut();
    LoveLogic loveLogic=new LoveLogic();
    try{
         loveLogic.logicOfLove(inputOutput);
    }catch(Exception e){
       inputOutput.outputNextLine("some error has occured"+e);
    }
    }
    
    
}