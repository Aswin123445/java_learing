import java.util.Scanner;
class InOut{
    public void outputSameLine(String stringData){
        System.out.print(stringData);
    }
    public void outputNextLine(String stringData){
        System.out.println(stringData);
    }
    public String inputString(Scanner sc){
        return sc.nextLine();
    }
}
class StringLogic{
    public void logicOfString(String data,InOut inputOutput,int length){
        for(int stringLength=0;stringLength<length;stringLength++){
            for(int stringColum=0;stringColum<=stringLength;stringColum++){
                inputOutput.outputSameLine(Character.toString(data.charAt(stringColum)));
            }
            inputOutput.outputNextLine("");
        }
    }
}
class MainFuntion{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        InOut inputOutput=new InOut();
        StringLogic stringLogic=new StringLogic();
        String data;
        int length;
        try{
           inputOutput.outputNextLine("Enter the String");
           data=inputOutput.inputString(sc);
           length=data.length();
           stringLogic.logicOfString(data,inputOutput,length);
        }catch(Exception e){
            inputOutput.outputNextLine("some error occutred");
        }finally{
            sc.close();
        }
    }
}