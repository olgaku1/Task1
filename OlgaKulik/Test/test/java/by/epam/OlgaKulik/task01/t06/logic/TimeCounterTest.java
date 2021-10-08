package by.epam.OlgaKulik.task01.t06.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TimeCounterTest {
    @Test
    public void testCountCompleteHoursFrom8520SecIs2() {
        int actualResult = TimeCounter.countCompleteHours(8520);
        int expectedResult = 2;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountCompleteMinutesFrom17SecIs0() {
        int actualResult = TimeCounter.countCompleteMinutes(17);
        int expectedResult = 0;
        Assertions.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCountRemainingSecondsFrom123SecIs3() {
        int actualResult = TimeCounter.countRemainingSeconds(123);
        int expectedResult = 3;
        Assertions.assertEquals(actualResult, expectedResult);
    }
}