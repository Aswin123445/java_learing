import java.util.Scanner;
class InputOutput{
    public void outputNextLine(String stringData){
       System.out.println(stringData);
    }
    public void outputArray(int []array,InputOutput inputOutput){
        for(int index=0;index<array.length;index++){
            inputOutput.outputNextLine(""+array[index]);
        }
    }
    public int[] inputArray(Scanner sc,int length){
        int [] array=new int[length];
        for(int index=0;index<length;index++){
            array[index]=sc.nextInt();
        }
        return array;
    }
    public int inputInt(Scanner sc){
        return sc.nextInt();
    }
    public int [] additionArray(Scanner sc,int newCapacity,int[] array,int olderLength){
       for(int index=olderLength;index<newCapacity;index++){
          array[index]=sc.nextInt();
       }
       return array;
    }
}
class ReSizer{
    public int [] reSizerLogic(int []array,int newCapacity){
        int [] newArray=new int[newCapacity+array.length];
        for(int index=0;index<array.length;index++){
            newArray[index]=array[index];
        }
        return newArray;
    }
}
class MainFuntion{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        InputOutput inputOutput=new InputOutput();
        ReSizer reSizer =new ReSizer();
        int lengthOfArray;
        int [] array;
        char decitionMaker;
        try{
            inputOutput.outputNextLine("Enter the maximum limit of the array");
            lengthOfArray=inputOutput.inputInt(sc);
            array=new int[lengthOfArray];
            inputOutput.outputNextLine("Enter the elements of the array");
            array=inputOutput.inputArray(sc,lengthOfArray);
            inputOutput.outputNextLine("do you want to add more elements to the array ? Y/N");
            decitionMaker=sc.next().charAt(0);
            if(decitionMaker =='Y'){
                int addElementsLength;
                inputOutput.outputNextLine("enter number of elements want to add");
                addElementsLength=sc.nextInt();
                array=reSizer.reSizerLogic(array,addElementsLength);
                inputOutput.outputNextLine("enter new element to the arry");
                array=inputOutput.additionArray(sc,array.length,array,lengthOfArray);
                inputOutput.outputNextLine("");
                inputOutput.outputArray(array,inputOutput);
            }
            else{
                inputOutput.outputArray(array,inputOutput);
                inputOutput.outputNextLine("thenks");
            }
        }catch(Exception e){
            inputOutput.outputNextLine("something went wrong"+e);
        }finally{
            sc.close();
        }
    }
}