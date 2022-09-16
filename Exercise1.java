import java.util.Scanner;
public class Exercise1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please Enter Temperature in Celsius: ");
        double c = sc.nextDouble();
        double f = c*9.0/5.0;
        f += 32;
        System.out.println(c + " Celsius = " + f + " Fahrenheit");
    }
}
