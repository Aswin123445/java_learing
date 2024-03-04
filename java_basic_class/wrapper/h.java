class hel{
    public static void main(String args[]){
        int a=10;
        Integer obj=a;//this is an example of autoboxing
        System.out.println(obj.intValue());
        int num=obj;//this is autounboxing
        System.out.println(num);
    }
}