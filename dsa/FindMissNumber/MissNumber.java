import java.util.Scanner;
class InputOutput{
    public void outputArray(int []array){
        try{
        for(int index=0;index<array.length;index++){
            System.out.println(array[index]);
            Thread.sleep(300);
        }
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
    public int inputInt(Scanner sc){
        return sc.nextInt();
    }
    public void outputNextLine(String stringData){
        System.out.println(stringData);
    }
    public int [] inputArray(int length,Scanner sc){
        int[] array=new int[length];
        for(int index=0;index<array.length;index++){
            array[index]=sc.nextInt();
        }
        return array;
    }
}
class MissingNumberLogic{
    public int logicOfMissingNumber(int[] array,int range){
       for(int rangeIndex=1;rangeIndex<=range;rangeIndex++){
         int arrayIndex=0;
         boolean isContain=false;
         while(arrayIndex<array.length){
            if(array[arrayIndex]==rangeIndex){
                isContain=true;
            }
            arrayIndex++;
         }
         if(isContain==false){
            return rangeIndex;
         }
       }
       return -1;
    }
}
class MissingNumberLogicTwo{
    public int logicOfMissingNumber(int[]array,int range){
        int sumOfRange=(range*(range+1))/2;
        int sumOfArray=0;
        for(int indexOfArray=0;indexOfArray<array.length;indexOfArray++){
            sumOfArray=sumOfArray+array[indexOfArray];
        }
        return sumOfRange-sumOfArray;
    }
}
class MainFuntion{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        InputOutput inputOutput=new InputOutput();
        MissingNumberLogic missingNumberLogic=new MissingNumberLogic();
        MissingNumberLogicTwo MissingNumberLogicTwo=new MissingNumberLogicTwo();
        int numberRange;
        int [] array;
        int missingNumber=0;
        int logicChecker;
        try{
            inputOutput.outputNextLine("enter the range of numbers");
            numberRange=inputOutput.inputInt(sc);
            array=new int[numberRange-1];
            inputOutput.outputNextLine("enter elements the not contain one element and number must be within the range");
            array=inputOutput.inputArray(numberRange-1,sc);
            inputOutput.outputNextLine("which logic want to apply 1 or 2");
            logicChecker=inputOutput.inputInt(sc);
            switch(logicChecker){
                case 1:
                    missingNumber=missingNumberLogic.logicOfMissingNumber(array,numberRange);
                    break;
                case 2:
                    missingNumber=MissingNumberLogicTwo.logicOfMissingNumber(array,numberRange);
                    break;
                default :
                    System.out.println("something went wrong");
            }
            
            inputOutput.outputNextLine(" the number you have missed  :"+missingNumber);
        }catch(Exception e){
            inputOutput.outputNextLine("error happend"+e);
        }finally{
            sc.close();
        }
    }
}