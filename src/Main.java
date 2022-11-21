public class Main {

    public static double largest(double a, double b, double c)
    {
        double largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        return largest;
    }

    public static double smallest(double a, double b, double c)
    {
        double smallest = c < (a < b ? a : b) ? c : ((a < b) ? a : b);
        return smallest;
    }
    public static void main(String[] args) {
        System.out.println("check number");
    }
}