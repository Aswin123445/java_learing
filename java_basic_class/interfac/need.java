class Developer{
    public void code(Computer c){
        c.cod();

    }
}
interface  Computer {
    void cod();
}
class Des implements Computer{
    public void cod(){
        System.out.println("codeing in Des");
    }
}
class lap implements Computer{
    public void cod(){
        System.out.println("coding in lap");
    }
}
class  Demo{
    public static void main(String args[]){
        Developer d=new Developer();
        Computer c1=new Des();
        Computer c2=new lap();
        d.code(c1);//here the output will be coding in des 
        d.code(c2);//this will be coding in lap
        //here the depencies of class Developer on Des and lap has gone
        //because we used Computer as parent class for both of them 
        //by implementing the same method

        last l=new last();
        l.age();
        l.name();

    }
}

//one class implementing multiple interfaces

interface first{
   void name();
}
interface second{
    void age();
}
class last implements first,second{
   public void name(){
        System.out.println("name printed");
    }
   public void age(){
        System.out.println("age is printed");
    }
}