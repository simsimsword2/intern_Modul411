package minMax;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExtremaCalculatorTest {

    ExtremaCalculator minmax1;


    @Test
    public void getMax() {
        int[] list = new int[]{1234, 2, 5, 8, 3, 9, 34, 0, -2, 0, -2};
        minmax1 = new ExtremaCalculator();
        assertEquals("Max is", minmax1.getMax(list), 1234);
    }

    @Test
    public void getMin() {
        int[] list = new int[]{1234, 2, 5, 8, 3, 9, 34, 0, -2, 0, -2};
        minmax1 = new ExtremaCalculator();
        assertEquals("Min is", minmax1.getMin(list), -2);
    }
}