import java.util.Scanner;
public class Exercise2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Please input 3 different values representing the Hour, Minute, and Second \nPress \"enter\" after each number");
        System.out.println("Please enter the Hour: ");
        int hour = sc.nextInt();
        System.out.println("Please enter the Minute: ");
        int min = sc.nextInt();
        System.out.println("Please enter the Second: ");
        int sec = sc.nextInt();

        int secMidnight = hour * 3600;
        secMidnight += min*60;
        secMidnight += sec;
        System.out.println("It is "+secMidnight+" seconds since Midnight");

        int secDay = 86400 - secMidnight;
        System.out.println("There is "+secDay+" seconds remaining in the day");

        double percentDay = secMidnight/86400.0;
        percentDay *= 1000;
        percentDay = (long) percentDay;
        percentDay /= 10;
        System.out.println(percentDay + "% of the day have passed");
    }
}
