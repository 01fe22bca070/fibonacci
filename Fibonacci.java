public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci series of " + n + " numbers");
        int firstTerm = 0;
        int secondTerm = 1;
        for (int i = 1; i <= n; ++i) {
            
            int nextTerm = firstTerm + secondTerm;
            System.out.println("\t" + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}