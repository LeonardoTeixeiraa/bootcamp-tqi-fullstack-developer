package variablesDataType.casting;

public class Main {
    public static void main(String[] args) {

//        Down casting example, Short to Byte
        byte b1;
        short s1 = 1000;
        b1 = (byte) s1;

//        Upcasting example, long to int
        long l1;
        int i1 = 10;
        l1 = i1;

//      Downcasting example, long to int
        int i2;
        long l2 = 10000000000000000L;
        i2 = (int) l2;

//      Upcasting example, float to int
        double d1;
        float f1 = 10.5f;
        d1 = f1;

//        Downcasting example,  double to float without loss of information
        double d2 = 10000.58d;
        float f2;
        f2 = (float) d2;

        System.out.println("b1: " + b1);
        System.out.println("l1: " + i1);
        System.out.println("i2: " + i2);
        System.out.println("d1: " + d1);
        System.out.println("f2: " + f2);
    }
}
