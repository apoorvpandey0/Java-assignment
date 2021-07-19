public class Q3 {
    // Program to demonstrate function overloading using average
    public static void main(String[] args) {
    // call average
    System.out.println(average(3, 10,20,30));
    System.out.println(average(3, 10.0,20.0,30.0));
        
    }

    // Function to calculate avegare of n integers
    public static int average(int n, int... nums) {
        System.out.println("I'm in integer version");
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return sum / n;
    }
    // Function to calculate avegare of n double values
        public static double average(int n, double... nums) {
        System.out.println("I'm in double version");
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }
        return sum / n;
    }
}
    

