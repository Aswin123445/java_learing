class SecondLargeALogic{
    public void logicOfSecondLA(int [] array,int length){
        // int temp;
        // for(int index=0;index<=1;index++){
        //     for(int innerIndex=0;innerIndex<length;innerIndex++){
        //         if(array[innerIndex]>array[innerIndex+1]){
        //             temp=array[innerIndex+1];
        //             array[innerIndex+1]=array[innerIndex];
        //             array[innerIndex]=temp;
        //         }
        //     }
        // }
        //             System.out.println(array[length-1]);

        //another way
        int max=Integer.MIN_VALUE;
        int sMax=Integer.MIN_VALUE;
        for(int index=0;index<length;index++){
            if(array[index]>max){
                sMax=max;
                max=array[index];
            }else if(array[index]>sMax){
                sMax=array[index];
            }
        }
        System.out.println(sMax);
 
    }
}
class MainFuntion{
    public static void main(String args[]){
        SecondLargeALogic secondLargeALogic=new SecondLargeALogic();
        int [] array={3, 1, 4, 1, 5};
        secondLargeALogic.logicOfSecondLA(array,5);
    }
}