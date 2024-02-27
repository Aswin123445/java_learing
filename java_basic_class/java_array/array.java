class Array{
    public static void main(String args[]){
        //creating array
        int nums[]={20,12,30};
        //statically changing the number
        nums[2]=23;
        System.out.println(nums[2]);
        //printing all values
        for(int i=0;i<3;i++){
            System.out.println(nums[i]);
        }//print all vlaues

       //setting size of array dynamically
       int data[]=new int[3];
       //assigning values
       data[0]=4;
       data[1]=10;
       data[2]=30;
       System.out.println(data[2]);

       //2 dimensional array
       int arr2[][]=new int[2][2];
       for(int i=0;i<2;i++){
        for(int j=0;j<2;j++){
            arr2[i][j]=(int)(Math.random()*100);
                    System.out.print(arr2[i][j]+" ");

            
        }
        System.out.println();
       }

       //advanced loops
       for(int i[]:arr2){
        for(int j:i){
            System.out.print((j-1)+" ");
        }
        System.out.println();
       }
System.out.println();
       //jagged array this array won't specifiy colums
       int eg1[][]=new int[3][];
       eg1[0]=new int[2];
       eg1[1]=new int[3];
       eg1[2]=new int[1];
       for(int i[]:eg1){
        for(int j:i){
            j=(int)(Math.random()*10);
            System.out.print(j+" ");
        }
        System.out.println();
       }

    }
}