import java.util.Scanner;
public class Exercise3 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please enter the number of Seconds: ");

        int sec = sc.nextInt();

        System.out.print(sec+" seconds = ");

        int hour = sec / 3600;
        sec %= 3600;                //one way of doing this
        int min = sec / 60;
        sec -= min*60;              //the other way of doing this

        System.out.print(hour +" hours, "+min+" minutes, and "+sec+" seconds");
    }
}
