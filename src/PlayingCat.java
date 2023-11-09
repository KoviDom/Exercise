public class PlayingCat {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(true, 30));
        System.out.println(isCatPlaying(true, 50));
        System.out.println(isCatPlaying(false, 10));
        System.out.println(isCatPlaying(false, 30));
        System.out.println(isCatPlaying(false, 50));

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        return ((summer) && (temperature >= 25 && temperature <= 45)) ||
                ((!summer) && (temperature >= 25 && temperature <= 35));

//        return ((summer == true) && (temperature >= 25 && temperature <= 45)) ||
//                ((summer == false) && (temperature >= 25 && temperature <= 35));

//        int max = summer ? 45 : 35;
//        return temperature >= 25 && temperature <= max;
    }

}
