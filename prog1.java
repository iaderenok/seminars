import java.util.Scanner;
public class prog1 {
    static long factorialUsingForLoop(int n) {
        long fact = 1;
        int t = (n * (n+1))/2;
        System.out.println(t);
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String args[]){
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        number = scan.nextInt();
        System.out.println(factorialUsingForLoop(number));
    }
} 