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
class DiamondLogic{
    public void logicOfDiamond(int startingSize,InputOutput inputOutput){
    //     int decrementer=startingSize;
    //     int number=startingSize;
    //     int number2=(startingSize*2-1);
    //    for(int diamondRow=0;diamondRow<=startingSize*2;diamondRow++){
    //     if(diamondRow<=startingSize){
    //     for(int incrementColum=0;incrementColum<=diamondRow;incrementColum++){
    //         inputOutput.outputSameLine(" "+number);
    //      }
    //      number++;
    //     }if(diamondRow>startingSize){
    //         for(int decrementColum=0;decrementColum<decrementer;decrementColum++){
    //           inputOutput.outputSameLine(" "+number2);
    //         }
    //         number2--;
    //         decrementer--;
    //     }
    //     inputOutput.outputNextLine("");
    //    }
    int numberIncrement=startingSize;
    for(int incrementRow=0;incrementRow<=startingSize;incrementRow++){
        for(int incrementColum=0;incrementColum<=incrementRow;incrementColum++){
            inputOutput.outputSameLine(""+numberIncrement);
        }
        numberIncrement++;
        inputOutput.outputNextLine("");
    }
    int decrementIndex=startingSize;
    int decrementNumber=startingSize*2-1;
    for(int decrementRow=0;decrementRow<startingSize;decrementRow++){
        for(int decrementColum=0;decrementColum<decrementIndex;decrementColum++){
           inputOutput.outputSameLine(""+decrementNumber);
        }
        decrementNumber--;
        decrementIndex--;
        inputOutput.outputNextLine("");
    }
  }
}
class MainFuntion{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        InputOutput inputOutput=new InputOutput();
        DiamondLogic diamondLogic=new DiamondLogic();
        int maxNumber;
        try{
           inputOutput.outputNextLine("enter the max size");
           maxNumber=inputOutput.inputInt(sc);
           diamondLogic.logicOfDiamond(maxNumber,inputOutput);
        }catch(Exception e){
            inputOutput.outputNextLine("some error occured"+e);
        }finally{
            sc.close();
        }
    }
}