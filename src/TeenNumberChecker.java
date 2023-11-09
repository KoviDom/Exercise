public class TeenNumberChecker {

    public static void main(String[] args) {

        int first = 9;
        int second = 99;
        int third = 19;

        System.out.println(hasTeen(first, second, third));
        System.out.println(isTeen(second));

    }

//    public static boolean hasTeen(int first,int second,int third) {
//
//        if (first >= 13 && first <= 19 || second >= 13 && second <= 19 || third >= 13 && third <= 19) {
//            return true;
//        } else{
//            return false;
//        }
//
//    }
//
//    public static boolean isTeen(int value) {
//
//        if(value >= 13 && value <= 19) {
//            return true;
//        } else{
//            return false;
//        }
//
//    }

    public static boolean hasTeen(int first, int second, int third) {
        return isTeen(first) || isTeen(second) || isTeen(third);
    }

    public static boolean isTeen(int value) {
        return value > 12 && value < 20;
    }

}
