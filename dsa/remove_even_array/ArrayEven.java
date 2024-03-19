import java.util.Scanner;
//program to remove even numbers from array
//can replace this code with in place modification
class InputOutput{
    public void outputString(String stringData){
        System.out.println(stringData);
    }
    public void outputArray(int[] array,int lengthOfArray){
        for(int index=0;index<lengthOfArray;index++){
            this.outputString(Integer.toString(array[index]));
        } 
    }
    public int[] inputArray(int lengthOfArray,Scanner sc){
        int[] array=new int[lengthOfArray];
        for(int index=0;index<lengthOfArray;index++){
            array[index]=sc.nextInt();
        }
        return array;
    }
    public int inputInt(Scanner sc){
        return sc.nextInt();
    }
}
class ArrayEvenRomoveLogic{
    public int [] newArray(int lengthOfArray,int[] existingArray,int newArrayLength){ 
        int newArrayCounter=0;
        int [] oddNewArray=new int[newArrayLength];
        for(int index=0;index<lengthOfArray;index++){
            if(existingArray[index]%2!=0){
                oddNewArray[newArrayCounter]=existingArray[index];
                newArrayCounter++;
            }
        }
        return oddNewArray;
    }
    public int newArrayLength(int[] existingArray,int lengthOfArray){
        int newLength=0;
        for(int index=0;index<lengthOfArray;index++){
            if(existingArray[index]%2!=0)
               newLength++;
        }
        return newLength;
    }
}
class ArrayEven{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        ArrayEvenRomoveLogic arrayEvenRemoveLogic=new ArrayEvenRomoveLogic();
        InputOutput inputOutput=new InputOutput();
        int[] existingArray;
        int lengthOfExistingArray;
        int lengthOfNewArray;
        try{
            inputOutput.outputString("Hello array operation");
            inputOutput.outputString("Enter length of Array");
            lengthOfExistingArray=inputOutput.inputInt(sc);
            existingArray=new int[lengthOfExistingArray];
            inputOutput.outputString("Enter elements of the array");
            existingArray=inputOutput.inputArray(lengthOfExistingArray,sc);
            inputOutput.outputString("Elements of the array include :");
            inputOutput.outputArray(existingArray,lengthOfExistingArray);
            lengthOfNewArray=arrayEvenRemoveLogic.newArrayLength(existingArray,lengthOfExistingArray);
            existingArray=arrayEvenRemoveLogic.newArray(lengthOfExistingArray,existingArray,lengthOfNewArray);
            inputOutput.outputString("new only odd array :");
            inputOutput.outputArray(existingArray,lengthOfNewArray);

        }catch(Exception e){
            inputOutput.outputString("somme error occured"+e);
        }finally{
            sc.close();
        }
    }
}