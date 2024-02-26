class whileloop{
    public static void main(String args[]){
      
        int i=1;
        int no=20;
        while(i<=no){
            System.out.println(i);
            i++;
        }//print number from 1 to 20 
        i=1;

        //nested while loop
        while(i<20){
            int j=i;
            System.out.print(i +": ");
            while(j>=0){
                System.out.print(j+",");
                j--;

            }
            i++;
            System.out.println();
        }
    }
}