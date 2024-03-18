class InOut{
    public void outputSameLine(String data){
        System.out.print(data);
    }
    public void outputNextLine(String data){
        System.out.println(data);
    }
}
class TriangleLogic {
    public void logicOfTriangle(InOut inputOutput, int rows, int columns) {
        int leftColumnCount = 3, leftRowCount = 0, rightColumnCount = 4, rightRowCount = 1;
        for (int starRow = 0; starRow < rows; starRow++) {
            for (int starColumn = 0; starColumn < columns; starColumn++) {
                if ((starColumn == leftColumnCount) && (starRow == leftRowCount)) {
                    inputOutput.outputSameLine("*");
                    leftColumnCount--;
                    leftRowCount++;
                } else if ((starColumn == rightColumnCount) && (starRow == rightRowCount)) {
                    inputOutput.outputSameLine("*");
                    rightColumnCount++;
                    rightRowCount++;
                } else if ((starRow == 3) && (starColumn % 2 == 0)) {
                    inputOutput.outputSameLine("*");
                } else {
                    inputOutput.outputSameLine(" ");
                }
            }
            inputOutput.outputNextLine("");
        }
    }
}
class MainFuntion{
    public static void main(String args[]){
       InOut inputOutput=new InOut();
       TriangleLogic triangleLogic=new TriangleLogic();
       try{
        triangleLogic.logicOfTriangle(inputOutput,4,7);
       }catch(Exception e){
        inputOutput.outputSameLine("error occured");
       }
    }
}