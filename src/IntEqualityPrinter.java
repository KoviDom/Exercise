public class IntEqualityPrinter {

    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(1,2,3);
        printEqual(-1,0,1);
        printEqual(-1,-1,-2);
        printEqual(10,5,6);
        printEqual(0,2,0);
    }

    public static void printEqual(int x, int y, int z) {

        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid Value");
        } else if((y == z) && (x == z)) {
            System.out.println("All numbers are equal");
        } else if((x != y) && (y != z) && (x != z)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }

}
