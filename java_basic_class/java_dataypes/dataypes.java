class  datatype{
        public static void main(String args[])    {
            //checking int type
            int a=1;
            System.out.println(a);//output 1
            System.out.println(a+1);//output 2
            System.out.println(Integer.SIZE);//output 32 indicating bits

            //checking byte type
            byte by=12;
            System.out.println(by);//output 12
           // byte by1=300;
           // System.out.println(by1);//getting error 

           //checking short type
           short sho=2;
           System.out.println(sho);
           System.out.println(Short.SIZE);//output 16 byte

           //checking long type
           long lo=23l;
           System.out.println(lo);//giving output 23 even with l or wihtout l

           //checking float type
           //in java floating point numbers implicitly considered as double so we should add f to make it as float
          // float f1=12.34;//getting error because there is no f;
           float f2=234.444f;
           System.out.println(/*f1+*/f2);//add the to value 

           //checking double type
           double dub=12.344454444;
           System.out.println(dub);

           //checking char type 
           char cha='a';
           //char cha1="aswin";getting error because given value is String 
           System.out.println(cha);//output a
          // System.out.println(cha1);

          //chdcking boolean data type
        //   boolean boo=true;
        //   boolean boo1=false;
         // boolean err=0;
          //boolean err1=1;these two lines because boolean only have 2 values that is eidher true or false
        }
}