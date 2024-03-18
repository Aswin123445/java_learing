import java.util.Scanner;
class InOut{
    public void outputDataSameline(String stringData){
        System.out.print(stringData);
    }
    public void outputDataNextline(String stringData){
        System.out.println(stringData);
    }
    public int inputInt(Scanner sc){
        return sc.nextInt();
    }
}
class PyramidLogic{
    public void logicOfPyramid(int length,InOut inputOutput){
        int decrementer=length;
        for(int rowsPyramid=0;rowsPyramid<length;rowsPyramid++){
            int count=1;
            for(int columsPyramid=0;columsPyramid<decrementer;columsPyramid++){
                inputOutput.outputDataSameline(Integer.toString(count));
                count++;
            }
            decrementer--;
            inputOutput.outputDataNextline("");
        }
    }
    public void logicOfPyramidSame(int length ,InOut inputOutput){
        int decrementer=length;
        for(int rowsPyramid=0;rowsPyramid<length;rowsPyramid++){
            for(int columsPyramid=0;columsPyramid<decrementer;columsPyramid++){
                inputOutput.outputDataSameline(Integer.toString(decrementer));

            }
            decrementer--;
            inputOutput.outputDataNextline("");

        }
    }
}
class HelperClass{
    public int caseFuntionDataInput(InOut inputOutput,Scanner sc){
       inputOutput.outputDataNextline("1  : Different number pyramid");
       inputOutput.outputDataNextline("2  : Same number pyramid");
       inputOutput.outputDataNextline("0  : Exit");
       return sc.nextInt();
    }
    public void caseFuntionImplementation(int decition,PyramidLogic logics,int length,InOut inputOutput){
        switch(decition){
            case 1 :
                {
                  logics.logicOfPyramid(length,inputOutput);
                  break;
                }
            case 2 :
                {
                    logics.logicOfPyramidSame(length,inputOutput);
                    break;
                }
            case 0 :
                {
                   inputOutput.outputDataNextline("Program exited");
                }
        }
    }
}
class MainFuntion{
    public static void main(String args[]){
        InOut inputOutput=new InOut();
        Scanner sc=new Scanner(System.in);
        PyramidLogic pyramidLogic=new PyramidLogic();
        HelperClass helperClass=new HelperClass();
        int length;
        int decition;
        try{
            inputOutput.outputDataNextline("enter the size of pyramid");
            length=inputOutput.inputInt(sc);
            do{
            decition=helperClass.caseFuntionDataInput(inputOutput,sc);
            helperClass.caseFuntionImplementation(decition,pyramidLogic,length,inputOutput);
            }while(decition!=0);
            //pyramidLogic.logicOfPyramid(length,inputOutput);

        }catch(Exception e){
            inputOutput.outputDataNextline("something went wrong");
        }finally{
            sc.close();
        }

    }
}