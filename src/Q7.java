// Program to demonstrate implementation of an interface which contains two methods declaration square and cube.
public interface Q7 {
    int square(int x);
    int cube(int x);
}

// call square and cube
class Q7Impl implements Q7 {
    public int square(int x) {
        return x*x;
    }
    public int cube(int x) {
        return x*x*x;
    }
    public static void main(String[] args) {
        // call square and cube
        Q7 q7 = new Q7Impl();
        System.out.println("square of 10 is " + q7.square(10));
        System.out.println("cube of 10 is " + q7.cube(10));
    }
}
