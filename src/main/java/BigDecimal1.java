import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal1 {
    /*float floatVariable;
    double doubleVariable;
    BigDecimal bigDecimalVariable;*/

    public static void main(String[] args) {

        float floatVariable = 0.0f;
        double doubleVariable = 0.0;
        //BigDecimal bigDecimalVariable = new BigDecimal("0.0");
        BigDecimal bigDecimalVariable = BigDecimal.ZERO;
        bigDecimalVariable.setScale(2, RoundingMode.HALF_UP);
        int i;

        //first loop with 10 iterations
        for (i = 1; i < 11; i = i + 1) {
            floatVariable = floatVariable + 0.10f;
            doubleVariable = doubleVariable + 0.10;
            bigDecimalVariable = bigDecimalVariable.add(BigDecimal.valueOf(0.10));
            System.out.println(floatVariable);
            System.out.println(doubleVariable);
            System.out.println(bigDecimalVariable);
            System.out.println("------");
        }

        floatVariable = 0.0f;
        doubleVariable = 0.0;
        bigDecimalVariable = BigDecimal.ZERO;

        //second loop with 1000 iterations
        for (i = 1; i < 1001; i = i + 1) {
            floatVariable = floatVariable + 19.99f;
            doubleVariable = doubleVariable + 19.99;
            bigDecimalVariable = bigDecimalVariable.add(BigDecimal.valueOf(19.99));
        }

        System.out.println(floatVariable);
        System.out.println(doubleVariable);
        System.out.println(bigDecimalVariable);
        System.out.println("-----------------------------------------------");
        System.out.println("    ***** SUMMARY  *****   ");
        System.out.println("Float is off 0.184 cents");
        System.out.println("Double is off 0.000000000135 cents");
        System.out.println("Neither float nor double can represent 0.1 exactly in binary, so money should be Big Decimal");
        System.out.println("BigDecimal is accurate");
        System.out.println("Since BigDecimal is not an integer, it prints 1 as 1.00.");
        System.out.println("If I call BigDecimal with .add() without assigning the result back to the variable, the value of the bigDecimal variable does not change.");
    }

}

