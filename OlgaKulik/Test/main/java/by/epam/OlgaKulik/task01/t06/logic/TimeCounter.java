package by.epam.OlgaKulik.task01.t06.logic;


public class TimeCounter {
    public static int countCompleteHours(int time) {
        int numOfSecInHour = 3600;
        return time / numOfSecInHour;
    }

    public static int countCompleteMinutes(int time) {
        int numOfSecInHour = 3600;
        int numOfSecInMin = 60;
        return time % numOfSecInHour / numOfSecInMin;
    }

    public static int countRemainingSeconds(int time) {
        int numOfSecInHour = 3600;
        int numOfSecInMin = 60;
        return time % numOfSecInHour % numOfSecInMin;
    }
}
