import java.util.*;

public class patern2 {

    public static void main(String[] args) {
        
        int n= 4;

        for(int i=1; i<=n ; i++){
            for (int j=1 ; j<=i  ; j++) {
                System.out.print("*");
            }
            for ( int j=2*(n-1); j>=2*i-1; j--) {
                System.out.print(" ");
            }
            // for ( int j=n-1; j>=i; j--) {
            //     System.out.print(" ");
            // }
            for (int j=1 ; j<=i  ; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i=1; i<=n ; i++){
            for (int j=n ; j>=i  ; j--) {
                System.out.print("*");
            }
            for ( int j=2*(n-1); j>2*(n-i); j--) {
                System.out.print(" ");
            }
            // for ( int j=n-1; j>n-i; j--) {
            //     System.out.print(" ");
            // }
            for (int j=n ; j>=i  ; j--) {
                System.out.print("*");
            }
        System.out.println();
        }
        
    }
    
}
