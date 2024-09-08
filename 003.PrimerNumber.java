import java.io.*;
import java.util.Scanner;

public class 003. PrimerNumber {
    public static void main(String[] args) {
        int n, i, res;
        boolean flag = true;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a no.");
        n = scan.nextInt();
        for (i = 2; i <= n / 2; i++) {
            res = n % i;
            if (res == 0) {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println(n + " is a  prime no.");
        else
            System.out.println(n+" is not a prime no.");
    }
}

/*
Output1:

Enter a no.
5
5 is a  prime no.

Output2:

Enter a no.
8
8 is not a prime no.
*/