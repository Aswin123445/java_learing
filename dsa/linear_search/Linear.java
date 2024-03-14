package dsa.linear_search;

import java.util.Scanner;

class Linear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        InOut inputOutput=new InOut();
        LinearLogic linearLogic=new LinearLogic();
        int length;
        int searchElement;
        int arr[];
        int result;
        try{
               inputOutput.outputNextLine("Enter Size of array");
               length=inputOutput.inputData(sc);
               arr=new int[length];
               arr=inputOutput.inputArrayInAsend(sc, length);
               inputOutput.outputNextLine("the array elemets are");
               inputOutput.outputArrayNextLine(length, arr);
               inputOutput.outputNextLine("Enter the element want to search");
               searchElement=inputOutput.inputData(sc);
               result=linearLogic.Logic(arr, searchElement, length);
               if(result==-1){
                inputOutput.outputNextLine("Item not found");
               }
               else{
                inputOutput.outputNextLine("itme found at index "+result);
               }
        }catch(Exception e){
            inputOutput.outputNextLine("error ocurred"+e);
        } finally{
            sc.close();
        }
    }
    
}
class LinearLogic{
    public int Logic(int[] arr,int searchElement,int length){
        for(int index=0;index<length;index++){
            if(arr[index]==searchElement){
               return index;
            }
        }
        return -1;
    }
}
class InOut{
    public void outputNextLine(String data){
        System.out.println(data);
    }
    public int inputData(Scanner sc){
        return sc.nextInt();
    }
    public int[] inputArrayInAsend(Scanner sc,int length){
        int arr[]=new int[length];
        this.outputNextLine("Please Enter the Data ");
        for(int index=0;index<length;index++){
            
            arr[index]=sc.nextInt();
        }
        return arr;
    }
    public void outputArrayNextLine(int length,int[] arr){
        for(int index=0;index<length;index++){
            this.outputNextLine(Integer.toString(arr[index]));
        }
    }
}

