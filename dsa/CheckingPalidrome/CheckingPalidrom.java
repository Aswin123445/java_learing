import java.util.Scanner;
class InputOutput{
    public void outPut(String stringData){
        System.out.println(stringData);
    }
    public String inputString(Scanner sc){
       return sc.nextLine();
    }
}
class PalidromeLogic{
    public boolean logicOfPalidrome(String stringData){
        int stringEnd=stringData.length()-1;
        int stringStart=0;
        boolean isPalidrome=false;
        while(stringStart<stringEnd){
            if(stringData.charAt(stringStart)==stringData.charAt(stringEnd)){
                isPalidrome=true;
            }
            else {
                isPalidrome=false;
                break;
            }
            stringEnd--;
            stringStart++;
        }
        return isPalidrome;

    }
}
class MainFuntion{
    public static void main(String args[]){
        boolean isPalidrome;
        PalidromeLogic palidromeLogic=new PalidromeLogic();
        Scanner sc=new Scanner(System.in);
        InputOutput inputOutput=new InputOutput();
        String stringData;
        try{
          inputOutput.outPut("enter a string want to check is it palidrome");
          stringData=inputOutput.inputString(sc);
          isPalidrome=palidromeLogic.logicOfPalidrome(stringData);
          System.out.println(isPalidrome==true?"string is a palidrmoe":"it is not a palidrome");
        }catch(Exception e ){
            inputOutput.outPut("something went wrong"+e);
        }finally {
            sc.close();
        }
        
    }
}