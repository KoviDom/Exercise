public class NumberInWord {

    public static void main(String[] args) {

        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(10);

    }

    public static void printNumberInWord(int number) {

        //my coding
        String numberInWord = switch(number) {

            case 0 -> "ZERO";
            case 1 -> "ONE";
            case 2 -> "TWO";
            case 3 -> "THREE";
            case 4 -> "FOUR";
            case 5 -> "FIVE";
            case 6 -> "SIX";
            case 7 -> "SEVEN";
            case 8 -> "EIGHT";
            case 9 -> "NINE";
            default -> "OTHER";

        };
        System.out.println(numberInWord);

    }

    //my coding2
//    public static void printNumberInWord(int number) {
//
//        switch(number) {
//
//            case 0 -> System.out.println("ZERO");
//            case 1 -> System.out.println("ONE");
//            case 2 -> System.out.println("TWO");
//            case 3 -> System.out.println("THREE");
//            case 4 -> System.out.println("FOUR");
//            case 5 -> System.out.println("FIVE");
//            case 6 -> System.out.println("SIX");
//            case 7 -> System.out.println("SEVEN");
//            case 8 -> System.out.println("EIGHT");
//            case 9 -> System.out.println("NINE");
//            default -> System.out.println("OTHER");
//
//        }
//
//    }

//    public static void printNumberInWord(int number) {
//
//        String numberInWord;
//        switch (number) {
//            case 0 -> numberInWord = "ZERO";
//            case 1 -> numberInWord = "ONE";
//            case 2 -> numberInWord = "TWO";
//            case 3 -> numberInWord = "THREE";
//            case 4 -> numberInWord = "FOUR";
//            case 5 -> numberInWord = "FIVE";
//            case 6 -> numberInWord = "SIX";
//            case 7 -> numberInWord = "SEVEN";
//            case 8 -> numberInWord = "EIGHT";
//            case 9 -> numberInWord = "NINE";
//            default -> numberInWord = "OTHER";
//        }
//        System.out.println(numberInWord);
//    }

}
