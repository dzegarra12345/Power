import java.util.Scanner;

public class Power {

    public static void main(String[] args) {

        int n, p, r = 1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        n = sc.nextInt();

        System.out.println("Enter Power: ");
        p = sc.nextInt();

        // number to the 0 power is 1 //
        if (n >= 0 && p == 0) {
            r = 1;
            // 0 to the power of anything is 0 //
        } else if (n == 0 && p >= 1) {
            r = 0;
        } else {
            // 1 * 5 = 5, 5 * 5 = 25, 25 * 5 = 125, 125 * 5 = 625 //
            // i in this case is r //
            for (int i = 1; i <= p; i++) {
                r = r * n;
            }
        }

        System.out.println(n + "^" + p + " = " + r);
    }
}