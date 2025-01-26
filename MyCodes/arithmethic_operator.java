
package MyCodes;
import java.util.Scanner;
class arithmetic_operator {
    @SuppressWarnings("resource")
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        double a, b;
        System.out.println("enter number ");
        a = in.nextInt();
        b = in.nextInt();
        System.out.println("a+b = " + (a + b));
        System.out.println("a-b = " + (a - b));
        System.out.println("a*b = " + (a * b));
        System.out.println("a/b = " + (a / b));
        System.out.println("a%b = " + (a % b));
    }
}