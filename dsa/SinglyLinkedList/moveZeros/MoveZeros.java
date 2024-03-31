//moving zeros at last of array
class MoveZeros{
    public void moveZeros(int []array,int length){
        // int arrayEnd=length-1;
        // int tempLength=length;
        // for(int index=0;index<tempLength;index++){
        //     if(array[index]==0){
        //        int temp=array[arrayEnd];
        //        array[arrayEnd]=array[index];
        //        array[index]=temp;
        //        arrayEnd--;
        //        tempLength--;
        //     }
        // }
        // for(int index=0;index<5;index++){
        //     System.out.println(array[index]);
        // }
        
        //this is other type and it si more efficient
        int zeroIndex=0;
       for(int nonZeroIndex=0;nonZeroIndex<length;nonZeroIndex++){
        if(array[nonZeroIndex]!=0&&array[zeroIndex]==0){
           int temp=array[nonZeroIndex];
           array[nonZeroIndex]=array[zeroIndex];
           array[zeroIndex]=temp;
        }
        if(array[zeroIndex]!=0){
            zeroIndex++;
        }
       }
       for(int index=0;index<length;index++)
         System.out.println(array[index]);
    }
    
}
class MainFuntion{
    public static void main(String args[]){
        MoveZeros moveZeros=new MoveZeros();
        int [] array={0,7,2,44,22};
        moveZeros.moveZeros(array,5);
        
    }
}