public class SecondAndMinutesChallenge {

    public static void main(String[] args) {

        System.out.println(getDurationString(-3945)); // 1 test
        System.out.println(getDurationString(-65,40)); // 2 test
        System.out.println(getDurationString(65,145));
        System.out.println(getDurationString(65,40));
        System.out.println(getDurationString(3945));

    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return "Invalid data for seconds(" + seconds + "), must be positive integer value.";
        } else {
            int minutes = seconds / 60;
//        int hours = minutes / 60;
//        int remainingMinutes = minutes % 60;
//        int remainingSeconds = seconds % 60;
//
//        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s";
            return getDurationString(minutes,seconds % 60);
        }
    }

    public static String getDurationString(int minutes, int seconds) {

        if (minutes < 0) {
            return "Invalid data for seconds(" + minutes + "), must be positive integer value.";
        }

        if (seconds <= 0 || seconds >= 59) {
            return "Invalid data for seconds(" + seconds + "), must be between 0 and 59.";
        }

        int hours = minutes / 60;
//        System.out.println("hours = " + hours);

        int remainingMinutes = minutes % 60;
//        System.out.println("minutes = " + minutes);
//        System.out.println("remainingMinutes = " + remainingMinutes);

//        int remainingSeconds = seconds % 60;
//        System.out.println("remainingSeconds = " + remainingSeconds);

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }

}
