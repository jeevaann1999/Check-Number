import java.util.Scanner;

public class Main {
    public static double largest()
    {
        int a, b, c, largest, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        temp=a>b?a:b;
        largest=c>temp?c:temp;
        System.out.println("The largest number is: "+largest);
        return largest;
    }

    public static void smallest()
    {
        int a, b, c, smallest, temp;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();
        System.out.println("Enter the second number:");
        b = sc.nextInt();
        System.out.println("Enter the third number:");
        c = sc.nextInt();
        temp = a > b ? b : a;
        smallest = c > temp ? temp : c;
        System.out.println("The smallest number is: " + smallest);
    }

    public static double prime() {
        int i, n = 0, m = 0, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number to check:");
        n = sc.nextInt();
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " not a prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " not a prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is a prime number");
            }
        }
        return flag;
    }

    public static void EvenOrOdd() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = reader.nextInt();
        if (num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }

    public static void main(String[] args)
    {
        System.out.println("check number");
    }
}



