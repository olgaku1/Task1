package by.epam.OlgaKulik.task01.t05.logic;

public class LogicDeterminant {
    public static boolean isPerfectNumber(int num) {
        int sumOfDivisors = 0;
        int divisorByHalf = 2;
        for (int i = 1; i < num / divisorByHalf + 1; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }
        return (sumOfDivisors == num);
    }

}
