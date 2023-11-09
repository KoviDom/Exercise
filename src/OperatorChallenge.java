public class OperatorChallenge {

    public static void main(String[] args) {

        double firstVariable = 20.00d;
        double secondVariable = 80.00d;
        double valueTotal = firstVariable + secondVariable * 100.00d;
        System.out.println("ValueTotal = " + valueTotal);
        double remainderValue = valueTotal % 40.00d;
        System.out.println("Remainder = " + remainderValue);
        boolean noRemainder = (remainderValue == 0) ? true : false;
        System.out.println("isNoReminder = " + noRemainder);
        if (noRemainder != true) {

            System.out.println("Got some remainder");

        }

        /*if (!noRemainder) {

            System.out.println("Got some remainder");

        }*/

    }

}
