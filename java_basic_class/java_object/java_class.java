 class Add{
     int addNumers(int n1,int n2){
        return n1+n2;
    }
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

    
    }
    

}


