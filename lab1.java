package com.company;

import java.io.PrintStream;
import java.util.Scanner;

import static java.lang.Integer.max;

public class Main {
    public static long fact (int N) {
        long rez = 1;
        for (long it = 2; it <= N; ++it)
            rez *= it;
        return rez;
    }
    public static boolean prime_test (int N) {
        if (N < 2) return false;
        for (int d = 2; d < N; ++d)
            if (N % d == 0)
                return false;
        return true;
    }
    public static long power (int a, int b){
        long rez = 1;
        for (int it = 0; it < b; ++it)
            rez *= a;
        return rez;
    }
    public static int fibonacci (int N) {
        if (N < 2) return 1;
        int x = 1, y = 1, z = 2;
        for (int it = 2; it < N; ++it){
            x = y; y = z; z = y + x;
        }
        return z;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        PrintStream output = new PrintStream(System.out);
        ///task 1
        output.print ("Task 1) Introducecti n pentru primul task : ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i += 2)
            output.println(i);

        ///task 2
        output.println ("Task 2) Introduceti a si b pentru task-ul 2 : ");
        int a = sc.nextInt(), b = sc.nextInt();
        output.println ("Numarul mai mare este : " + max(a, b));

        ///task 3
        output.print ("Task 3) Introduceti n pentru task-ul 3 : ");
        n = sc.nextInt();
        output.print ("Divizorii sai sunt : 1");
        for (int i = 2; i <= n; ++i)
            if (n % i == 0)
                output.print (", " + i);

        ///task 4
        output.print ("\nTask 4) Introduceti n pentru task-ul 4 : ");
        n = sc.nextInt();
        output.println ("\nFactorialul lui " + n + " este " + fact(n));

        ///task 5
        output.print ("Task 5) Introduceti n pentru task-ul 5 : ");
        n = sc.nextInt();
        output.println(prime_test(n));

        ///task 6
        output.print ("Task 6) Introduceti a si b pentru task-ul 6 : ");
        a = sc.nextInt(); b = sc.nextInt();
        output.println (power (a, b));

        ///task 7
        output.print ("Task 7) Introduceti n pentru task-ul 7 : ");
        n = sc.nextInt();
        output.println ("Termenul numarul " + n + " din sirul lui Fibonacci este " + fibonacci(n));
    }
}
