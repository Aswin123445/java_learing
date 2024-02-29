class Demo{
    public static void main(String args[]){
        AddSub a=new AddSub();
        System.out.println(a.add(4, 05));//here add is inherited method from Add class
        //output will be 9
        //this is an example of single level ingeritance

        AddSubMult mullevel=new AddSubMult();
        System.out.println(mullevel.subtra(10, 5));//out put will be 5 this is an example of multilevel inheritance

    }
}
//in java we don't support muliple inheritance
class Add{
    public int add(int a,int b){//add is a parent class
        return a+b;
    }
}
class AddSub extends Add{
    public int subtra(int a,int b){


        return a-b;
    }
}
class AddSubMult extends AddSub{
    public int mul(int a ,int b){
        return a*b;
    }
}