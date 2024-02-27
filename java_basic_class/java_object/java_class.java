 class Add{
     int addNumers(int n1,int n2){
        return n1+n2;
    }
}
class Emp{
    String name;
    int salary;
    int age;
}
//class to find the area of circle
//a class contains datas and methods that work on this data
class Area_circle{
    float pi=3.14f;//this is what an object knows
    float area(float radius){
        float area=radius*pi*radius;
        return area;
    }//this is what is an object does
}

  class Classeg{
    public static void main(String args[]){
        int num1=2,num2=5;
      Add name= new Add();
    int no=name.addNumers(num1,num2);
    System.out.println(no);    //output for the above code is 7
     
    Area_circle area=new Area_circle();
    float ans=area.area(3);
    System.out.println(ans);//out put will 28.26
    Emp emp=new Emp();
    emp.name="aswin";
    emp.salary=300;
    emp.age=22;
     Emp emp1=new Emp();
    emp1.name="arun";
    emp1.salary=400;
    emp1.age=32;
     Emp emp2=new Emp();
    emp2.name="madhu";
    emp2.salary=500;
    emp2.age=29;

    //creating an array of object Emp
    Emp employee[]=new Emp[3];
    employee[0]=emp;
    employee[1]=emp1;
    employee[2]=emp2;
    //enhanced for loop
     for(Emp e:employee){
        System.out.println(e.name+" :"+e.age);
     }
    }
    

}


