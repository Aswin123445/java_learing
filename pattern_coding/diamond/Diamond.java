import java.util.Scanner;
class InOut{
    public void outPutNextLine(String data){
        System.out.println(data);
    }
    public void outPutSameLine(String data){
        System.out.print(data);
    }
    public int inPutInt(Scanner sc){
        return sc.nextInt();
    }
    public String inPutString(Scanner sc){
        return sc.nextLine();
    }
}
class Diamond{
    public static void main(String args[]){
        int rows;
        InOut io=new InOut();
        Scanner sc=new Scanner(System.in);
        DiamondLogic dl=new DiamondLogic();
        try{
            io.outPutNextLine("Enter Number of Rows");
            rows=io.inPutInt(sc);
            dl.logic(rows,io);
            dl.logicRev(rows-1,io);
        }
        catch(Exception e){
            io.outPutSameLine(e.toString());
        }
        finally{
            sc.close();
        }
    }
}
class DiamondLogic{
    public void logic(int rowsLength,InOut io){
        int spaceRow=rowsLength;
        for(int rows=0;rows<rowsLength;rows++){
            for(int space=spaceRow;space>0;space--){
                io.outPutSameLine(" ");
            }
            for(int star=0;star<=rows;star++){
                io.outPutSameLine("*");
                io.outPutSameLine(" ");
        }
            io.outPutNextLine("");
            spaceRow--;  
        }
    }
    public void logicRev(int rowsLength,InOut io){
        int outStar=rowsLength;
        for(int rows=0;rows<rowsLength;rows++){
            for(int space=0;space<=rows+1;space++){
                io.outPutSameLine(" ");
            }
            for(int star=outStar;star>0;star--){
                io.outPutSameLine("*");
                io.outPutSameLine(" ");
            }
            outStar--;
            io.outPutNextLine("");
        }

    }
}