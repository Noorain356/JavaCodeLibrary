package MyCodes;

import java.util.Scanner;

public class assignment_operator {
     public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        int x, y;

        System.out.println("enter x");
        x = in.nextInt();
        System.out.println("enter y");
        y = in.nextInt();

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        int m = x++;
        int z = ++x;
        System.out.println("m = " + m);
        System.out.println("z = " + z);
        System.out.println("x+y = " + (x += y));
        System.out.println("x-y = " + (x -= y));
        System.out.println("x*y = " + (x *= y));
        System.out.println("x/y = " + (x /= y));
    }

}
