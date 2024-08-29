import java.util.*;

public class tablesofnumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;

        //for (int i = 1; i <= 10 ; i++) {
        //    System.out.println(n * i);
        //}
        // while (i<=10){
        //     System.out.println(n*i);
        //     i = i + 1;
        // }
        do{
            System.out.println(n*i);
            i= i + 1;
        } while (i<=10);

    }
}
