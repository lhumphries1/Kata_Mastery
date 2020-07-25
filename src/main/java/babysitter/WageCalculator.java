package babysitter;

public class WageCalculator {
    public int calculateShiftWage(int startingHour, int endingHour, int bedtime) {
        return 0;
    }

    public int convertTime(int inputTime) {

        if (inputTime <= 23 && inputTime >= 17) {
            return inputTime - 17;
        } else {
            return inputTime + 7;
        }

    }


    public int calculateHoursFromStartShiftToBedTime(int startingHour, int endingHour, int bedtime) {
        if (endingHour < bedtime) {
            return endingHour - startingHour;
        } else {
            int workedHours = bedtime - startingHour;
            if (workedHours < 0) {
                return 0;
            } else {
                return workedHours;
            }
        }


    }
}
