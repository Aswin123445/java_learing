//sealed class provide permission to which class it should extends
sealed abstract class a permits b,c{
    abstract public void print();
}
final class b extends a{
    public void print(){
        System.out.println("helo");
    }
}
non-sealed class c extends a{
    public void print(){
        System.out.println("hi");
    }
}
class MainF{
    public static void main(String args[]){

    }
}