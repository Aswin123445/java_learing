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
        for(int dRows=0;dRows<7;dRows++){
            for(int dColumns=0;dColumns<5;dColumns++){
                try{
                if(dRows%3==0){
                    inputOutput.outputSameLine("*");
                    Thread.sleep(200);
                }
                if((dColumns==0)&&(dRows%3!=0)){
                    inputOutput.outputSameLine("*");
                    Thread.sleep(200);
                }
              }catch(InterruptedException e){
                Thread.currentThread().interrupt();
              }
            }
            inputOutput.outputNextLine("");
        }
    }
}
class MainF {
    public static void main(String args[]){
        InOut inputOutput=new InOut();
        DLogic logic=new DLogic();
        logic.logicOfD(inputOutput);
        try{

        }catch(Exception e){
            inputOutput.outputNextLine("some error occured");
        }
    }
}