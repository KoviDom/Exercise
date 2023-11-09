public class EqualSumChecker {

    public static void main(String[] args) {

        int first = 1;
        int second = 2;
        int third = 3;

        System.out.println(hasEqualSum(first,second,third));

    }

    public static boolean hasEqualSum(int first,int second,int third) {

//        if (first + second == third) {
//            return true;
//        } else {
//            return false;
//        }

        return (first + second) == third;

    }

}
