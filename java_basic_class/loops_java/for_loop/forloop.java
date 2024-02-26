class forloop{
    public static void main(String args[]){
        //for loops is used for repeating a task 
        //multiple times based on condition
        //java use keyword for for it
        int no=20;
        for(int i=0;i<no;i++){
            System.out.println(i+1);
           //print number from 1 to 2o
        }
        //nested for loop
        int height=4;
        for (int i=0;i<height;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            System.out.println();
            //print * in assending order
        }
    }
}