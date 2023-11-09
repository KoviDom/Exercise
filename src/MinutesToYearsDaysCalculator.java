public class MinutesToYearsDaysCalculator {

    public static void main(String[] args) {

        printYearsAndDays(525600);
        printYearsAndDays(1554545);

    }

    public static void printYearsAndDays(long minutes) {

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {

            int days = (int)minutes/(24*60);
            int years = days/365;
            days=days%365;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }

    }

}
