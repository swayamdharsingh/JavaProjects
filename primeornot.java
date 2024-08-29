import java.util.Scanner;

public class primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;

        for (int i = 2 ; i < n ; i++ ){                 // u can use i <= n/2 as well
            if ( n % i == 0){
                isPrime = false;
                break;
            }

        }
        
        if (isPrime){
            if ( n==1 ) {
                System.out.println("it is neither prime nor composite number");
            } else if (n<=0) {
                System.out.println("invalid");
            } else {
                System.out.println("it is a prime number");
            }
        } else {
            System.out.println("it is a composite number");
        }
    }
}
