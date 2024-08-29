import java.util.*;

public class calculator {
    
    public static void main(String[] args) {

        
        Scanner scanner = new Scanner(System.in);
        //inputs
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int operator = scanner.nextInt();

        /**
         * 1 = addition
         * 2 = subtraction
         * 3 = multiplication
         * 4 = division
         * 5 = remainder
         */



        switch (operator) {
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : if (b==0) {
                System.out.println("Invalid Division");
            } else { 
                System.out.println(a/b);
            }
            break;
            case 5 : if (b==0) {
                System.out.println("Invalid Division");
            } else {
                System.out.println(a%b);
            }
            break;
            default : System.out.println("Invalid operator");
        }
    }
}
