class MinValueArray{
    public void logicOfMinValue(int [] array,int length){
        int less=array[0];
       for(int index=0;index<length;index++){
        if(array[index]<=less){
            less=array[index];
        }
       }
        System.out.println(less);
    }
}
class MainFuntion{
    public static void main(String args[]){
        MinValueArray minValueArray=new MinValueArray();
        int [] array={10,2,33,43,22};
        minValueArray.logicOfMinValue(array,5);
    }
}