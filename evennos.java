import java.util.*;

public class evennos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; 2*i <= n; i++ ) {
            System.out.println(2*i);
        }
    }
}
