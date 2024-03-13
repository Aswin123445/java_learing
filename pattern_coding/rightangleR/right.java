package pattern_coding.rightangleR;

import java.util.Scanner;
class InOut{
    public void outPutFirstLine(String data){
        System.out.print(data);
    }
    public void outPutNextLine(String data){
        System.out.println(data);
    }
    public int inPutInt(Scanner sc){
       return sc.nextInt();
    }
    public String inPutString(Scanner sc){
        return sc.nextLine();
    }
}
class RightLogic{
    public void logic(int rowLength,InOut io){
        int star=rowLength;
        for(int rows=0;rows<=rowLength;rows++){
            for(int stars=0;stars<=star;stars++){
                io.outPutFirstLine("*");
                io.outPutFirstLine(" ");
            }
            star--;
            io.outPutNextLine("");
        }
    }
}
class MainRight{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    InOut io=new InOut();
    RightLogic rl=new RightLogic();
    int rows;
    try{
        io.outPutNextLine("Enter Number of Rows");
        rows=io.inPutInt(sc);
        rl.logic(rows,io);
    }catch(Exception e){
        io.outPutFirstLine(e.toString());
    }finally{
        sc.close();
    }
    }
    
}