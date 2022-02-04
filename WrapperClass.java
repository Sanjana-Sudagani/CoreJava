public class WrapperClass{
    public static void main(String args[]) {
        //Boxing example of int to Integer
//Converting int into Integer
        int a = 20;
        Integer i = Integer.valueOf(a);//converting int into Integer explicitly
        Integer j = a;//autoboxing, now compiler will write Integer.valueOf(a) internally

        System.out.println(a + " " + i + " " + j);

//Unboxing example of Integer to int
//Converting Integer to int
        //Integer b = new Integer(3);
       // int k = a.intValue();//converting Integer to int explicitly
        //int l = a;//unboxing, now compiler will write a.intValue() internally

        //System.out.println(b + " " + k + " " + l);
    }}
