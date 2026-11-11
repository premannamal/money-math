import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimal1 {
    float floatVariable;
    double doubleVariable;
    BigDecimal bigDecimalVariable;

    public BigDecimal1() {
        this.floatVariable = 0.0f;
        this.doubleVariable = 0.0;

    }

    public static void main (String[] args) {

        float floatVariable = 0.0f;
        double doubleVariable = 0.0;
        //BigDecimal bigDecimalVariable = new BigDecimal("0.0");
        BigDecimal bigDecimalVariable = BigDecimal.ZERO;
        int i;
        for(i=1;i<11;i = i+1) {
            floatVariable = floatVariable + 0.10f;
            doubleVariable = doubleVariable + 0.10;
            bigDecimalVariable = bigDecimalVariable.add(BigDecimal.valueOf(0.10));
        }

    }
}
