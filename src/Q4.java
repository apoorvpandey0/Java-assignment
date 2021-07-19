
// Program to demonstrating overloaded constructor


public class Q4 {

    
    public static void main(String[] args) {
        int intVar = 5;
        double doubleVar = 10.0d;
        byte byteVar = 10;           // Byte variable -128 to +127
        short shortVar = 10;         // Short variable
        long longVar = 1500000000L;  // Long variable
        float floatVar = 5.99f;    // Floating point number

        Q4 q4 = new Q4( intVar);
        q4 = new Q4(doubleVar);
        q4 = new Q4(longVar);
        q4 = new Q4(floatVar);
        q4 = new Q4(shortVar);
        q4 = new Q4(byteVar);
    
    }
    
    public Q4(int i) {
        System.out.print("I'm in integer version\n");
        value = i;
    }
    
    public Q4(double d) {
        System.out.print("I'm in double version\n");
        value = (int)d;
    }
    
    public Q4(long l) {
        System.out.print("I'm in long version\n");
        value = (int)l;
    }
    
    public Q4(float f) {
        System.out.print("I'm in float version\n");
        value = (int)f;
    }
    
    public Q4(short s) {
        System.out.print("I'm in short version\n");
        value = (int)s;
    }
    
    public Q4(byte b) {
        System.out.print("I'm in byte version\n");
        value = (int)b;
    }
    
    public int value;
}
 
