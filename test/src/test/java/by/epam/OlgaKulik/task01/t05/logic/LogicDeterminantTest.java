package by.epam.OlgaKulik.task01.t05.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class LogicDeterminantTest {
    @ParameterizedTest
    @ValueSource(ints = {18, 7, 148})
    public void test18IsPerfectNumberFalse(int num) {
        boolean actualResult = LogicDeterminant.isPerfectNumber(num);
        Assertions.assertFalse(actualResult);
    }
}