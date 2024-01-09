public class NumberOfDaysInMonth {

    public static void main(String[] args) {

        System.out.println(isLeapYear(-5000));
        System.out.println(isLeapYear(2452));
        System.out.println(getDaysInMonth(5,1256));
        System.out.println(getDaysInMonth(2,2000));
        System.out.println(getDaysInMonth(2,2018));
        System.out.println(getDaysInMonth(-1,2018));
        System.out.println(getDaysInMonth(4,2018));
        System.out.println(getDaysInMonth(4,-2018));

    }

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9_999) {
            return false;
        }
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 ==0));

    }

    public static int getDaysInMonth(int month, int year) {

        if (year < 1 || year > 9_999) {
            return -1;
        }

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;  // for any of the following months, return 31
            case 2 -> isLeapYear(year) ? 29 : 28; // if it's February, determine if it's a leap year first, then return either 28 or 29.
            case 4, 6, 9, 11 -> 30; // return 30 for the following months
            default -> -1; // return -1 if the month parameter is not between 1 and 12.
        };

    }

}
