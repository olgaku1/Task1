package by.epam.OlgaKulik.task01.t01.logic;

public class LastDigitCounter {
    public static int defineLastDigit(int number) {
        int lastDigitDeterminant = 10;
        return number % lastDigitDeterminant;
    }

    public static int defineLastDigitOfSquare(int num) {
        return defineLastDigit(defineLastDigit(num) * defineLastDigit(num));
    }
}
