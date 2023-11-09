public class PrimitivniChallenge {

    public static void main(String[] args) {

        byte byteValue = 10;
        short shortValue = 25;
        int intNumber = 1000;
        long longTotal = 50000L + 10L * (byteValue + shortValue + intNumber);

        System.out.println(longTotal);

    }

}
