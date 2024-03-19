class ReverseLogic{
    public void logicOfReverseArray(int [] array,int length){
        int arrayStart=0;
        int arrayEnd=length-1;
        int temp;
        while(arrayStart<arrayEnd){
            temp=array[arrayStart];
            array[arrayStart]=array[arrayEnd];
            array[arrayEnd]=temp;
            arrayStart++;
            arrayEnd--;
        }
        for(int arrayIndex=0;arrayIndex<length;arrayIndex++){
            System.out.println(array[arrayIndex]);
        }
    }
}
class MainFuntion{
    public static void main(String args[]){
        ReverseLogic reverseLogic=new ReverseLogic();
        int [] array={10,20,33,43,22};
        reverseLogic.logicOfReverseArray(array,5);
    }
}