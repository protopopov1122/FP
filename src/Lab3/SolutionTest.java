package Lab3;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    private void testSuperDigitFor(int number, int superDigit) throws Exception {
        assertEquals(Solution.superDigit(number), superDigit);
    }

    private void testPowerSumFor(int number, int power, int count) throws Exception {
        assertEquals(Solution.powerSum(number, power), count);
    }

    @Test
    public void testSuperDigitFor9875() throws Exception {
        testSuperDigitFor(9875, 2);
    }

    @Test
    public void testSuperDigitFor1547() throws  Exception {
        testSuperDigitFor(1547, 8);
    }

    @Test
    public void testSuperDigitFor9999() throws  Exception {
        testSuperDigitFor(9999, 9);
    }

    @Test
    public void testSuperDigitFor983() throws Exception {
        testSuperDigitFor(983, 2);
    }

    @Test
    public void testSuperDigitFor5() throws Exception {
        testSuperDigitFor(5, 5);
    }

    @Test
    public void testSuperDigitFor0() throws Exception {
        testSuperDigitFor(0, 0);
    }

    @Test
    public void testSuperDigitFor1234() throws Exception {
        testSuperDigitFor(1234, 1);
    }

    @Test
    public void testSuperDigitFor4321() throws Exception {
        testSuperDigitFor(4321, 1);
    }

    @Test
    public void testPowerSumFor100_2() throws Exception {
        testPowerSumFor(100, 2, 3);
    }

    @Test
    public void testPowerSumFor100_3() throws Exception {
        testPowerSumFor(100, 3, 1);
    }

    @Test
    public void testPowerSumFor13_2() throws Exception {
        testPowerSumFor(13, 2, 1);
    }

    @Test
    public void testPowerSumFor10_2() throws Exception {
        testPowerSumFor(10, 2, 1);
    }

    @Test
    public void testPowerSumFor7_2() throws Exception {
        testPowerSumFor(7, 2, 0);
    }

    @Test
    public void testPowerSumFor17_4() throws Exception {
        testPowerSumFor(17, 4, 1);
    }
}
