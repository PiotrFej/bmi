import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;

public class BMIcalculatorTest {

    private BMIcalculator bmIcalculator;
    private static final double DELTA = 1e-2;

    /*@Before
    public void setup(){
        bmIcalculator = new BMIcalculator();
    }*/

    @Test
    public void bmi_for_heigh_180cm_weigh_79kg(){
        double weigh = 79;
        double heigh = 1.80;
        double expectedBMI = 24.38;

        assertEquals(expectedBMI, new BMIcalculator(weigh, heigh).calculate(), DELTA);
    }

    @Test
    public void bmi_for_heigh_200cm_weigh_300kg(){
        double weigh = 300;
        double heigh = 2.0;
        double expectedBMI = 75;

        assertEquals(expectedBMI, new BMIcalculator(weigh, heigh).calculate(), DELTA);
    }

    @Test
    public void interpret_for_bmi_20(){

    }
}
