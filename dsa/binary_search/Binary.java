package dsa.binary_search;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        InputOutput inputOutput=new InputOutput();
        BinarySearchLogic binarySearchLogic=new BinarySearchLogic();
        int length,target;
        int [] array;
        int ans;
        try{
             inputOutput.outputStringNextLine("      program to search for elemets in Binary search");
             inputOutput.outputStringNextLine("Enter total number of elemets");
             length=inputOutput.inputData(sc);
             inputOutput.outputStringNextLine("Enter each elemts in asending order");
             array=new int[length];
             array=inputOutput.binaryArrayInput(length, sc);
             inputOutput.outputStringNextLine("Entered elemets are :");
             inputOutput.binaryArrayOutput(length,array);
             inputOutput.outputStringNextLine("Enter the number to search");
             target=inputOutput.inputData(sc);
             ans=binarySearchLogic.searchLogic(array,length,target);
             if(ans==-1)
                inputOutput.outputStringNextLine("cannot find  number "+target+" in Array");
             else 
                inputOutput.outputStringNextLine("element found at index :"+ans);
        }catch(Exception e){
            inputOutput.outputStringNextLine("some error has occured");
        }finally{
            sc.close();
        }
    }
    
}
class InputOutput{
    public void outputStringNextLine(String outputString){
        System.out.println(outputString);
    }
    public int inputData(Scanner sc){
        return sc.nextInt();
    }
    public int[] binaryArrayInput(int length,Scanner sc){
        int[] array=new int[length];
        for(int index=0;index<length;index++){
            array[index]=sc.nextInt();
        }
        return array;
    }
    public void binaryArrayOutput(int length,int [] array){
        try{
        for(int index=0;index<length;index++){
            this.outputStringNextLine("Data at index "+index+" :"+array[index]);
            Thread.sleep(500);
        }
    }catch(InterruptedException e){
        Thread.currentThread().interrupt();
    }

    }
}
class BinarySearchLogic{
    public int searchLogic(int []array,int length,int target){
        int startPoint=0;
        int endPoint=length-1;
        int mid;
        while (startPoint<=endPoint) {
             mid=(startPoint+endPoint)/2;
            if(array[mid]==target)
               return mid;
            else if(target<array[mid])
               endPoint=mid-1;
            else
              startPoint=mid+1;
        }
        return -1;
    }

}
