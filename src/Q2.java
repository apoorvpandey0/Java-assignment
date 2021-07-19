public class Q2 {
    // Write a program to calculate addition of two number using prototyping of methods.
    public static void main(String[] args) {
        Q2 q2 = new Q2();
        int a = 10;
        int b = 20;
        int sum = q2.add(a, b);
        System.out.println(sum);
    }
    

    private int add(int a, int b) {
        return a+b;
    }
        
    }

