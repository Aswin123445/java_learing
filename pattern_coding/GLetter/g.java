package pattern_coding.GLetter;

class g{ 
    public static void main(String[] args) {
        InOut inputOutpue=new InOut();
        GLogic gLogic=new GLogic();
        try{
            gLogic.logicOfG(inputOutpue, 6, 7);
        }catch(Exception e){}
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
class GLogic{
    public void logicOfG(InOut inputOutput,int colums,int rows){
        for(int gRows=0;gRows<rows;gRows++){
           for(int gColoums=0;gColoums<colums;gColoums++){
               if((gRows==0||gRows==6)&&gColoums!=5){
                inputOutput.outputSameLine("* ");
               }
               if(gRows==5||gRows==4){
                if((gColoums==0||gColoums==4))
                  inputOutput.outputSameLine("* ");
                else
                  inputOutput.outputSameLine("  ");
               }
               if((gRows==1||gRows==2)&&gColoums==0){
                 inputOutput.outputSameLine("*");
               }
               if(gRows==3){
                 if(gColoums==0)
                   inputOutput.outputSameLine("*");
                 else if(gColoums<3)
                  inputOutput.outputSameLine("  ");
                 else if(gColoums>2)
                  inputOutput.outputSameLine("* ");
                 
               }
              
               
           }
           inputOutput.outputNextLine("");
        }
    }
}