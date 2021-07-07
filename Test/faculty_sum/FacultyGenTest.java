package faculty_sum;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FacultyGenTest {

    private FacultyGen testGen;
    private SumGen testSum;

    @Test
    public void fs() {
        testGen = new FacultyGen(5);
        assertEquals("Faculty of 5" , testGen.calcFaculty(5), 120);
        assertEquals("Faculty of 0" , testGen.calcFaculty(0), 1);
    }

    @Test
    public void fss() {
        testSum = new SumGen(5);
        assertEquals("Checksum of 5", testSum.calcSum(5), 15);
        assertEquals("Checksum of 0", testSum.calcSum(0), 0);
    }
}