package by.epam.OlgaKulik.task01.t01.logic;

import org.junit.Assert;
import org.junit.Test;


public class LastDigitCounterTest {
    @Test
    public void testDefineLastDigitIn27Is7() {
        int actualResult = LastDigitCounter.defineLastDigit(27);
        int expectedResult = 7;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testDefineLastDigitOfSqr27Is9() {
        int actualResult = LastDigitCounter.defineLastDigitOfSquare(27);
        int expectedResult = 9;
        Assert.assertEquals(actualResult, expectedResult);
    }

}